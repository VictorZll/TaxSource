package com.newroad.system.entity;

public class User {
    private Integer id;

    private String username;

    private String password;

    private Integer taxerId;

    private String salt;

    private Integer permissionId;

    private Integer state;

    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getTaxerId() {
        return taxerId;
    }

    public void setTaxerid(Integer taxerId) {
        this.taxerId = taxerId;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Integer getPermissionId() {
        return permissionId;
    }

    public void setPermissionid(Integer permissionId) {
        this.permissionId = permissionId;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}