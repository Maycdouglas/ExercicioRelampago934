package exercicioRelampagoSurpresa934;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    @Test
    void deveRetornarPaisAlocacaoFuncionario() {
        Pais pais = new Pais();
        Funcionario presidente = new Funcionario();
        Grupo grupo = new Grupo(presidente);
        Empresa empresa = new Empresa ();
        Departamento departamento = new Departamento();
        Funcionario funcionario = new Funcionario();

        pais.setNomePais("Brasil");
        grupo.setSede(pais);
        empresa.setGrupo(grupo);
        departamento.setEmpresa(empresa);
        funcionario.setAlocacao(departamento);

        assertEquals("Brasil", funcionario.paisAlocacaoFuncionario(departamento));
    }

    @Test
    void deveRetornarEstadoFilialCoordenada() {
        Estado estado = new Estado();
        Cidade cidade = new Cidade(estado);
        Filial filial = new Filial();
        Funcionario funcionario = new Funcionario();

        estado.setNomeEstado("Minas Gerais");
        filial.setCidade(cidade);
        funcionario.setCoordenacao(filial);

        assertEquals("Minas Gerais", funcionario.estadoFilialCoordenada(filial));
    }
}