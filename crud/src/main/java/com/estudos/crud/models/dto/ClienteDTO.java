package com.estudos.crud.models.dto;

import com.estudos.crud.models.ClienteModel;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClienteDTO {
    @NotBlank
    @NotEmpty
    private String nome;

    @Email
    @NotEmpty
    private String email;

    public ClienteDTO(ClienteModel clienteModel) {
        nome = clienteModel.getNome();
        email = clienteModel.getEmail();
    }
}
