package com.estudos.crud.services;

import com.estudos.crud.models.entities.ClienteModel;
import com.estudos.crud.models.dto.ClienteDTO;

import java.util.List;

public interface ClienteService {
    List<ClienteModel> getAllClientes();


    ClienteDTO getClienteById(Long id);

    void deleteClienteByid(Long id);

    ClienteDTO cadastraCliente(ClienteModel clientModel);

    ClienteDTO alteraCliente(ClienteModel clienteModel);
}
