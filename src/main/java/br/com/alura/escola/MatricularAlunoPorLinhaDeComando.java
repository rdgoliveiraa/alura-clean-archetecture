package br.com.alura.escola;

import br.com.alura.escola.academico.aplicacao.matricular.MatricularAluno;
import br.com.alura.escola.academico.aplicacao.matricular.MatricularAlunoDTO;
import br.com.alura.escola.gamificacao.aplicacao.GerarSeloAlunoNovato;
import br.com.alura.escola.gamificacao.infra.RepositorioDeSelosEmMemoria;
import br.com.alura.escola.shared.dominio.eventos.PublicadorDeEventos;
import br.com.alura.escola.academico.dominio.aluno.LogDeAlunoMatriculado;
import br.com.alura.escola.academico.infra.aluno.RepositorioDeAlunosEmMemoria;

public class MatricularAlunoPorLinhaDeComando {

    public static void main(String[] args) {
        String nome = "Fulano da Silva";
        String cpf = "123.456.789-00";
        String email = "fulano@email.com";

        PublicadorDeEventos publicador = new PublicadorDeEventos();
        publicador.adicionar(new LogDeAlunoMatriculado());
        publicador.adicionar(new GerarSeloAlunoNovato(
                new RepositorioDeSelosEmMemoria()));

        MatricularAluno matricular = new MatricularAluno(new RepositorioDeAlunosEmMemoria(), publicador);
        matricular.executa(new MatricularAlunoDTO(nome, cpf, email));
    }
}
