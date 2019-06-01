package com.newroad.manage.entity;

import java.util.Date;

public class TaxOrgan1 {
    private Integer id;

    private String organname;

    private Integer parentid;

    private String address;

    private String phone;

    private String faxphone;

    private String email;

    private Integer leaderid;

    private String taxtypecode;

    private Integer state;

    private Date recorddate;

    private Integer recorduserid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrganname() {
        return organname;
    }

    public void setOrganname(String organname) {
        this.organname = organname;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFaxphone() {
        return faxphone;
    }

    public void setFaxphone(String faxphone) {
        this.faxphone = faxphone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getLeaderid() {
        return leaderid;
    }

    public void setLeaderid(Integer leaderid) {
        this.leaderid = leaderid;
    }

    public String getTaxtypecode() {
        return taxtypecode;
    }

    public void setTaxtypecode(String taxtypecode) {
        this.taxtypecode = taxtypecode;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
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