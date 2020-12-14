package com.kamilbrozek.carforyou.core.models;


import javax.persistence.*;

@Entity
@Table(name = "Documents")
public class Document {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "document_id")
    private Long document_id;


}
