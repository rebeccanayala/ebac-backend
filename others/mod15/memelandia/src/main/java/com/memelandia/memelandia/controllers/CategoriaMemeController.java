package com.memelandia.memelandia.controllers;

import com.memelandia.memelandia.entities.CategoriaMeme;
import com.memelandia.memelandia.services.CategoriaMemeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/categorias")
@RequiredArgsConstructor
public class CategoriaMemeController {

    private final CategoriaMemeService categoriaMemeService;

    @GetMapping
    public List<CategoriaMeme> getAllCategories() {
        log.info("Listando todas as categorias de memes");
        return categoriaMemeService.listarTodasCategoriasMeme();
    }

    @PostMapping
    public CategoriaMeme createCategory(@RequestBody CategoriaMeme categoriaMeme) {
        log.info("Criando nova categoria de meme: {}", categoriaMeme);
        return categoriaMemeService.criarCategoriaMeme(categoriaMeme);
    }
}

