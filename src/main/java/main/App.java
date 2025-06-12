package main;

import dao.*;
import entidades.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Date;

public class App {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("BibliotecaPU");
        EntityManager em = emf.createEntityManager();

        // =======================
        // TESTE LIVRO
        // =======================
        Livro livro = new Livro();
        livro.setTitulo("Aventuras de Java");
        livro.setIsbn("1234567890");
        livro.setAnoPublicacao(2025);

        LivroDAO livroDAO = new LivroDAO(em);
        livroDAO.salvar(livro);

        System.out.println("Livro salvo com ID: " + livro.getId());

        // =======================
        // TESTE AUTOR
        // =======================
        Autor autor = new Autor();
        autor.setNome("Machado de Assis");

        AutorDAO autorDAO = new AutorDAO(em);
        autorDAO.salvar(autor);

        System.out.println("Autor salvo com ID: " + autor.getId());

        // =======================
        // TESTE EDITORA
        // =======================
        Editora editora = new Editora();
        editora.setNome("Editora Moderna");
        editora.setCidade("São Paulo");

        EditoraDAO editoraDAO = new EditoraDAO(em);
        editoraDAO.salvar(editora);

        System.out.println("Editora salva com ID: " + editora.getId());

        // =======================
        // TESTE CATEGORIA
        // =======================
        Categoria categoria = new Categoria();
        categoria.setNome("Programação");

        CategoriaDAO categoriaDAO = new CategoriaDAO(em);
        categoriaDAO.salvar(categoria);

        System.out.println("Categoria salva com ID: " + categoria.getId());

        // =======================
        // TESTE CLIENTE
        // =======================
        Cliente cliente = new Cliente();
        cliente.setNome("João da Silva");
        cliente.setEmail("joao@example.com");

        ClienteDAO clienteDAO = new ClienteDAO(em);
        clienteDAO.salvar(cliente);

        System.out.println("Cliente salvo com ID: " + cliente.getId());

        // =======================
        // TESTE EMPRESTIMO
        // =======================
        Emprestimo emprestimo = new Emprestimo();
        emprestimo.setDataEmprestimo(new Date());
        emprestimo.setDataDevolucao(new Date());
        emprestimo.setCliente(cliente);
        emprestimo.setLivro(livro);

        EmprestimoDAO emprestimoDAO = new EmprestimoDAO(em);
        emprestimoDAO.salvar(emprestimo);

        System.out.println("Empréstimo salvo com ID: " + emprestimo.getId());

        // =======================
        // TESTE FUNCIONARIO
        // =======================
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Ana Maria");
        funcionario.setMatricula("F12345");
        funcionario.setEmail("ana.maria@example.com");

        FuncionarioDAO funcionarioDAO = new FuncionarioDAO(em);
        funcionarioDAO.salvar(funcionario);

        System.out.println("Funcionario salvo com ID: " + funcionario.getId());

        // FECHAR EntityManager
        em.close();
        emf.close();
    }
}
