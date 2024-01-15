package com.estudos.crud.models.entities;

import com.estudos.crud.models.ItemPedidoPK;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_ItemPedido")
public class ItemPedidoModel {

    @EmbeddedId
    private ItemPedidoPK id = new ItemPedidoPK();
    private int quantidade;

    public ItemPedidoModel(ClienteModel clienteModel,PedidoModel pedidoModel, ProdutoModel produtoModel, int quantidade) {
        id.setPedidoModel(pedidoModel);
        id.setProdutoModel(produtoModel);
        id.setClienteModel(clienteModel);
        this.quantidade = quantidade;
    }
}
