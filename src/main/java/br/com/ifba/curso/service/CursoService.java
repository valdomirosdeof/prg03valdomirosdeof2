package br.com.ifba.curso.service;

import br.com.ifba.curso.entity.Curso;
import br.com.ifba.curso.repository.CursoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//CursoService e métodos sobrescritos. Tem conexão com a camada DAO e contém as regras do sistema.
@Service//Bean do tipo Service.
public class CursoService implements CursoIService {

    @Autowired//Conecta ao Repository.
    private CursoRepository cursoRepository;

    @Override
    public Curso save(Curso curso) throws RuntimeException {
        if (curso == null) {
            throw new RuntimeException("Dados do curso não preenchidos!");
        } else if (curso.getId() != null) {
            throw new RuntimeException("Curso já existente no banco de dados!");
        } else {
            return cursoRepository.save(curso);
        }
    }

    @Override
    public Curso update(Curso curso) throws RuntimeException {
        return cursoRepository.save(curso);
    }

    @Override
    public void delete(Curso curso) throws RuntimeException {
        cursoRepository.delete(curso);
    }

    @Override
    public List<Curso> findAll() throws RuntimeException {
        return cursoRepository.findAll();
    }

    @Override
    public Curso findById(Long id) throws RuntimeException {
        return cursoRepository.findById(id).orElse(null);
    }

    @Override
    public List<Curso> findByNome(String nome) {
        return cursoRepository.findByNome(nome);
    }
}
