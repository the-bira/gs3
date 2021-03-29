package com.gs3.fullstack.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class EmailDTO {

    private Long id;
 
    @Email(message = "Email inválido")
    @NotNull(message = "Email é obrigatório")
    @NotEmpty(message = "Email é obrigatório")
    private String email;
}