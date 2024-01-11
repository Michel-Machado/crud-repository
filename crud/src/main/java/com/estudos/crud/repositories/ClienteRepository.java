package com.estudos.crud.repositories;

import com.estudos.crud.models.ClienteModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteModel, Long> {
}
