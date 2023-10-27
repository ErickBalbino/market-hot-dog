package apresentacao;

import javax.swing.*;

import negocios.ControllerListarVendas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Botoes {
	private JButton btnRealizarVenda;
	private JButton btnMostrarRelatorio;
	private JButton btnListarVendas;
	private JButton btnListarClientes;

	public Botoes(final Interface interfaceApp) {
		btnRealizarVenda = new JButton("Realizar Venda");
		btnListarVendas = new JButton("Listar Vendas");
		btnMostrarRelatorio = new JButton("Mostrar Relatório");
		btnListarClientes = new JButton("Listar Clientes");

		btnRealizarVenda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				interfaceApp.exibirRealizarVenda();
			}
		});

		btnMostrarRelatorio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				interfaceApp.exibirMostrarRelatorio();
			}
		});

		btnListarVendas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerListarVendas controller = new ControllerListarVendas();
				System.out.println(controller.obterVendas());
				interfaceApp.exibirListarVendas();
			}
		});

		btnListarClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				interfaceApp.exibirListarClientes();
			}
		});
	}

	public JButton getBtnRealizarVenda() {
		return btnRealizarVenda;
	}

	public JButton getBtnMostrarRelatorio() {
		return btnMostrarRelatorio;
	}

	public JButton getBtnListarVendas() {
		return btnListarVendas;
	}

	public JButton getBtnListarClientes() {
		return btnListarClientes;
	}
}
