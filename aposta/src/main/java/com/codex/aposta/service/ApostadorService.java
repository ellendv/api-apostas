package com.codex.aposta.service;

import com.codex.aposta.models.Apostador;
import com.codex.aposta.models.dto.ApostadorIn;
import com.codex.aposta.repository.ApostadorRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ApostadorService {
    private final ApostadorRepository apostadorRepository;
    private final ModelMapper modelMapper;
     public Apostador salvarApostador(ApostadorIn apostadorIn){
            Apostador apostador = modelMapper.map(apostadorIn, Apostador.class);
            return apostadorRepository.save(apostador);

     }
}
