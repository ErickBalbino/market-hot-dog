package negocios;

import java.util.List;

public class ControllerRealizarVenda {
	ControllerListarVendas controllerListarVenda = new ControllerListarVendas();

	public ControllerRealizarVenda() {
	}

	public void realizarVenda(String nomeCliente, String matriculaCliente, String queijoOption, String proteinaOption,
			List<String> complementos, String bebidaOption) {

		Venda novaVenda = new Venda(nomeCliente, matriculaCliente, queijoOption, proteinaOption, complementos,
				bebidaOption);

		controllerListarVenda.adicionarVenda(novaVenda);
		controllerListarVenda.listarVendas();
	}
}