package negocios;

import java.util.List;

import apresentacao.ListarVendas;

import java.util.ArrayList;

public class ControllerListarVendas {
	ArrayList<Venda> vendas = new ArrayList<Venda>();
	public int times = 0;

	public ControllerListarVendas() {

	}

	public void adicionarVenda(Venda venda) {
		vendas.add(venda);
		System.out.println(vendas.size());
	}

	public ArrayList<Venda> obterVendas() {
		return vendas;
	}
	
	public void listarVendas() {
		for (Venda c : vendas) {
			System.out.println(c.getNomeCliente());
		}
	}
}