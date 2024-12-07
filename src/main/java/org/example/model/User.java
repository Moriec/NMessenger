package org.example.model;

public class User {
    private String username;
    private String name;
    private String phone;
    private String password;

    User() {

    }

    User(String username, String name, String phone, String password) {
        this.username = username;
        this.name = name;
        this.phone = phone;
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getPhone() {
        return phone;
    }

    public String getUsername() {
        return username;
    }
}
