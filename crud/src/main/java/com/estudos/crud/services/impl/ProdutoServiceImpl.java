package com.estudos.crud.services.impl;

import com.estudos.crud.models.entities.ProdutoModel;
import com.estudos.crud.models.dto.ProdutoDTO;
import com.estudos.crud.repositories.ProdutoRepository;
import com.estudos.crud.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoServiceImpl implements ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Override
    public List<ProdutoDTO> findAllProducts() {
        List<ProdutoModel> produtoModels = produtoRepository.findAll();
       return produtoModels.stream().map(ProdutoDTO::new).toList();
    }
    @Override
    public ProdutoDTO findProductsByid(Long id){
        Optional<ProdutoModel> produtoModel= produtoRepository.findById(id);
        if (produtoModel.isEmpty()){
            throw new RuntimeException("Cliente não encontrado");
        }
       return new  ProdutoDTO(produtoModel.get());
    }

    @Override
    public ProdutoDTO salvaProduto(ProdutoModel produtoModel) {

        return new ProdutoDTO(produtoRepository.save(produtoModel));
    }


}
