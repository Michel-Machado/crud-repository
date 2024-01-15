package com.estudos.crud.models.dto;

import com.estudos.crud.models.entities.ClienteModel;
import com.estudos.crud.models.entities.ItemPedidoModel;
import com.estudos.crud.models.entities.PedidoModel;
import com.estudos.crud.models.entities.ProdutoModel;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PedidoDTO {

    private Long idPedido;
    private LocalDate data;

    private Long idProduto;
    private String descricao;
    private Double preco;

    private Long idCliente;
    private String nome;
    private String email;

    public PedidoDTO(ItemPedidoModel itemPedidoModel) {
       idPedido = itemPedidoModel.getId().getPedidoModel().getId();
       data = itemPedidoModel.getId().getPedidoModel().getData();
       idProduto = itemPedidoModel.getId().getProdutoModel().getId();
       descricao = itemPedidoModel.getId().getProdutoModel().getDescricao();
       preco = itemPedidoModel.getId().getProdutoModel().getPreco();
       idCliente = itemPedidoModel.getId().getClienteModel().getId();
       nome = itemPedidoModel.getId().getClienteModel().getNome();
       email = itemPedidoModel.getId().getClienteModel().getEmail();
    }
}
