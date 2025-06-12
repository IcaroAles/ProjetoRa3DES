package dao;

import entidades.Funcionario;

import javax.persistence.EntityManager;
import java.util.List;

public class FuncionarioDAO {

    private EntityManager em;

    public FuncionarioDAO(EntityManager em) {
        this.em = em;
    }

    public void salvar(Funcionario funcionario) {
        em.getTransaction().begin();
        em.persist(funcionario);
        em.getTransaction().commit();
    }

    public Funcionario buscarPorId(Long id) {
        return em.find(Funcionario.class, id);
    }

    public List<Funcionario> listarTodos() {
        return em.createQuery("SELECT f FROM Funcionario f", Funcionario.class).getResultList();
    }

    public void atualizar(Funcionario funcionario) {
        em.getTransaction().begin();
        em.merge(funcionario);
        em.getTransaction().commit();
    }

    public void remover(Funcionario funcionario) {
        em.getTransaction().begin();
        em.remove(em.merge(funcionario));
        em.getTransaction().commit();
    }
}
