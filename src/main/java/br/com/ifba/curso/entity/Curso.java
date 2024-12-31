package br.com.ifba.curso.entity;

import br.com.ifba.infrastructure.entity.PersistenceEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "cursos")
public class Curso extends PersistenceEntity implements Serializable{
    //Atributos (Colunas) da tabela curso.
    @Column(name = "nome", nullable = false)
    private String nome;
    
    @Column(name = "codigo", nullable = false, unique = true)
    private String codigo;
    
    @Column(name = "ativo")
    private boolean ativo;

    //Getters e Setters.
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}