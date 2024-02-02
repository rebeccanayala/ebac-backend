package com.memelandia.memelandia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.memelandia.memelandia.entities.Meme;

public interface MemeRepository extends JpaRepository<Meme, Long> {
    
}

