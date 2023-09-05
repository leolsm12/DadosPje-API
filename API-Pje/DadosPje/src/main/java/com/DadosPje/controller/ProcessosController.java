package com.DadosPje.controller;

import com.DadosPje.model.Processos;
import com.DadosPje.repository.ProcessosJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/processos")
public class ProcessosController {
    @Autowired
    private ProcessosJpaRepository repository;
    @PostMapping("/post")
    public void postProcessos(@RequestBody Processos processos){
        repository.save(processos);
    }
    @GetMapping("/all")
    public List<Processos> getProcessos(){
        return repository.findAll();
    }
    @GetMapping("/notificados")
    public List<Processos> findNotificados() {
        List<Processos> processosControllerNotificados = repository.findByNotificadoTrue();
        return processosControllerNotificados;
    }
    @GetMapping("/nao-notificados")
    public List<Processos> findNaoNotificados() {
        List<Processos> processosNaoNotificados = repository.findByNotificadoFalse();
        return processosNaoNotificados;
    }
}
