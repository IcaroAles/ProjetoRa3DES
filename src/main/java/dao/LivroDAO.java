package dao;

import entidades.Livro;

import javax.persistence.EntityManager;
import java.util.List;

public class LivroDAO {

    private EntityManager em;

    public LivroDAO(EntityManager em) {
        this.em = em;
    }

    public void salvar(Livro livro) {
        em.getTransaction().begin();
        em.persist(livro);
        em.getTransaction().commit();
    }

    public Livro buscarPorId(Long id) {
        return em.find(Livro.class, id);
    }

    public List<Livro> listarTodos() {
        return em.createQuery("SELECT l FROM Livro l", Livro.class).getResultList();
    }

    public void atualizar(Livro livro) {
        em.getTransaction().begin();
        em.merge(livro);
        em.getTransaction().commit();
    }

    public void remover(Livro livro) {
        em.getTransaction().begin();
        em.remove(em.merge(livro));
        em.getTransaction().commit();
    }
}
