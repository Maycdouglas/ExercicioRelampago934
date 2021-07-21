package exercicioRelampagoSurpresa934;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DepartamentoTest {

    @Test
    void deveRetornarEscolaridadeChefia() {
        Escolaridade escolaridade = new Escolaridade();
        Funcionario chefe = new Funcionario();
        Departamento departamento = new Departamento();

        escolaridade.setNomeEscolaridade("Mestrado");
        chefe.setEscolaridade(escolaridade);
        departamento.setChefe(chefe);

        assertEquals("Mestrado", departamento.escolaridadeChefia(chefe));
    }
}