package com.codex.aposta.controller;

import com.codex.aposta.models.Apostador;
import com.codex.aposta.models.dto.ApostadorIn;
import com.codex.aposta.repository.ApostadorRepository;
import com.codex.aposta.service.ApostadorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

import static org.springframework.http.HttpStatus.CREATED;

@RequiredArgsConstructor
@RestController
public class ApostadorController {

    private final ApostadorRepository apostadorRepository;
    private final ApostadorService apostadorService;

    @PostMapping("/apostador")
    public ResponseEntity salvaApostador(@Valid @RequestBody ApostadorIn apostadorIn) {
       Apostador apostador = apostadorService.salvarApostador(apostadorIn);
        return ResponseEntity.status(CREATED).body(apostador);
    }

}
