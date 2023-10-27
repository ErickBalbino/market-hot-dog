package apresentacao;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import negocios.ControllerRealizarVenda;

import java.awt.*;

public class RealizarVenda extends JPanel {
	private JTextField nomeClienteInput;
	private JTextField matriculaInput;
	private JComboBox<?> queijoComboBox;
	private JComboBox<?> proteinaComboBox;
	private JCheckBox[] complementoOpcoes;
	private List<String> complementosSelecionados = new ArrayList<String>();
	private JComboBox<?> bebidaComboBox;
	private JButton realizarVendaButton;

	public RealizarVenda() {
		setLayout(new GridBagLayout());

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
		add(queijoComboBox = new JComboBox<Object>(
				new String[] { "Sem queijo", "Queijo Cheddar", "Queijo Suíço", "Queijo Provolone" }), constraints);

		// Linha 4
		constraints.gridx = 0;
		constraints.gridy = 3;
		add(new JLabel("Opção de Proteína:"), constraints);
		constraints.gridx = 1;
		add(proteinaComboBox = new JComboBox<Object>(new String[] { "Frango", "Carne", "Peixe" }), constraints);

		// Linha 5
		constraints.gridx = 0;
		constraints.gridy = 4;
		add(new JLabel("Escolha a opção de complemento:"), constraints);
		constraints.gridx = 1;
		constraints.insets = new Insets(0, 5, 0, 5);
		JPanel complementoOpcoesPanel = new JPanel();
		complementoOpcoes = new JCheckBox[4];
		String[] dataComplementos = { "Maionese", "Ketchup", "Ovo", "Salsicha" };
		for (int i = 0; i < complementoOpcoes.length; i++) {
			complementoOpcoes[i] = new JCheckBox(dataComplementos[i]);
			complementoOpcoes[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JCheckBox checkBox = (JCheckBox) e.getSource();
					if (checkBox.isSelected()) {
						complementosSelecionados.add(checkBox.getText());
					} else {
						complementosSelecionados.remove(checkBox.getText());
					}
				}
			});
			complementoOpcoesPanel.add(complementoOpcoes[i]);
		}
		add(complementoOpcoesPanel, constraints);

		// Linha 6
		constraints.gridx = 0;
		constraints.gridy = 5;
		add(new JLabel("Bebida:"), constraints);
		constraints.gridx = 1;
		add(bebidaComboBox = new JComboBox<Object>(new String[] { "Coca-Cola", "Pepsi", "Água", "Suco" }), constraints);

		// Linha 7
		constraints.gridx = 1;
		constraints.gridy = 6;
		constraints.gridwidth = 2;
		constraints.insets = new Insets(5, 5, 5, 5);
		add(realizarVendaButton = new JButton("Realizar Venda"), constraints);
		realizarVendaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerRealizarVenda controllerVenda = new ControllerRealizarVenda();
				controllerVenda.realizarVenda(nomeClienteInput.getText(), matriculaInput.getText(),
						queijoComboBox.getSelectedItem().toString(), proteinaComboBox.getSelectedItem().toString(), complementosSelecionados,
						bebidaComboBox.getSelectedItem().toString());
			}
		});
	}
}
