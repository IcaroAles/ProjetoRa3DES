package dao;

import entidades.Categoria;

import javax.persistence.EntityManager;
import java.util.List;

public class CategoriaDAO {

    private EntityManager em;

    public CategoriaDAO(EntityManager em) {
        this.em = em;
    }

    public void salvar(Categoria categoria) {
        em.getTransaction().begin();
        em.persist(categoria);
        em.getTransaction().commit();
    }

    public Categoria buscarPorId(Long id) {
        return em.find(Categoria.class, id);
    }

    public List<Categoria> listarTodos() {
        return em.createQuery("SELECT c FROM Categoria c", Categoria.class).getResultList();
    }

    public void atualizar(Categoria categoria) {
        em.getTransaction().begin();
        em.merge(categoria);
        em.getTransaction().commit();
    }

    public void remover(Categoria categoria) {
        em.getTransaction().begin();
        em.remove(em.merge(categoria));
        em.getTransaction().commit();
    }
}
