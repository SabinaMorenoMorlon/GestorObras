package com.MicroserviciosTFG.GestorObras.controller;

import com.MicroserviciosTFG.GestorObras.entity.ObraEntity;
import com.MicroserviciosTFG.GestorObras.repository.ObraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/obra")
public class ObraController {

    @Autowired
    private ObraRepository obraRepository;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ObraEntity> getAllObras(){
        return obraRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void createObra(@RequestBody ObraEntity obraEntity){
        obraRepository.save(obraEntity);
    }
}
