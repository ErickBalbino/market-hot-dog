package apresentacao;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import javax.swing.border.EmptyBorder;

public class ListarVendas extends JPanel {
    private JTable tabelaVendas;

    public ListarVendas() {
        setLayout(new BorderLayout());

        String[][] dados = {
            { "Nome1", "Matricula1", "Opção1", "Proteína1", "Queijo1", "Bebida1" },
            { "Nome2", "Matricula2", "Opção2", "Proteína2", "Queijo2", "Bebida2" },
        };

        String[] colunas = { "Nome", "Matrícula", "Opção de Queijo", "Opção de Proteína", "Escolha de Queijo", "Bebida" };

        DefaultTableModel modeloTabela = new DefaultTableModel(dados, colunas);

        tabelaVendas = new JTable(modeloTabela);

        JScrollPane scrollPane = new JScrollPane(tabelaVendas);

        setBorder(new EmptyBorder(10, 10, 10, 10));

        add(scrollPane, BorderLayout.CENTER);
    }
}
