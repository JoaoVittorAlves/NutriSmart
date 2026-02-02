package com.example.NutriSmart.infrastructure.repository;
import com.example.NutriSmart.infrastructure.entitys.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsuarioRepository  extends JpaRepository<Usuario, Integer> {
}
