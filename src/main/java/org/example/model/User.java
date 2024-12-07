package org.example.model;

public class User {
    private String nickname;
    private String username;
    private String phone;
    private String password;

    public User() {

    }

    public User(String nickname, String username, String phone, String password) {
        this.nickname = nickname;
        this.username = username;
        this.phone = phone;
        this.password = password;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
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

    public String getNickname() {
        return nickname;
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
