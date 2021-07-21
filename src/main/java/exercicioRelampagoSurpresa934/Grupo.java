package exercicioRelampagoSurpresa934;

public class Grupo {
    private Pais sede;
    private Funcionario presidente;

    public Grupo (Funcionario presidente) {
        this.presidente = presidente;
    }

    public Pais getSede() {
        return sede;
    }

    public void setSede(Pais sede) {
        this.sede = sede;
    }

    public Funcionario getPresidente() {
        return presidente;
    }

    public void setPresidente(Funcionario presidente) {
        this.presidente = presidente;
    }

    public String escolaridadePresidente(Funcionario presidente) {
        return presidente.getEscolaridade().getNomeEscolaridade();
    }
}
