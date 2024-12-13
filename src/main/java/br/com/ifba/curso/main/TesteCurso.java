package br.com.ifba.curso.main;

import br.com.ifba.curso.entity.Curso;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class TesteCurso {
    private final static EntityManagerFactory eMF = Persistence.createEntityManagerFactory("gerenciamento_curso_pu");
    private final static EntityManager eM = eMF.createEntityManager();
    
    public static void main(String[] args) {
        Curso curso = new Curso();
        
        curso.setNome("Análise e Desenvolvimento de Sistemas");
        curso.setCodigoCurso("ADS");
        curso.setAtivo(true);
        
        //Persist (Criar)
        /*eM.getTransaction().begin();
        eM.persist(curso);
        eM.getTransaction().commit();*/
        
        //Merge (Atualizar)
        /*eM.getTransaction().begin();
        eM.merge(curso);
        eM.getTransaction().commit();*/
        
        //Remove (Deletar)
        /*Curso cursoEncontrado = eM.find(Curso.class, 1L);
        eM.getTransaction().begin();
        eM.remove(cursoEncontrado);
        eM.getTransaction().commit();*/
        
        //Find (Localizar)
        /*eM.getTransaction().begin();
        Curso cursoEncontrado = eM.find(Curso.class, 1L);
        System.out.println("Curso: " + cursoEncontrado.getNome());*/
        
        //Fechar os recursos
        /*eM.close();
        eMF.close();*/
    }
}