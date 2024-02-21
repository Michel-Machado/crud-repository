package com.estudos.crud.controllers;

import com.estudos.crud.models.dto.PedidoDTO;
import com.estudos.crud.models.entities.ClienteModel;
import com.estudos.crud.models.entities.ItemPedidoModel;
import com.estudos.crud.models.entities.PedidoModel;
import com.estudos.crud.models.entities.ProdutoModel;
import com.estudos.crud.repositories.ClienteRepository;
import com.estudos.crud.repositories.ItemPedidoRepository;
import com.estudos.crud.repositories.PedidoRepository;
import com.estudos.crud.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedido")
public class PedidoController {

    @Autowired
    private PedidoRepository pedidoRepository;
    @Autowired
    private ProdutoRepository produtoRepository;
    @Autowired
    private ItemPedidoRepository itemPedidoRepository;
    @Autowired
    private ClienteRepository clienteRepository;


    @GetMapping
    public ResponseEntity<List<PedidoDTO>> buscaPedido(){

        List<ItemPedidoModel> pedidoModelList = itemPedidoRepository.findAll();
       List<PedidoDTO> pedidoDTOList = pedidoModelList.stream().map(PedidoDTO::new).toList();
        return ResponseEntity.status(HttpStatus.FOUND).body(pedidoDTOList);
    }


    @PostMapping
    public ResponseEntity<ItemPedidoModel> cadastraPedido(@RequestBody PedidoModel pedido,
                                                          @RequestParam Long idproduto,
                                                          @RequestParam int quantidade,
                                                          @RequestParam Long idCliente){
        pedidoRepository.save(pedido);

        ProdutoModel produto = produtoRepository.findById(idproduto).orElseThrow();
        ClienteModel clienteModel = clienteRepository.findById(idCliente).orElseThrow();
        ItemPedidoModel itemPedido = new ItemPedidoModel(clienteModel,pedido,produto,quantidade);
        itemPedidoRepository.save(itemPedido);

        return ResponseEntity.status(HttpStatus.CREATED).body(itemPedido);
    }

}
