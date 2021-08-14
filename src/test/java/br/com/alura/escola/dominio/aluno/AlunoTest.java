package br.com.alura.escola.dominio.aluno;

import br.com.alura.escola.aplicacao.matricular.MatricularAluno;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    private Aluno aluno;
    @BeforeEach
    void criaAluno() {
        this.aluno = new Aluno(new CPF("123.456.789-00"), "Fulano", new Email("fulano@email.com"));
    }

    @Test
    void cadastrarAlunoComUmTelefonesComSucesso() {
        this.aluno.adicionarTelefone("(47)", "99732-0494");
        this.aluno.adicionarTelefone("(11)", "5832-7433");
        assertEquals(2, aluno.getTelefones().size());

    }

    @Test
    void cadastrarAlunoComDoisTelefonesComSucesso() {
        this.aluno.adicionarTelefone("(47)", "99732-0494");
        this.aluno.adicionarTelefone("(11)", "5832-7433");
        assertEquals(2, aluno.getTelefones().size());

    }

    @Test
    void cadastrarAlunoComTresTelefonesComFalha() {
        assertThrows(IllegalArgumentException.class, () ->  {
            this.aluno.adicionarTelefone("(11)", "5832-7433");
            this.aluno.adicionarTelefone("(47)", "997320494");
            this.aluno.adicionarTelefone("(11)", "99054-2325");
        });

    }
}