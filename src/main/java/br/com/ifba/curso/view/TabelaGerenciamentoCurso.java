package br.com.ifba.curso.view;

import br.com.ifba.curso.entity.Curso;
import java.util.List;
import javax.swing.table.AbstractTableModel;
//Modelo abstrato de tabela (Vinculado a JFrame).

public class TabelaGerenciamentoCurso extends AbstractTableModel {

    private List<Curso> listaCursos;

    private final int COL_ID = 0;
    private final int COL_NOME = 1;
    private final int COL_CODIGO = 2;
    private final int COL_ATIVO = 3;

    //Armazena todos os cursos cadastrados em uma lista, que funcionará como as linhas da JTable.
    public TabelaGerenciamentoCurso(List<Curso> lC) {
        this.listaCursos = lC;
    }

    //Obtém a quantidade de linhas na JTable.
    @Override
    public int getRowCount() {
        return this.listaCursos.size();
    }

    //Obtém a quantidade de colunas na JTable.
    @Override
    public int getColumnCount() {
        return 4;
    }

    //Cria as colunas da JTable.
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case COL_ID:
                return "ID";
            case COL_NOME:
                return "Nome";
            case COL_CODIGO:
                return "Código";
            case COL_ATIVO:
                return "Ativo";
            default:
                break;
        }

        return "";
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Curso curso = this.listaCursos.get(rowIndex);

        if (columnIndex == COL_ID) {
            return curso.getId();
        } else if (columnIndex == COL_NOME) {
            return curso.getNome();
        } else if (columnIndex == COL_CODIGO) {
            return curso.getCodigo();
        } else if (columnIndex == COL_ATIVO) {
            return curso.isAtivo();
        }

        return "-";
    }

    //Pega as informações de um curso cadastrado em determinada linha da JTable.
    public Curso getObjetoCurso(int row) {
        return this.listaCursos.get(row);
    }
}
