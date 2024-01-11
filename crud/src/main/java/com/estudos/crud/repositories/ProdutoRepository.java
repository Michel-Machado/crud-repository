package com.estudos.crud.repositories;

import com.estudos.crud.models.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<ProdutoModel, Long> {
}
