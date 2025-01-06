package br.com.ifba.curso.service;

import br.com.ifba.curso.dao.CursoIDao;
import br.com.ifba.curso.entity.Curso;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//CursoService e métodos sobrescritos. Tem conexão com a camada DAO e contém as regras do sistema.
@Service//Bean do tipo Service.
public class CursoService implements CursoIService {

    @Autowired//Conecta ao Repository.
    private CursoIDao cursoDao;

    @Override
    public Curso save(Curso curso) throws RuntimeException {
        if (curso == null) {
            throw new RuntimeException("Dados do curso não preenchidos!");
        } else if (curso.getId() != null) {
            throw new RuntimeException("Curso já existente no banco de dados!");
        } else {
            return cursoDao.save(curso);
        }
    }

    @Override
    public Curso update(Curso curso) throws RuntimeException {
        return cursoDao.update(curso);
    }

    @Override
    public void delete(Curso curso) throws RuntimeException {
        cursoDao.delete(curso);
    }

    @Override
    public List<Curso> findAll() throws RuntimeException {
        return cursoDao.findAll();
    }

    @Override
    public Curso findById(Long id) throws RuntimeException {
        return cursoDao.findById(id);
    }
}
