package com.newroad.manage.entity;

import java.util.Date;

public class TaxSource {
    private Integer id;

    private Integer payerid;

    private String taskname;

    private Integer suborganid;

    private Integer approverid;

    private Integer executeid;

    private Date executetime;

    private String taskfrom;

    private String taskstate;

    private String idea;

    private Integer risklevel;

    private Date recordtaskdate;

    private Integer recorduserid;

    private Integer removestate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPayerid() {
        return payerid;
    }

    public void setPayerid(Integer payerid) {
        this.payerid = payerid;
    }

    public String getTaskname() {
        return taskname;
    }

    public void setTaskname(String taskname) {
        this.taskname = taskname;
    }

    public Integer getSuborganid() {
        return suborganid;
    }

    public void setSuborganid(Integer suborganid) {
        this.suborganid = suborganid;
    }

    public Integer getApproverid() {
        return approverid;
    }

    public void setApproverid(Integer approverid) {
        this.approverid = approverid;
    }

    public Integer getExecuteid() {
        return executeid;
    }

    public void setExecuteid(Integer executeid) {
        this.executeid = executeid;
    }

    public Date getExecutetime() {
        return executetime;
    }

    public void setExecutetime(Date executetime) {
        this.executetime = executetime;
    }

    public String getTaskfrom() {
        return taskfrom;
    }

    public void setTaskfrom(String taskfrom) {
        this.taskfrom = taskfrom;
    }

    public String getTaskstate() {
        return taskstate;
    }

    public void setTaskstate(String taskstate) {
        this.taskstate = taskstate;
    }

    public String getIdea() {
        return idea;
    }

    public void setIdea(String idea) {
        this.idea = idea;
    }

    public Integer getRisklevel() {
        return risklevel;
    }

    public void setRisklevel(Integer risklevel) {
        this.risklevel = risklevel;
    }

    public Date getRecordtaskdate() {
        return recordtaskdate;
    }

    public void setRecordtaskdate(Date recordtaskdate) {
        this.recordtaskdate = recordtaskdate;
    }

    public Integer getRecorduserid() {
        return recorduserid;
    }

    public void setRecorduserid(Integer recorduserid) {
        this.recorduserid = recorduserid;
    }

    public Integer getRemovestate() {
        return removestate;
    }

    public void setRemovestate(Integer removestate) {
        this.removestate = removestate;
    }
}