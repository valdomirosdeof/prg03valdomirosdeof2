package br.com.ifba;

import br.com.ifba.curso.view.TelaGerenciamentoCurso;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
/*import br.com.ifba.curso.controller.CursoController;
import br.com.ifba.curso.controller.CursoIController;
import br.com.ifba.curso.entity.Curso;
import java.util.ArrayList;
import java.util.List;*/
@SpringBootApplication
public class PrincipalCurso {

    public static void main(String[] args) {
        //Inicia todos os beans necessários.
        ConfigurableApplicationContext cAC = new SpringApplicationBuilder(PrincipalCurso.class).headless(false).run(args);

        TelaGerenciamentoCurso tGC = cAC.getBean(TelaGerenciamentoCurso.class);
        tGC.setVisible(true);
        
        //Teste de todas as funções de CRUD.
        //Save:
        /*Curso curso = new Curso();
        
        curso.setNome("Administração");
        curso.setCodigo("ADM");
        curso.setAtivo(false);
        
        CursoIController cursoController = new CursoController();
        cursoController.save(curso);
        
        System.out.println("ID: " + curso.getId());
        System.out.println("Nome: " + curso.getNome());
        System.out.println("Código: " + curso.getCodigo());
        System.out.println("Ativo?: " + curso.getAtivo());*/

        //Update:
        /*CursoIController cursoController = new CursoController();
        Curso cursoEncontrado = cursoController.findById(1452l);
        
        cursoEncontrado.setAtivo(true);
        cursoController.update(cursoEncontrado);
        
        System.out.println("ID: " + cursoEncontrado.getId());
        System.out.println("Nome: " + cursoEncontrado.getNome());
        System.out.println("Código: " + cursoEncontrado.getCodigo());
        System.out.println("Ativo?: " + cursoEncontrado.getAtivo());*/
        //Delete:
        /*CursoIController cursoController = new CursoController();
        Curso cursoEncontrado = cursoController.findById(1404l);
        
        cursoController.delete(cursoEncontrado);
        
        System.out.println("ID: " + cursoEncontrado.getId());
        System.out.println("Nome: " + cursoEncontrado.getNome());
        System.out.println("Código: " + cursoEncontrado.getCodigo());
        System.out.println("Ativo?: " + cursoEncontrado.getAtivo());*/
        //Find by ID:
        /*CursoIController cursoController = new CursoController();
        Curso cursoEncontrado = cursoController.findById(1404l);
        
        System.out.println("ID: " + cursoEncontrado.getId());
        System.out.println("Nome: " + cursoEncontrado.getNome());
        System.out.println("Código: " + cursoEncontrado.getCodigo());
        System.out.println("Ativo?: " + cursoEncontrado.getAtivo());*/
        //Find All:
        /*CursoIController cursoController = new CursoController();
        
        List<Curso> listaCursos = cursoController.findAll();
        
        for(Curso curso: listaCursos){
            System.out.println();
            System.out.println("ID: " + curso.getId());
            System.out.println("Nome: " + curso.getNome());
            System.out.println("Código: " + curso.getCodigo());
            System.out.println("Ativo?: " + curso.getAtivo());
        }*/
    }
}
