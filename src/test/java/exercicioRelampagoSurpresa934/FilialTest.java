package exercicioRelampagoSurpresa934;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilialTest {

    @Test
    void deveRetornarNomeDiretorEmpresaFilial() {
        Funcionario diretor = new Funcionario();
        Empresa empresa = new Empresa();
        Filial filial = new Filial();

        diretor.setNome("Maycon");
        empresa.setDiretor(diretor);
        filial.setEmpresa(empresa);

        assertEquals("Maycon", filial.nomeDiretorEmpresaFilial(empresa));
    }
}