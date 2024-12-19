package br.com.ifba.curso.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Persistence;
import jakarta.persistence.Table;
import java.util.List;

@Entity
@Table(name = "cursos")
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "nome", nullable = false)
    private String nome;
    
    @Column(name = "codigo_curso", nullable = false, unique = true)
    private String codigoCurso;
    
    @Column(name = "ativo")
    private boolean ativo;
    
    //Entity Manager e Entity Manager Factory.
    private final static EntityManagerFactory eMF = Persistence.createEntityManagerFactory("gerenciamento_curso_pu");
    private final static EntityManager eM = eMF.createEntityManager();
    
    //Create.
    public Curso adicionarCurso(Curso curso){
        eM.getTransaction().begin();
        eM.persist(curso);
        eM.getTransaction().commit();
        return curso;
    }
    
    //Retrieve.
    public Curso pesquisaId(Long id){
        return (Curso) eM.find(Curso.class, id);
    }
    
    //Retrieve (Todos os nomes de cursos).
    public List<Curso> pesquisaTodos(){
        return eM.createQuery(("from " + Curso.class.getName())).getResultList();
    }
    
    //Update.
    public Curso editarCurso(Curso curso){
        eM.getTransaction().begin();
        eM.merge(curso);
        eM.getTransaction().commit();
        return curso;
    }
    
    //Delete.
    public void excluirCurso(Curso curso){
        Curso cursoEncontrado = eM.find(Curso.class, curso.getId());
        eM.getTransaction().begin();
        eM.remove(cursoEncontrado);
        eM.getTransaction().commit();
    }
    
    //Exibe todos os cursos cadastrados no banco de dados.
    public List<Curso> listarTodosCursos(){
        List<Curso> cursos = null;
        
        try{
            cursos = eM.createQuery("from Curso as C").getResultList();
        }catch(Exception e){
            System.err.println(e);
        }
 
        return cursos;
    }
    
    //Getters e Setters.
    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(String codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}