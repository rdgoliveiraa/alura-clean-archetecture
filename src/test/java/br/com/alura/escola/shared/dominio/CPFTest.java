package br.com.alura.escola.shared.dominio;

import br.com.alura.escola.shared.dominio.CPF;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CPFTest {

    @Test
    void naoDeveriaCriarCPFInvalido() {
        assertThrows(IllegalArgumentException.class, () -> new CPF(null));
        assertThrows(IllegalArgumentException.class, () -> new CPF("36594979833"));
        assertThrows(IllegalArgumentException.class, () -> new CPF("365.949.798.33"));
        assertThrows(IllegalArgumentException.class, () -> new CPF("365949798-33"));
    }

    @Test
    void deveriaCriarCPFValido() {
        assertDoesNotThrow(() -> new CPF("365.949.798-33"));
    }

}