package br.com.ifba.curso.controller;

import br.com.ifba.curso.entity.Curso;
import java.util.List;
//Interface CursoIController e seus métodos abstratos.

public interface CursoIController {

    public abstract Curso save(Curso curso);

    public abstract Curso update(Curso curso);

    public abstract void delete(Curso curso);

    public abstract List<Curso> findAll();

    public abstract Curso findById(Long id);
}
