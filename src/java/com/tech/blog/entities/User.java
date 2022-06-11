
package com.tech.blog.entities;

 import java.sql.*;
public class User {
    private int id;
    private String name;
    private String email;
    private String password;
    private String gender;
    private Timestamp timestamp;

    public User(int id, String name, String email, String password, String gender, Timestamp timestamp) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.gender = gender;
        this.timestamp = timestamp;
    }

    public User() {
    }

    public User(String name, String email, String password, String gender, Timestamp timestamp) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.gender = gender;
        this.timestamp = timestamp;
    }

    public User(String names, String email, String password, String gender) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    // Getter and Setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }
    
    
}
