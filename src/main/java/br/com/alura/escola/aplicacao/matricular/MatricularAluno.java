package br.com.alura.escola.aplicacao.matricular;

import br.com.alura.escola.dominio.PublicadorDeEventos;
import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.AlunoMatriculado;
import br.com.alura.escola.dominio.aluno.CPF;
import br.com.alura.escola.dominio.aluno.RepositorioDeAlunos;

import java.time.LocalDateTime;

public class MatricularAluno {

    private final RepositorioDeAlunos repositorio;
    private final PublicadorDeEventos publicador;

    public MatricularAluno(RepositorioDeAlunos repositorio, PublicadorDeEventos publicador) {
        this.repositorio = repositorio;
        this.publicador = publicador;
    }

    //COMMAND
    public void executa(MatricularAlunoDTO dados) {
        Aluno novo = dados.criarAluno();
        repositorio.matricular(novo);

        AlunoMatriculado evento = new AlunoMatriculado(novo.getCpf(), LocalDateTime.now());
        publicador.publicar(evento);
    }
}
