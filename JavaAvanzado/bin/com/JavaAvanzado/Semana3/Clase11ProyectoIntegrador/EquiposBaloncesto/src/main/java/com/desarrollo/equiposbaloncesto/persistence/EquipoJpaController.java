package com.desarrollo.equiposbaloncesto.persistence;

import com.desarrollo.equiposbaloncesto.models.Equipo;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.desarrollo.equiposbaloncesto.models.Partido;
import com.desarrollo.equiposbaloncesto.persistence.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EquipoJpaController implements Serializable {

    public EquipoJpaController(EntityManagerFactory emf) {
        this(emf, null);
    }

    public EquipoJpaController(EntityManagerFactory emf, Object par1) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public EquipoJpaController() {
        emf = Persistence.createEntityManagerFactory("equiposPU");
    }

    public void create(Equipo equipo) {
        if (equipo.getListaPartidos() == null) {
            equipo.setListaPartidos(new ArrayList<Partido>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Partido> attachedListaPartidos = new ArrayList<Partido>();
            for (Partido listaPartidosPartidoToAttach : equipo.getListaPartidos()) {
                listaPartidosPartidoToAttach = em.getReference(listaPartidosPartidoToAttach.getClass(), listaPartidosPartidoToAttach.getIdPartido());
                attachedListaPartidos.add(listaPartidosPartidoToAttach);
            }
            equipo.setListaPartidos(attachedListaPartidos);
            em.persist(equipo);
            for (Partido listaPartidosPartido : equipo.getListaPartidos()) {
                Equipo oldEquipoLocalOfListaPartidosPartido = listaPartidosPartido.getEquipoLocal();
                listaPartidosPartido.setEquipoLocal(equipo);
                listaPartidosPartido = em.merge(listaPartidosPartido);
                if (oldEquipoLocalOfListaPartidosPartido != null) {
                    oldEquipoLocalOfListaPartidosPartido.getListaPartidos().remove(listaPartidosPartido);
                    oldEquipoLocalOfListaPartidosPartido = em.merge(oldEquipoLocalOfListaPartidosPartido);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Equipo equipo) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Equipo persistentEquipo = em.find(Equipo.class, equipo.getIdEquipo());
            List<Partido> listaPartidosOld = persistentEquipo.getListaPartidos();
            List<Partido> listaPartidosNew = equipo.getListaPartidos();
            List<Partido> attachedListaPartidosNew = new ArrayList<Partido>();
            for (Partido listaPartidosNewPartidoToAttach : listaPartidosNew) {
                listaPartidosNewPartidoToAttach = em.getReference(listaPartidosNewPartidoToAttach.getClass(), listaPartidosNewPartidoToAttach.getIdPartido());
                attachedListaPartidosNew.add(listaPartidosNewPartidoToAttach);
            }
            listaPartidosNew = attachedListaPartidosNew;
            equipo.setListaPartidos(listaPartidosNew);
            equipo = em.merge(equipo);
            for (Partido listaPartidosOldPartido : listaPartidosOld) {
                if (!listaPartidosNew.contains(listaPartidosOldPartido)) {
                    listaPartidosOldPartido.setEquipoLocal(null);
                    listaPartidosOldPartido = em.merge(listaPartidosOldPartido);
                }
            }
            for (Partido listaPartidosNewPartido : listaPartidosNew) {
                if (!listaPartidosOld.contains(listaPartidosNewPartido)) {
                    Equipo oldEquipoLocalOfListaPartidosNewPartido = listaPartidosNewPartido.getEquipoLocal();
                    listaPartidosNewPartido.setEquipoLocal(equipo);
                    listaPartidosNewPartido = em.merge(listaPartidosNewPartido);
                    if (oldEquipoLocalOfListaPartidosNewPartido != null && !oldEquipoLocalOfListaPartidosNewPartido.equals(equipo)) {
                        oldEquipoLocalOfListaPartidosNewPartido.getListaPartidos().remove(listaPartidosNewPartido);
                        oldEquipoLocalOfListaPartidosNewPartido = em.merge(oldEquipoLocalOfListaPartidosNewPartido);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = equipo.getIdEquipo();
                if (findEquipo(id) == null) {
                    throw new NonexistentEntityException("The equipo with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Equipo equipo;
            try {
                equipo = em.getReference(Equipo.class, id);
                equipo.getIdEquipo();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The equipo with id " + id + " no longer exists.", enfe);
            }
            List<Partido> listaPartidos = equipo.getListaPartidos();
            for (Partido listaPartidosPartido : listaPartidos) {
                listaPartidosPartido.setEquipoLocal(null);
                listaPartidosPartido = em.merge(listaPartidosPartido);
            }
            em.remove(equipo);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Equipo> findEquipoEntities() {
        return findEquipoEntities(true, -1, -1);
    }

    public List<Equipo> findEquipoEntities(int maxResults, int firstResult) {
        return findEquipoEntities(false, maxResults, firstResult);
    }

    private List<Equipo> findEquipoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Equipo.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Equipo findEquipo(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Equipo.class, id);
        } finally {
            em.close();
        }
    }

    public int getEquipoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Equipo> rt = cq.from(Equipo.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

}
