package com.groupeisi.spring_githupaction.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Prof {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false, length = 150)
    private String prenom;
    @Column(nullable = false, length = 200)
    private String nom;
    @Column(nullable = false, length = 200)
    private String email;
    @Column(nullable = false, length = 200)
    private String password;
    @Column(nullable = false, length = 200)
    private int etat;
}
