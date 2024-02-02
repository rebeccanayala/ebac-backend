package com.memelandia.memelandia.controllers;

import com.memelandia.memelandia.entities.Meme;
import com.memelandia.memelandia.services.MemeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/memes")
@RequiredArgsConstructor
public class MemeController {

    private final MemeService memeService;

    @GetMapping
    public List<Meme> getAllMemes() {
        log.info("Listando todos os memes");
        return memeService.listarTodosMemes();
    }

    @PostMapping
    public Meme createMeme(@RequestBody Meme meme) {
        log.info("Criando novo meme: {}", meme);
        return memeService.criarMeme(meme);
    }
}
