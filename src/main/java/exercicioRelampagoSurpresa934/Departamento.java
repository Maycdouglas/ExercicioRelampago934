package exercicioRelampagoSurpresa934;

public class Departamento {
    private Empresa empresa;
    private Funcionario chefe;

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Funcionario getChefe() {
        return chefe;
    }

    public void setChefe(Funcionario chefe) {
        this.chefe = chefe;
    }

    public String escolaridadeChefia(Funcionario chefe) {
        return chefe.getEscolaridade().getNomeEscolaridade();
    }
}
