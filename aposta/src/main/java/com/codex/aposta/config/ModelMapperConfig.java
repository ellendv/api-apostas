package com.codex.aposta.config;

import com.codex.aposta.repository.ApostadorRepository;
import com.codex.aposta.service.ApostadorService;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfig {
    @Bean
    public ModelMapper mapper(){
        return new ModelMapper();
    }
}
