package br.com.alura.escola.dominio.aluno;

import br.com.alura.escola.dominio.Evento;

import java.time.LocalDateTime;

public class AlunoMatriculado implements Evento {
    private final CPF cpfAluno;
    private final LocalDateTime momento;

    public AlunoMatriculado(CPF cpfAluno, LocalDateTime momento) {
        this.cpfAluno = cpfAluno;
        this.momento = momento;
    }

    public String getCpfDoAluno() {
        return this.cpfAluno.getNumero();
    }


    @Override
    public LocalDateTime momento() {
        return this.momento;
    }
}
