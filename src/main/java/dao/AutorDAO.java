package dao;

import entidades.Autor;

import javax.persistence.EntityManager;
import java.util.List;

public class AutorDAO {

    private EntityManager em;

    public AutorDAO(EntityManager em) {
        this.em = em;
    }

    public void salvar(Autor autor) {
        em.getTransaction().begin();
        em.persist(autor);
        em.getTransaction().commit();
    }

    public Autor buscarPorId(Long id) {
        return em.find(Autor.class, id);
    }

    public List<Autor> listarTodos() {
        return em.createQuery("SELECT a FROM Autor a", Autor.class).getResultList();
    }

    public void atualizar(Autor autor) {
        em.getTransaction().begin();
        em.merge(autor);
        em.getTransaction().commit();
    }

    public void remover(Autor autor) {
        em.getTransaction().begin();
        em.remove(em.merge(autor));
        em.getTransaction().commit();
    }
}
