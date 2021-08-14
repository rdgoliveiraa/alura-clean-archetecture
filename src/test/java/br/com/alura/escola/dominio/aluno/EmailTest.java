package br.com.alura.escola.dominio.aluno;

import br.com.alura.escola.dominio.aluno.Email;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailTest {

    @Test
    void naoDeveriaCriarEmailsComEnderecoInvalidos() {
        assertThrows(IllegalArgumentException.class, () -> new Email(null));
        assertThrows(IllegalArgumentException.class, () -> new Email(""));
        assertThrows(IllegalArgumentException.class, () -> new Email("emailinvalido"));
    }

    @Test
    void deveriaCriarEmailComEnderecoValido() {
        assertDoesNotThrow(() -> new Email("rodrigo@email.com"));
    }

}