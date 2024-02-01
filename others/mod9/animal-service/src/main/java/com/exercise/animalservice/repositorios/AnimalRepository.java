package com.exercise.animalservice.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.sql.Date;
import java.util.List;

import com.exercise.animalservice.entidades.Animal;

public interface AnimalRepository extends JpaRepository<Animal, Integer>{
    @Query("SELECT a FROM Animal a WHERE a.dataAdocao IS NULL AND a.tipo = 'Cachorro' ORDER BY a.dataEntrada")
    List<Animal> findNotAdoptedDogs();

    @Query("SELECT a FROM Animal a WHERE a.dataAdocao IS NOT NULL AND a.tipo = 'Cachorro'")
    List<Animal> findAdoptedDogs();

    @Query("SELECT a FROM Animal a WHERE a.dataAdocao IS NULL AND a.tipo = 'Gato' ORDER BY a.dataEntrada")
    List<Animal> findNotAdoptedCats();

    @Query("SELECT a FROM Animal a WHERE a.dataAdocao IS NOT NULL AND a.tipo = 'Gato'")
    List<Animal> findAdoptedCats();

    @Query("SELECT a.resgatador.nome, COUNT(a) FROM Animal a WHERE a.dataEntrada BETWEEN :startDate AND :endDate GROUP BY a.resgatador")
    List<Object[]> countAnimalsByRescuerAndDateRange(@Param("startDate") Date startDate, @Param("endDate") Date endDate);
}


