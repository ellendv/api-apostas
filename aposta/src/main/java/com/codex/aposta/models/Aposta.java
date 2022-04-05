package com.codex.aposta.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Aposta {

    @Id @NotBlank
    private String numeroAposta;
//duv
    @ManyToOne
    @JoinColumn(name = "id", nullable = false)
    private Apostador apostador;
}
