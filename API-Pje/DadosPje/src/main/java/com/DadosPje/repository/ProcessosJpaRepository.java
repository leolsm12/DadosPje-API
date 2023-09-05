package com.DadosPje.repository;

import com.DadosPje.model.Processos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProcessosJpaRepository extends JpaRepository<Processos, Integer> {
    List<Processos> findByNotificadoTrue();

    List<Processos> findByNotificadoFalse();

}