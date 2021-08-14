package br.com.alura.escola.gamificacao.infra;

import br.com.alura.escola.shared.dominio.CPF;

public class SeloNaoEncontrado extends RuntimeException {
    public SeloNaoEncontrado(CPF cpf) {
        super("Selo nao encontrado com CPF: " + cpf.getNumero());
    }
}
