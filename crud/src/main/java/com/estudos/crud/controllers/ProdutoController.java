package com.estudos.crud.controllers;

import com.estudos.crud.models.entities.ProdutoModel;
import com.estudos.crud.models.dto.ProdutoDTO;
import com.estudos.crud.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "crud-repository-production.up.railway.app")
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public ResponseEntity<List<ProdutoDTO>> findAllProduct(){
            List<ProdutoDTO> produtoDTOList = produtoService.findAllProducts();
        return ResponseEntity.status(HttpStatus.OK).body(produtoDTOList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProdutoDTO> findById(@PathVariable Long id){
          ProdutoDTO produtoDTO =  produtoService.findProductsByid(id);
        return ResponseEntity.status(HttpStatus.OK).body(produtoDTO);
    }

    @PostMapping ResponseEntity<ProdutoDTO> cadastraProduto(@RequestBody ProdutoModel produtoModel){


        return ResponseEntity.status(HttpStatus.CREATED).body(produtoService.salvaProduto(produtoModel));
    }


}
