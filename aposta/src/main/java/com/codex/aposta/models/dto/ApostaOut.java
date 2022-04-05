package com.codex.aposta.models.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ApostaOut {
    private String numeroApostador;
    private String nomeApostador;
    private String emailApostador;
}
