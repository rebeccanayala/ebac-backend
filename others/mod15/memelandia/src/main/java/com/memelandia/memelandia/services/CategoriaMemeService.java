package com.memelandia.memelandia.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import com.memelandia.memelandia.entities.CategoriaMeme;
import com.memelandia.memelandia.repositories.CategoriaMemeRepository;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class CategoriaMemeService {
    private final CategoriaMemeRepository categoriaMemeRepository;

    public CategoriaMeme criarCategoriaMeme(CategoriaMeme categoriaMeme) {
        log.info("Criando nova categoria de meme: {}", categoriaMeme);
        return categoriaMemeRepository.save(categoriaMeme);
    }

    public List<CategoriaMeme> listarTodasCategoriasMeme() {
        log.info("Listando todas as categorias de memes");
        return categoriaMemeRepository.findAll();
    }

    public List<CategoriaMeme> getAllCategories() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllCategories'");
    }

    public CategoriaMeme createCategory(CategoriaMeme categoriaMeme) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createCategory'");
    }
}
