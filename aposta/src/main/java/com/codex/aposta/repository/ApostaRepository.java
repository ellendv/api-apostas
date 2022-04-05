package com.codex.aposta.repository;

import com.codex.aposta.models.Aposta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApostaRepository extends JpaRepository<Aposta, String> {
}
