package com.newroad.manage.entity;

import java.util.Date;

public class Taxer1 {
    private Integer id;

    private String taxercode;

    private String taxername;

    private String mobile;

    private String address;

    private String sex;

    private Date birthday;

    private String email;

    private Integer organid;

    private Integer state;

    private Integer mgr;

    private Integer admin;

    private Date recorddate;

    private Integer recorduserid;
    
 //连表查询新属性
    
    private String boss;
    
    private String clerk;
    
    public String getBoss() {
		return boss;
	}

	public void setBoss(String boss) {
		this.boss = boss;
	}

	public String getClerk() {
		return clerk;
	}

	public void setClerk(String clerk) {
		this.clerk = clerk;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTaxercode() {
        return taxercode;
    }

    public void setTaxercode(String taxercode) {
        this.taxercode = taxercode;
    }

    public String getTaxername() {
        return taxername;
    }

    public void setTaxername(String taxername) {
        this.taxername = taxername;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getOrganid() {
        return organid;
    }

    public void setOrganid(Integer organid) {
        this.organid = organid;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getMgr() {
        return mgr;
    }

    public void setMgr(Integer mgr) {
        this.mgr = mgr;
    }

    public Integer getAdmin() {
        return admin;
    }

    public void setAdmin(Integer admin) {
        this.admin = admin;
    }

    public Date getRecorddate() {
        return recorddate;
    }

    public void setRecorddate(Date recorddate) {
        this.recorddate = recorddate;
    }

    public Integer getRecorduserid() {
        return recorduserid;
    }

    public void setRecorduserid(Integer recorduserid) {
        this.recorduserid = recorduserid;
    }
}