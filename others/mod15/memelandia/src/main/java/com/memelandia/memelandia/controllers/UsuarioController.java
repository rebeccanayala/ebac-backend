package com.memelandia.memelandia.controllers;

import com.memelandia.memelandia.entities.Usuario;
import com.memelandia.memelandia.services.UsuarioService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/usuarios")
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioService usuarioService;

    @GetMapping
    public List<Usuario> getAllUsers() {
        log.info("Listando todos os usuários");
        return usuarioService.listarTodosUsuarios();
    }

    @PostMapping
    public Usuario createUser(@RequestBody Usuario usuario) {
        log.info("Criando novo usuário: {}", usuario);
        return usuarioService.criarUsuario(usuario);
    }
}
