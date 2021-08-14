package br.com.alura.escola.gamificacao.infra;

import br.com.alura.escola.gamificacao.dominio.selo.RepositorioDeSelos;
import br.com.alura.escola.shared.dominio.CPF;
import br.com.alura.escola.gamificacao.dominio.selo.Selo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RepositorioDeSelosEmMemoria implements RepositorioDeSelos {

    private List<Selo> selos = new ArrayList<>();

    @Override
    public void adicionar(Selo selo) {
        this.selos.add(selo);
    }


    @Override
    public List<Selo> selosDoAlunoDeCPF(CPF cpfDoAluno) {
        return this.selos
                .stream()
                .filter(s -> s.getCpfDoAluno().getNumero().equals(cpfDoAluno.getNumero()))
                .collect(Collectors.toList());
    }
}
