package com.memelandia.memelandia.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import com.memelandia.memelandia.entities.Meme;
import com.memelandia.memelandia.repositories.MemeRepository;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class MemeService {
    private final MemeRepository memeRepository;

    public Meme criarMeme(Meme meme) {
        log.info("Criando novo meme: {}", meme);
        return memeRepository.save(meme);
    }

    public List<Meme> listarTodosMemes() {
        log.info("Listando todos os memes");
        return memeRepository.findAll();
    }

    public List<Meme> getAllMemes() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllMemes'");
    }

    public Meme createMeme(Meme meme) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createMeme'");
    }
}
