package com.newroad.manage.entity;

import java.util.Date;

public class Industry {
    private Integer id;

    private String industryname;

    private Date recorddate;

    private Integer recorduserid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIndustryname() {
        return industryname;
    }

    public void setIndustryname(String industryname) {
        this.industryname = industryname;
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