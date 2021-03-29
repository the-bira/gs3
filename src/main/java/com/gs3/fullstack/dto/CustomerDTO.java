package com.gs3.fullstack.dto;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

public class CustomerDTO {


    private Long id;

    @NotNull(message = "Nome é obrigatório")
    @NotEmpty(message = "Nome é obrigatório")
    @Size(min = 3, max = 100, message = "O nome deve conter entre 3 e 100 caracteres")
    private String name;

    @NotNull(message = "cpf é obrigatório")
    @NotEmpty(message = "cpf é obrigatório")
    private String cpf;

    @NotNull(message = "Endereço é é obrigatório")
    @Valid
    private AddressDTO address;

    @NotNull(message = "Ao menos 1 telefone deve ser cadastrado")
    private List<@Valid PhoneDTO> phones = new ArrayList<>();

    @NotNull(message = "Ao menos 1 email deve ser cadastrado")
    private List<@Valid EmailDTO> emails = new ArrayList<>();


    @NotNull(message = "usuário é obrigatório.")
    private @Valid UserDTO user;
}