package com.memelandia.memelandia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.memelandia.memelandia.entities.CategoriaMeme;

public interface CategoriaMemeRepository extends JpaRepository<CategoriaMeme, Long> {
    
}

