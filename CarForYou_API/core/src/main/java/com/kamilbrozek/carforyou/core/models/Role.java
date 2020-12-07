package com.kamilbrozek.carforyou.core.models;


import javax.persistence.*;

@Entity
@Table(name = "Roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private Long Id;

    private String roleName;


}
