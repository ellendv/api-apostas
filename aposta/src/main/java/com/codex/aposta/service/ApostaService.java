package com.codex.aposta.service;

import com.codex.aposta.models.Aposta;
import com.codex.aposta.models.Apostador;
import com.codex.aposta.models.dto.ApostaIn;
import com.codex.aposta.models.dto.ApostaOut;
import com.codex.aposta.repository.ApostaRepository;
import com.codex.aposta.repository.ApostadorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.UUID;

@RequiredArgsConstructor
@Service
public class ApostaService {

    private final ApostadorRepository apostadorRepository;
    private final ApostaRepository apostaRepository;

    public ApostaOut salvaAposta(ApostaIn apostaIn){
        ApostaOut apostaOut = null;
        try {
            //duv
            Optional<Apostador> apostador = apostadorRepository.findById(apostaIn.getIdApostador());
            String numAposta = UUID.randomUUID().toString();
            Aposta aposta = new Aposta(numAposta, apostador.get());
            apostaRepository.save(aposta);
            apostaOut = new ApostaOut(numAposta, apostador.get().getNome(),apostador.get().getEmail());
        }catch (NoSuchElementException exception){
            System.out.println("Apostador inexistente");
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);

        }
        return apostaOut;
    }
}
