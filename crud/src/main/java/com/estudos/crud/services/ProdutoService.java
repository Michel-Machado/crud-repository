package com.estudos.crud.services;

import com.estudos.crud.models.entities.ProdutoModel;
import com.estudos.crud.models.dto.ProdutoDTO;

import java.util.List;


public interface ProdutoService  {
    List<ProdutoDTO> findAllProducts();

    ProdutoDTO findProductsByid(Long id);

    ProdutoDTO salvaProduto(ProdutoModel produtoModel);
}
