package com.newroad.system.entity;

public class User {
    private Integer id;

    private String username;

    private String password;

    private Integer taxerid;

    private String salt;

    private Integer permissionid;

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

    public Integer getTaxerid() {
        return taxerid;
    }

    public void setTaxerid(Integer taxerid) {
        this.taxerid = taxerid;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Integer getPermissionid() {
        return permissionid;
    }

    public void setPermissionid(Integer permissionid) {
        this.permissionid = permissionid;
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

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", taxerid=" + taxerid
				+ ", salt=" + salt + ", permissionid=" + permissionid + ", state=" + state + ", email=" + email + "]";
	}

	public User(Integer id, String username, String password, Integer taxerid, String salt, Integer permissionid,
			Integer state, String email) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.taxerid = taxerid;
		this.salt = salt;
		this.permissionid = permissionid;
		this.state = state;
		this.email = email;
	}

	public User() {
		super();
	}
	
	
    
}