package com.kamilbrozek.carforyou.core.models;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name ="Users")
public class User {

    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String password;

    @Column(name = "isActive")
    private boolean isActive;

    @Column(name = "email")
    private String email;

    @Column(name = "registerDate")
    private Date registerDate;

    @Column(name = "lastLogin")
    private Date lastLogin;

    @Column(name = "role")
    private Long role;


//    virtual


    public User(Long id) {

    }

    public User(String login, String password, boolean isActive, String email, Date registerDate, Date lastLogin, Long role) {
        this.login = login;
        this.password = password;
        this.isActive = isActive;
        this.email = email;
        this.registerDate = registerDate;
        this.lastLogin = lastLogin;
        this.role = role;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    public Long getRole() {
        return role;
    }

    public void setRole(Long role) {
        this.role = role;
    }
}

