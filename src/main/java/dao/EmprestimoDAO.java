package dao;

import entidades.Emprestimo;

import javax.persistence.EntityManager;
import java.util.List;

public class EmprestimoDAO {

    private EntityManager em;

    public EmprestimoDAO(EntityManager em) {
        this.em = em;
    }

    public void salvar(Emprestimo emprestimo) {
        em.getTransaction().begin();
        em.persist(emprestimo);
        em.getTransaction().commit();
    }

    public Emprestimo buscarPorId(Long id) {
        return em.find(Emprestimo.class, id);
    }

    public List<Emprestimo> listarTodos() {
        return em.createQuery("SELECT e FROM Emprestimo e", Emprestimo.class).getResultList();
    }

    public void atualizar(Emprestimo emprestimo) {
        em.getTransaction().begin();
        em.merge(emprestimo);
        em.getTransaction().commit();
    }

    public void remover(Emprestimo emprestimo) {
        em.getTransaction().begin();
        em.remove(em.merge(emprestimo));
        em.getTransaction().commit();
    }
}
