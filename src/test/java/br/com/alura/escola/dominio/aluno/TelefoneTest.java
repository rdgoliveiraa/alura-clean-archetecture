package br.com.alura.escola.dominio.aluno;

import br.com.alura.escola.dominio.aluno.Telefone;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelefoneTest {

    @Test
    void naoDeveriaCriarTelefoneInvalido() {
        assertThrows(IllegalArgumentException.class, () -> new Telefone(null, "99732-0494"));
        assertThrows(IllegalArgumentException.class, () -> new Telefone("2", "99732-0494"));
        assertThrows(IllegalArgumentException.class, () ->new Telefone("47", null));
        assertThrows(IllegalArgumentException.class, () ->new Telefone("47", "901-18888"));
    }

    @Test
    void deveriaCriarTelefoneValido() {
        assertDoesNotThrow(() -> new Telefone("(47)", "99732-0494"));
        assertDoesNotThrow(() -> new Telefone("(11)", "5832-6744"));
    }

}