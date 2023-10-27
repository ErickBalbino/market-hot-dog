package negocios;

import java.util.List;

public class Venda {
    private String nomeCliente;
    private String matriculaCliente;
    private String queijoOption;
    private String proteinaOption;
    private List<String> complementos;
    private String bebidaOption;

    public Venda(String nomeCliente, String matriculaCliente, String queijoOption, String proteinaOption,
            List<String> complementos, String bebidaOption) {
        this.nomeCliente = nomeCliente;
        this.matriculaCliente = matriculaCliente;
        this.queijoOption = queijoOption;
        this.proteinaOption = proteinaOption;
        this.complementos = complementos;
        this.bebidaOption = bebidaOption;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getMatriculaCliente() {
        return matriculaCliente;
    }

    public String getQueijoOption() {
        return queijoOption;
    }

    public String getProteinaOption() {
        return proteinaOption;
    }

    public List<String> getComplementos() {
        return complementos;
    }

    public String getBebidaOption() {
        return bebidaOption;
    }
}
