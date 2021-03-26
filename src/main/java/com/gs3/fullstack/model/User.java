package com.gs3.fullstack.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @OneToOne(cascade = CascadeType.ALL)
    private Address addresses;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "email_id")
    private List<Email> emails;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "phone_id")
    private List<Phone> phones;

    
}
