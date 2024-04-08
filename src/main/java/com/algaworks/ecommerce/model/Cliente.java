package com.algaworks.ecommerce.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "cliente")
public class Cliente {

    @EqualsAndHashCode.Include
    @Id
    private Integer id;

    private String nome;

    @Enumerated(EnumType.STRING) // Vai gerar uma string referente ao ENUM (ao inves de 0 vaia aparecer o nome: Ex: de 0 aparecer MASCULINO)
    private SexoCliente sexo;
}
