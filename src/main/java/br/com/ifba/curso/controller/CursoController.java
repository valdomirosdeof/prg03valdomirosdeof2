package br.com.ifba.curso.controller;

import br.com.ifba.curso.entity.Curso;
import br.com.ifba.curso.service.CursoService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
//CursoController e métodos sobrescritos. Tem conexão com a camada Service e contém as funcionalidades do sistema.

@Controller//Bean do tipo Controller.
@RequiredArgsConstructor
public class CursoController implements CursoIController {

    private final CursoService cursoService;

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

    @Override
    public List<Curso> findByNome(String nome) {
        return cursoService.findByNome(nome);
    }
}
