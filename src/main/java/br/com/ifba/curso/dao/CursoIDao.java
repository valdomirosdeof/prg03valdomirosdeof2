package br.com.ifba.curso.dao;

import br.com.ifba.curso.entity.Curso;
import br.com.ifba.infrastructure.dao.GenericIDao;
import java.util.List;
//Classe abstrata CursoIDao, contendo os métodos abstratos exclusivos de Curso.
public interface CursoIDao extends GenericIDao<Curso>{
    public List<Curso> listarTodosCursos();
}
