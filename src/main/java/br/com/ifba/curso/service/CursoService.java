package br.com.ifba.curso.service;

import br.com.ifba.curso.dao.CursoDao;
import br.com.ifba.curso.dao.CursoIDao;
import br.com.ifba.curso.entity.Curso;
import java.util.List;
//CursoService e métodos sobrescritos. Tem conexão com a camada DAO e contém as regras do sistema.
public class CursoService implements CursoIService{
    private final CursoIDao cursoDao = new CursoDao();
        
    @Override
    public Curso save(Curso curso) throws RuntimeException{
        return cursoDao.save(curso);
    }

    @Override
    public Curso update(Curso curso) throws RuntimeException{
        return cursoDao.update(curso);
    }

    @Override
    public void delete(Curso curso) throws RuntimeException{
        cursoDao.delete(curso);
    }

    @Override
    public List<Curso> findAll() throws RuntimeException{
        return cursoDao.findAll();
    }

    @Override
    public Curso findById(Long id) throws RuntimeException{
        return cursoDao.findById(id);
    }
}
