package br.com.ifba.curso.dao;

import br.com.ifba.curso.entity.Curso;
import br.com.ifba.infrastructure.dao.GenericDao;
import org.springframework.stereotype.Repository;
//CursoDao, contendo os métodos exclusivos para a classe Curso.

@Repository//Bean do tipo Repository.
public class CursoDao extends GenericDao<Curso> implements CursoIDao {

}
