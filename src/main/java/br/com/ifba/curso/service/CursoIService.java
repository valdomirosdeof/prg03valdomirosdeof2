package br.com.ifba.curso.service;

import br.com.ifba.curso.entity.Curso;
import java.util.List;
//Interface CursoIService e seus métodos abstratos.

public interface CursoIService {

    public abstract Curso save(Curso curso);

    public abstract Curso update(Curso curso);

    public abstract void delete(Curso curso);

    public abstract List<Curso> findAll();

    public abstract Curso findById(Long id);
}
