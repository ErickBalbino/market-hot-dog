package negocios;

import java.util.List;


public class ControllerRealizarVenda {
	public ControllerRealizarVenda() {

	}

	public void realizarVenda(String nomeCliente, String matriculaCliente, String queijoOption, String proteinaOption,
			List<String> complementos, String bebidaOption) {
		ControllerListarVendas controllerListarVenda = new ControllerListarVendas();
		
		Venda novaVenda = new Venda(nomeCliente, matriculaCliente, queijoOption, proteinaOption, complementos,
				bebidaOption);

		controllerListarVenda.adicionarVenda(novaVenda);
	}
}