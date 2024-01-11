package com.estudos.crud.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_produto")
public class ProdutoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String descricao;
    private Double preco;


}
