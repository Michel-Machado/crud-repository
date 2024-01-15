package com.estudos.crud.models.dto;

import com.estudos.crud.models.entities.ProdutoModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoDTO {

    private Long id;
    private String descricao;
    private Double preco;

    public ProdutoDTO(ProdutoModel produtoModel) {
        descricao = produtoModel.getDescricao();
        preco = produtoModel.getPreco();
    }
}
