package br.com.ifba.curso.entity;

import br.com.ifba.infrastructure.entity.PersistenceEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "cursos")
public class Curso extends PersistenceEntity implements Serializable {

    //Atributos (Colunas) da tabela curso.
    //O nome não deve ser nulo.
    @Column(name = "nome", nullable = false)
    @Getter
    @Setter
    private String nome;
    //O código deve ser único e não deve ser nulo.
    @Column(name = "codigo", nullable = false, unique = true)
    @Getter
    @Setter
    private String codigo;
    //O status é false por padrão.
    @Column(name = "ativo")
    @Getter
    @Setter
    private boolean ativo;

}
