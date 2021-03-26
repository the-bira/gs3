package com.gs3.fullstack.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Address {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String cep;

    @Column(nullable = false)
    private String publicArea;

    @Column(nullable = false)
    private String district;

    @Column(nullable = false)
    private Long number;

    @Column(nullable = false)
    private String city;

    @Column(nullable = false)
    private String fs;
}
