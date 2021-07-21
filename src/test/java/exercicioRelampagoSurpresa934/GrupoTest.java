package exercicioRelampagoSurpresa934;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GrupoTest {

    @Test
    void deveRetornarEscolaridadePresidente() {
        Funcionario presidente = new Funcionario();
        Grupo grupo = new Grupo(presidente);
        Escolaridade escolaridade = new Escolaridade();
        escolaridade.setNomeEscolaridade("Doutorado");
        presidente.setEscolaridade(escolaridade);

        assertEquals("Doutorado", grupo.escolaridadePresidente(presidente));
    }
}