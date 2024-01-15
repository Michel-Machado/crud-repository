package com.estudos.crud.models;

import com.estudos.crud.models.entities.ClienteModel;
import com.estudos.crud.models.entities.PedidoModel;
import com.estudos.crud.models.entities.ProdutoModel;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class ItemPedidoPK implements Serializable {

    @ManyToOne
    @JoinColumn(name = "pedido_id")
    private PedidoModel pedidoModel;

    @ManyToOne
    @JoinColumn(name = "produto_id")
    private ProdutoModel produtoModel;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private ClienteModel clienteModel;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemPedidoPK that = (ItemPedidoPK) o;
        return Objects.equals(pedidoModel, that.pedidoModel) && Objects.equals(produtoModel, that.produtoModel) && Objects.equals(clienteModel, that.clienteModel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pedidoModel, produtoModel, clienteModel);
    }
}
