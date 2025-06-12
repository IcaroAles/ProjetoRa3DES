package dao;

import entidades.Editora;

import javax.persistence.EntityManager;
import java.util.List;

public class EditoraDAO {

    private EntityManager em;

    public EditoraDAO(EntityManager em) {
        this.em = em;
    }

    public void salvar(Editora editora) {
        em.getTransaction().begin();
        em.persist(editora);
        em.getTransaction().commit();
    }

    public Editora buscarPorId(Long id) {
        return em.find(Editora.class, id);
    }

    public List<Editora> listarTodos() {
        return em.createQuery("SELECT e FROM Editora e", Editora.class).getResultList();
    }

    public void atualizar(Editora editora) {
        em.getTransaction().begin();
        em.merge(editora);
        em.getTransaction().commit();
    }

    public void remover(Editora editora) {
        em.getTransaction().begin();
        em.remove(em.merge(editora));
        em.getTransaction().commit();
    }
}
