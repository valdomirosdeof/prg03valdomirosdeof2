package br.com.ifba.curso.controller;

import br.com.ifba.curso.entity.Curso;
import br.com.ifba.curso.service.CursoIService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//CursoController e métodos sobrescritos. Tem conexão com a camada Service e contém as funcionalidades do sistema.

@Controller//Bean do tipo Controller.
public class CursoController implements CursoIController {

    @Autowired//Conecta ao Service e demais camadas.
    private CursoIService cursoService;

    @Override
    public Curso save(Curso curso) throws RuntimeException {
        return cursoService.save(curso);
    }

    @Override
    public Curso update(Curso curso) throws RuntimeException {
        return cursoService.update(curso);
    }

    @Override
    public void delete(Curso curso) throws RuntimeException {
        cursoService.delete(curso);
    }

    @Override
    public List<Curso> findAll() throws RuntimeException {
        return cursoService.findAll();
    }

    @Override
    public Curso findById(Long id) throws RuntimeException {
        return cursoService.findById(id);
    }
}
