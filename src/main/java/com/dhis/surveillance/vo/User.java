package com.dhis.surveillance.vo;

public class User {
    private String userid;
    private String username;
    private String password;
    private String role;
    private String email;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User(String userid, String username, String password, String role, String email) {
        this.userid = userid;
        this.username = username;
        this.password = password;
        this.role = role;
        this.email = email;
    }
}
