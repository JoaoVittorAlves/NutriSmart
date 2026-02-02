package com.example.NutriSmart.business;
import com.example.NutriSmart.infrastructure.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service

public class UsuarioService {

    private final UsuarioRepository repository;


    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }
}
