package com.kamilbrozek.carforyou.core.models;


import javax.persistence.*;

@Entity
@Table(name = "Customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private Long customer_id;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "documentType")
    private String documentType;

    @Column(name = "phone")
    private String phone;

    @Column(name = "AdditionalInfo")
    private String AdditionalInfo;

    public Customer() {
    }

    public Customer(String firstName, String lastName, String documentType, String phone, String additionalInfo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.documentType = documentType;
        this.phone = phone;
        AdditionalInfo = additionalInfo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAdditionalInfo() {
        return AdditionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        AdditionalInfo = additionalInfo;
    }
}
