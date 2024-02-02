package com.memelandia.memelandia.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import com.memelandia.memelandia.entities.Usuario;
import com.memelandia.memelandia.repositories.UsuarioRepository;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;

    public Usuario criarUsuario(Usuario usuario) {
        log.info("Criando novo usuário: {}", usuario);
        return usuarioRepository.save(usuario);
    }

    public List<Usuario> listarTodosUsuarios() {
        log.info("Listando todos os usuários");
        return usuarioRepository.findAll();
    }

    public List<Usuario> getAllUsers() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllUsers'");
    }

    public Usuario createUser(Usuario usuario) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createUser'");
    }
}
