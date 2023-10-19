package apresentacao;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import javax.swing.border.EmptyBorder;

public class ListarClientes extends JPanel {
    private JTable tabelaClientes;

    public ListarClientes() {
        setLayout(new BorderLayout());

        String[][] dados = {
            { "Cliente1", "Matricula1", "5" },
            { "Cliente2", "Matricula2", "8" },
        };

        String[] colunas = { "Nome do Cliente", "Matrícula", "Quantidade de Compras" };

        DefaultTableModel modeloTabela = new DefaultTableModel(dados, colunas);

        tabelaClientes = new JTable(modeloTabela);

        JScrollPane scrollPane = new JScrollPane(tabelaClientes);

        setBorder(new EmptyBorder(10, 10, 10, 10));

        add(scrollPane, BorderLayout.CENTER);
    }
}
