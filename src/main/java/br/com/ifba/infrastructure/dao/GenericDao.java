package br.com.ifba.infrastructure.dao;

import br.com.ifba.infrastructure.entity.PersistenceEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.lang.reflect.ParameterizedType;
import java.util.List;
//Classe GenericDao, sobrescrevendo os métodos abstratos. Tem acesso aos dados.
@SuppressWarnings("unchecked")
public class GenericDao <Entity extends PersistenceEntity> implements GenericIDao<Entity>{
    //Entity Manager e Entity Manager Factory,
    protected static EntityManager eM;
    
    static{
        EntityManagerFactory eMF = Persistence.createEntityManagerFactory("gerenciamento_curso_pu");
        eM = eMF.createEntityManager();
    }
    //Adicionar curso (Create).
    @Override
    public Entity save(Entity entity) {
        eM.getTransaction().begin();
        eM.persist(entity);
        eM.getTransaction().commit();
        return entity;
    }
    //Editar curso (Update).
    @Override
    public Entity update(Entity entity) {
        eM.getTransaction().begin();
        eM.merge(entity);
        eM.getTransaction().commit();
        return entity;
    }
    //Excluir curso (Delete). 
    @Override
    public void delete(Entity entity) {
        entity = findById(entity.getId());
        eM.getTransaction().begin();
        eM.remove(entity);
        eM.getTransaction().commit();
    }
    //Encontrar todos os cursos cadastrados (Retrieve).
    @Override
    public List<Entity> findAll() {
        return eM.createQuery(("FROM " + getTypeClass().getName())).getResultList();
    }
    //Encontrar curso por ID (Retrieve).
    @Override
    public Entity findById(Long id) {
        return (Entity) eM.find(getTypeClass(), id);
    }
    //Obter tipo de classe, que retorna o tipo de classe que está em execução.
    protected Class<?> getTypeClass(){
        Class<?> clazz = (Class<?>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        return clazz;
    }
}