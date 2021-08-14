package br.com.alura.escola.academico.dominio.aluno;

public interface CifradorDeSenha {

    String cifraSenha(String senha);

    boolean validarSenhaCifrada(String senhaCifrada, String senhaAberta);

}
