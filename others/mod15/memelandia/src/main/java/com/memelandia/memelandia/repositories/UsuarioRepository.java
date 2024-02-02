package com.memelandia.memelandia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.memelandia.memelandia.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    
}
