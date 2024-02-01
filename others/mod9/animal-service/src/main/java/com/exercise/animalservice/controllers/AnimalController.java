package com.exercise.animalservice.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;

import java.sql.Date;
import java.util.List;

import com.exercise.animalservice.entidades.Animal;
import com.exercise.animalservice.repositorios.AnimalRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/animais")
public class AnimalController {

    private AnimalRepository repository;

    public AnimalController(AnimalRepository repository) {
        this.repository = repository;
    }
    
    @GetMapping
    private List<Animal> findAll() {
        return repository.findAll();
    }

    @PostMapping
    private Animal create(@RequestBody Animal animal) {
        return repository.save(animal);
    }

    @GetMapping("/not-adopted-dogs")
    private List<Animal> findNotAdoptedDogs() {
        return repository.findNotAdoptedDogs();
    }

    @GetMapping("/adopted-dogs")
    private List<Animal> findAdoptedDogs() {
        return repository.findAdoptedDogs();
    }
    
    @GetMapping("/not-adopted-cats")
    private List<Animal> findNotAdoptedCats() {
        return repository.findNotAdoptedCats();
    }

    @GetMapping("/adopted-cats")
    private List<Animal> findAdoptedCats() {
        return repository.findAdoptedCats();
    }

    @GetMapping("/rescue-stats")
    public List<Object[]> getRescueStats(@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date startDate,
    @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date endDate) {
        return repository.countAnimalsByRescuerAndDateRange(startDate, endDate);
    }
}
