package apresentacao;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import negocios.ControllerListarVendas;
import negocios.Venda;

import java.awt.*;
import javax.swing.border.EmptyBorder;
import java.util.List;

public class ListarVendas extends JPanel {
    private JTable tabelaVendas;

    public ListarVendas() {
        setLayout(new BorderLayout());

        ControllerListarVendas controllerListarVenda = new ControllerListarVendas();

        // Obtenha a lista de vendas do controller
        List<Venda> vendas = controllerListarVenda.obterVendas();
        System.out.println("Mostrar vendas");

        // Crie os dados a partir da lista de vendas
        String[][] dados = new String[vendas.size()][6];
        for (int i = 0; i < vendas.size(); i++) {
            Venda venda = vendas.get(i);
            dados[i][0] = venda.getNomeCliente();
            dados[i][1] = venda.getMatriculaCliente();
            dados[i][2] = venda.getQueijoOption();
            dados[i][3] = venda.getProteinaOption();
            dados[i][4] = venda.getComplementos().toString();
            dados[i][5] = venda.getBebidaOption();
        }

        String[] colunas = { "Nome", "Matrícula", "Opção de Queijo", "Opção de Proteína", "Escolha de Queijo", "Bebida" };

        DefaultTableModel modeloTabela = new DefaultTableModel(dados, colunas);

        tabelaVendas = new JTable(modeloTabela);

        JScrollPane scrollPane = new JScrollPane(tabelaVendas);

        setBorder(new EmptyBorder(10, 10, 10, 10));

        add(scrollPane, BorderLayout.CENTER);
    }
}
