package com.kamilbrozek.carforyou.core.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name ="Users")
public class User {

    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "login",nullable = false, unique = true)
    private String login;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "isActive")
    private boolean isActive;

    @Column(name = "email")
    private String email;

    @Column(name = "registerDate")
    private Date registerDate;

    private Date lastLogin;

    public User() {
    }

    public User(String login, String password, String email, Date registerDate, Date lastLogin) {
        this.login = login;
        this.password = password;
        this.email = email;
        this.registerDate = registerDate;
        this.lastLogin = lastLogin;
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
}
