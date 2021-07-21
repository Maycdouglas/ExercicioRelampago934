package exercicioRelampagoSurpresa934;

public class Funcionario {
    private Escolaridade escolaridade;
    private Departamento alocacao;
    private Filial coordenacao;
    private String nome;

    public Escolaridade getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(Escolaridade escolaridade) {
        this.escolaridade = escolaridade;
    }

    public Departamento getAlocacao() {
        return alocacao;
    }

    public void setAlocacao(Departamento alocacao) {
        this.alocacao = alocacao;
    }

    public Filial getCoordenacao() {
        return coordenacao;
    }

    public void setCoordenacao(Filial coordenacao) {
        this.coordenacao = coordenacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String paisAlocacaoFuncionario(Departamento alocacao){
        return alocacao.getEmpresa().getGrupo().getSede().getNomePais();
    }

    public String estadoFilialCoordenada(Filial coordenacao) {
        return coordenacao.getCidade().getEstado().getNomeEstado();
    }
}
