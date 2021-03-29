package com.gs3.fullstack.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class AddressDTO {
    private Long id;

    @NotNull(message = "cep é obrigatório")
    @NotEmpty(message = "cep é obrigatório")
    private String cep;

    @NotNull(message = "logradouro é obrigatório")
    @NotEmpty(message = "logradouro é obrigatório")
    private String publicArea;

    @NotNull(message = "bairro é obrigatório")
    @NotEmpty(message = "bairro é obrigatório")
    private String district;

    @NotNull(message = "Número é obrigatório")
    @NotEmpty(message = "Número é obrigatório")
    private Long number;

    @NotNull(message = "cidade é obrigatório")
    @NotEmpty(message = "cidade é obrigatório")
    private String city;

    @NotNull(message = "uf é obrigatório")
    @NotEmpty(message = "uf é obrigatório")
    private String fs;

}
