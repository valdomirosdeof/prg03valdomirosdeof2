package br.com.ifba.infrastructure.dao;

import br.com.ifba.infrastructure.entity.PersistenceEntity;
import java.util.List;
//Classe abstrata GenericIDao, com os métodos abstratos.

public interface GenericIDao<Entity extends PersistenceEntity> {

    public abstract Entity save(Entity entity);

    public abstract Entity update(Entity entity);

    public abstract void delete(Entity entity);

    public abstract List<Entity> findAll();

    public abstract Entity findById(Long id);
}
