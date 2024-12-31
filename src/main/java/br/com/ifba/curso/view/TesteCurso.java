package br.com.ifba.curso.view;

/*import br.com.ifba.curso.dao.CursoDao;
import br.com.ifba.curso.dao.CursoIDao;
import br.com.ifba.curso.entity.Curso;
import java.util.ArrayList;
import java.util.List;*/

public class TesteCurso {
    public static void main(String[] args) {
        //Teste de todas as funções de CRUD.
        //Save:
        /*Curso curso = new Curso();
        
        curso.setNome("Administração");
        curso.setCodigoCurso("ADM");
        curso.setAtivo(false);
        
        CursoIDao cursoDao = new CursoDao();
        cursoDao.save(curso);
        
        System.out.println("ID: " + curso.getId());
        System.out.println("Nome: " + curso.getNome());
        System.out.println("Código: " + curso.getCodigoCurso());
        System.out.println("Ativo?: " + curso.getAtivo());*/
        
        //Update:
        /*CursoIDao cursoDao = new CursoDao();
        Curso cursoEncontrado = cursoDao.findById(1452l);
        
        cursoEncontrado.setAtivo(true);
        cursoDao.update(cursoEncontrado);
        
        System.out.println("ID: " + cursoEncontrado.getId());
        System.out.println("Nome: " + cursoEncontrado.getNome());
        System.out.println("Código: " + cursoEncontrado.getCodigoCurso());
        System.out.println("Ativo?: " + cursoEncontrado.getAtivo());*/
        
        //Delete:
        /*CursoIDao cursoDao = new CursoDao();
        Curso cursoEncontrado = cursoDao.findById(1404l);
        
        cursoDao.delete(cursoEncontrado);
        
        System.out.println("ID: " + cursoEncontrado.getId());
        System.out.println("Nome: " + cursoEncontrado.getNome());
        System.out.println("Código: " + cursoEncontrado.getCodigoCurso());
        System.out.println("Ativo?: " + cursoEncontrado.getAtivo());*/
        
        //Find by ID:
        /*CursoIDao cursoDao = new CursoDao();
        Curso cursoEncontrado = cursoDao.findById(1404l);
        
        System.out.println("ID: " + cursoEncontrado.getId());
        System.out.println("Nome: " + cursoEncontrado.getNome());
        System.out.println("Código: " + cursoEncontrado.getCodigoCurso());
        System.out.println("Ativo?: " + cursoEncontrado.getAtivo());*/
        
        //Find All:
        /*CursoIDao cursoDao = new CursoDao();
        
        List<Curso> listaCursos = cursoDao.findAll();
        
        for(Curso curso: listaCursos){
            System.out.println();
            System.out.println("ID: " + curso.getId());
            System.out.println("Nome: " + curso.getNome());
            System.out.println("Código: " + curso.getCodigoCurso());
            System.out.println("Ativo?: " + curso.getAtivo());
        }*/
    }
}