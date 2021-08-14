package br.com.alura.escola.shared.dominio.eventos;

import java.time.LocalDateTime;
import java.util.Map;

public interface Evento {

    public LocalDateTime momento();
    TipoDeEvento tipo();
    Map<String, Object> informacoes();
}
