package com.estudos.crud.controllers;

import com.estudos.crud.models.entities.ClienteModel;
import com.estudos.crud.models.dto.ClienteDTO;
import com.estudos.crud.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public ResponseEntity<List<ClienteModel>> buscaClientes(){
      List<ClienteModel> clientes=  clienteService.getAllClientes();
        return ResponseEntity.status(HttpStatus.OK).body(clientes);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClienteDTO> buscaClientePorId(@PathVariable Long id){
        ClienteDTO clienteDTO = clienteService.getClienteById(id);

        return ResponseEntity.status(HttpStatus.FOUND).body(clienteDTO);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletaCliente(@PathVariable Long id){
        clienteService.deleteClienteByid(id);
       return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @PostMapping
    public ResponseEntity<ClienteDTO> cadastraCliente(@Validated @RequestBody ClienteModel clienteModel){

        return ResponseEntity.status(HttpStatus.CREATED).body(clienteService.cadastraCliente(clienteModel));
    }

    @PutMapping
    public ResponseEntity<ClienteDTO> alteraCliente(@RequestBody ClienteModel clienteModel){

        return ResponseEntity.status(HttpStatus.ACCEPTED).body(clienteService.alteraCliente(clienteModel));
    }
}
