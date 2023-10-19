package apresentacao;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;

public class RealizarVenda extends JPanel {
    private JTextField nomeClienteInput;
    private JTextField matriculaInput;
    private JComboBox queijoComboBox;
    private JComboBox proteinaComboBox;
    private JCheckBox[] queijoOpcoes;
    private JComboBox bebidaComboBox;
    private JButton realizarVendaButton;

    public RealizarVenda() {
        setLayout(new GridBagLayout());
        setBorder(new EmptyBorder(10, 10, 10, 10));
        
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.insets = new Insets(5, 5, 5, 5);

        // Linha 1
        constraints.gridx = 0;
        constraints.gridy = 0;
        add(new JLabel("Nome do Cliente:"), constraints);
        constraints.gridx = 1;
        add(nomeClienteInput = new JTextField(20), constraints);

        // Linha 2
        constraints.gridx = 0;
        constraints.gridy = 1;
        add(new JLabel("Matrícula:"), constraints);
        constraints.gridx = 1;
        add(matriculaInput = new JTextField(20), constraints);

        // Linha 3
        constraints.gridx = 0;
        constraints.gridy = 2;
        add(new JLabel("Opção de Queijo:"), constraints);
        constraints.gridx = 1;
        add(queijoComboBox = new JComboBox(new String[]{"Sem queijo", "Queijo Cheddar", "Queijo Suíço", "Queijo Provolone"}), constraints);

        // Linha 4
        constraints.gridx = 0;
        constraints.gridy = 3;
        add(new JLabel("Opção de Proteína:"), constraints);
        constraints.gridx = 1;
        add(proteinaComboBox = new JComboBox(new String[]{"Frango", "Carne", "Peixe"}), constraints);

        // Linha 5
        constraints.gridx = 0;
        constraints.gridy = 4;
        add(new JLabel("Escolha a opção de queijo:"), constraints);
        constraints.gridx = 1;
        constraints.insets = new Insets(0, 5, 0, 5);
        JPanel queijoOpcoesPanel = new JPanel();
        queijoOpcoes = new JCheckBox[3];
        for (int i = 0; i < queijoOpcoes.length; i++) {
            queijoOpcoes[i] = new JCheckBox("Queijo " + (i + 1));
            queijoOpcoesPanel.add(queijoOpcoes[i]);
        }
        add(queijoOpcoesPanel, constraints);

        // Linha 6
        constraints.gridx = 0;
        constraints.gridy = 5;
        add(new JLabel("Bebida:"), constraints);
        constraints.gridx = 1;
        add(bebidaComboBox = new JComboBox(new String[]{"Coca-Cola", "Pepsi", "Água", "Suco"}), constraints);

        // Linha 7
        constraints.gridx = 1;
        constraints.gridy = 6;
        constraints.gridwidth = 2;
        constraints.insets = new Insets(5, 5, 5, 5);
        add(realizarVendaButton = new JButton("Realizar Venda"), constraints);
    }
}
