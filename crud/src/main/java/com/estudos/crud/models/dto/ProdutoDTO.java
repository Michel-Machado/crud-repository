package com.estudos.crud.models.dto;

import com.estudos.crud.models.ProdutoModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.concurrent.CountDownLatch;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoDTO {
    private String descricao;
    private Double preco;

    public ProdutoDTO(ProdutoModel produtoModel) {
        descricao = produtoModel.getDescricao();
        preco = produtoModel.getPreco();
    }
}
