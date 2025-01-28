package com.ci.tgid.api_users.dtos;

public class UserCreateDTO {

    private String username;
    private String password;

    public UserCreateDTO() {
    }

    public UserCreateDTO(String username, String password) {
        this.username = username;
        this.password = password;
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
}
