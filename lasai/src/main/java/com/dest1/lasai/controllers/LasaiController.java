package com.dest1.lasai.controllers;


import com.dest1.lasai.entities.Lasai;
import com.dest1.lasai.repositories.LasaiRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("restaurante")
public class LasaiController {
    private final LasaiRepository repository;
    public LasaiController(LasaiRepository repository) {
        this.repository = repository;
    }
    @GetMapping
    public List<Lasai> findAll(){
        return repository.findAll();
    }
    @PostMapping
    public Lasai criar(@RequestBody Lasai l){
        return repository.save(l);
    }
}
