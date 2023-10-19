package apresentacao;

import javax.swing.*;
import java.awt.*;

public class Interface {
    private JFrame frame;
    private RealizarVenda realizarVenda;
    private MostrarRelatorio mostrarRelatorio;
    private ListarVendas listarVendas;
    private ListarClientes listarClientes;
    private Botoes botoes;
    private JPanel contentPanel;
    private JPanel buttonPanel;

    public Interface() {
        frame = new JFrame("Barraca de cachorro quente");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        realizarVenda = new RealizarVenda();
        mostrarRelatorio = new MostrarRelatorio();
        listarVendas = new ListarVendas();
        listarClientes = new ListarClientes();
        botoes = new Botoes(this);

        contentPanel = new JPanel(new BorderLayout());
        
        buttonPanel = new JPanel();
        buttonPanel.add(botoes.getBtnRealizarVenda());
        buttonPanel.add(botoes.getBtnListarVendas());
        buttonPanel.add(botoes.getBtnMostrarRelatorio());
        buttonPanel.add(botoes.getBtnListarClientes());

        contentPanel.add(buttonPanel, BorderLayout.NORTH);

        frame.add(contentPanel, BorderLayout.NORTH);
    }

    public void renderizarInterfaceInicial() {
        contentPanel.add(realizarVenda, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    public void exibirRealizarVenda() {
        contentPanel.remove(1);
        contentPanel.add(realizarVenda, BorderLayout.NORTH);
        contentPanel.revalidate();
        contentPanel.repaint();
    }

    public void exibirMostrarRelatorio() {
        contentPanel.remove(1);
        contentPanel.add(mostrarRelatorio, BorderLayout.CENTER);
        contentPanel.revalidate();
        contentPanel.repaint();
    }

    public void exibirListarVendas() {
        contentPanel.remove(1);
        contentPanel.add(listarVendas, BorderLayout.CENTER);
        contentPanel.revalidate();
        contentPanel.repaint();
    }

    public void exibirListarClientes() {
        contentPanel.remove(1);
        contentPanel.add(listarClientes, BorderLayout.CENTER);
        contentPanel.revalidate();
        contentPanel.repaint();
    }
}
