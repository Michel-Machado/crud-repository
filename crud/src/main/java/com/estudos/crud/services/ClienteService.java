package com.estudos.crud.services;

import com.estudos.crud.models.ClienteModel;
import com.estudos.crud.models.dto.ClienteDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface ClienteService {
    List<ClienteDTO> getAllClientes();


    ClienteDTO getClienteById(Long id);

    void deleteClienteByid(Long id);

    ClienteDTO cadastraCliente(ClienteModel clientModel);
}
