package negocios;

import java.util.List;

import apresentacao.ListarVendas;

import java.util.ArrayList;

public class ControllerListarVendas {
	private List<Venda> vendas;

	public ControllerListarVendas() {
		vendas = new ArrayList<Venda>();
	}

	public void adicionarVenda(Venda venda) {
		vendas.add(venda);
		
		for (Venda c : vendas) {
			System.out.println(c.getNomeCliente());
		}
	}

	public List<Venda> obterVendas() {
		return vendas;
	}
}