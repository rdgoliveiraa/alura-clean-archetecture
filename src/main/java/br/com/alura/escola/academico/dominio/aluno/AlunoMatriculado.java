package br.com.alura.escola.academico.dominio.aluno;

import br.com.alura.escola.shared.dominio.eventos.Evento;
import br.com.alura.escola.shared.dominio.CPF;
import br.com.alura.escola.shared.dominio.eventos.TipoDeEvento;

import java.time.LocalDateTime;
import java.util.Map;

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

    @Override
    public TipoDeEvento tipo() {
        return TipoDeEvento.ALUNO_MATRICULADO;
    }

    @Override
    public Map<String, Object> informacoes() {
        return Map.of("cpf", this.cpfAluno);
    }
}
