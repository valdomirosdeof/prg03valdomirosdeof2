package br.com.ifba.curso.dao;

import br.com.ifba.curso.entity.Curso;
import br.com.ifba.infrastructure.dao.GenericDao;
import jakarta.persistence.Query;
import java.util.List;
//CursoDao, contendo os métodos exclusivos para a classe Curso.
public class CursoDao extends GenericDao<Curso> implements CursoIDao{
    //Obtém todos os cursos cadastrados e armazena em uma lista.
    @Override
    public List<Curso> listarTodosCursos(){
        String jpql = "SELECT C " + "FROM Curso AS C";
        Query query = eM.createQuery(jpql);
        List listaCursos = query.getResultList();
        
        return (List<Curso>) listaCursos;
    }
}