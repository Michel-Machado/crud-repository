package com.estudos.crud.repositories;

import com.estudos.crud.models.ItemPedidoPK;
import com.estudos.crud.models.entities.ItemPedidoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemPedidoRepository extends JpaRepository<ItemPedidoModel, ItemPedidoPK> {
}
