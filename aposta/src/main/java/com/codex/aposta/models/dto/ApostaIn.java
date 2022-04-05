package com.codex.aposta.models.dto;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApostaIn {
    @NotNull
    private Long idApostador;
}
