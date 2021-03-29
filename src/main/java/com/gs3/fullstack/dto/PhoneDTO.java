package com.gs3.fullstack.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class PhoneDTO {

    Long id;

    @NotNull(message = "Telefone é obrigatório")
    @NotEmpty(message = "Telefone é obrigatório")
    private String phone;
}