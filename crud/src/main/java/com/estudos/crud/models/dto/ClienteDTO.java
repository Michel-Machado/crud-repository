package com.estudos.crud.models.dto;

import com.estudos.crud.models.entities.ClienteModel;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ClienteDTO {

    private Long id;

    @NotBlank
    @NotEmpty
    private String nome;

    @Email
    @NotEmpty
    private String email;

    public ClienteDTO(Long id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    public ClienteDTO(ClienteModel clienteModel) {
        id = clienteModel.getId();
        nome = clienteModel.getNome();
        email = clienteModel.getEmail();
    }
}
