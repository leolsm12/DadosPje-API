package com.DadosPje.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "API-PJE")
public class Processos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Basic(optional = false)
    @Column(name = "numero_processo")
    private String numeroProcesso;
    @Column(name = "nome")
    private String nome;
    @Column(name = "documento")
    private String documento;
    @Column(name = "email")
    private String email;
    @Column(name = "cep")
    private String cep;
    @Column(name = "notificado")
    private boolean notificado;

}
