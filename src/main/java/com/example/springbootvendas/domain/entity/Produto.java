package com.example.springbootvendas.domain.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "produto")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "descricao")
    @NotEmpty(message = "{campo.descricao.obrigatorio}")
    private String descricao;

    @Column(name = "preco_unitario")
    @NotNull(message = "{campo.preco.obrigatorio}")
    private BigDecimal preco;
}
