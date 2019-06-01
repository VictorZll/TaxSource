package com.newroad.manage.entity;

import java.util.Date;

public class TaxSource1 {
    private Integer id;

    private Integer payerid;

    private String taskname;

    private Integer suborganid;

    private Integer approverid;

    private Integer executeid;

    private String executetime;

    private String taskfrom;

    private String taskstate;

    private String idea;

    private Integer risklevel;

    private String recordtaskdate;

    private Integer recorduserid;

    private Integer removestate;
//连表查询新增属性
    private Integer payercode;
    
    private String payername;
    
    private String organname;
    
    private String industryname;
    
    private String bizscope;
    
    private String outtime;
    
    

    public Integer getPayercode() {
		return payercode;
	}

	public void setPayercode(Integer payercode) {
		this.payercode = payercode;
	}

	public String getPayername() {
		return payername;
	}

	public void setPayername(String payername) {
		this.payername = payername;
	}

	public String getOrganname() {
		return organname;
	}

	public void setOrganname(String organname) {
		this.organname = organname;
	}

	public String getIndustryname() {
		return industryname;
	}

	public void setIndustryname(String industryname) {
		this.industryname = industryname;
	}

	public String getBizscope() {
		return bizscope;
	}

	public void setBizscope(String bizscope) {
		this.bizscope = bizscope;
	}

	public String getOuttime() {
		return outtime;
	}

	public void setOuttime(String outtime) {
		this.outtime = outtime;
	}

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

    public String getExecutetime() {
        return executetime;
    }

    public void setExecutetime(String executetime) {
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

    public String getRecordtaskdate() {
        return recordtaskdate;
    }

    public void setRecordtaskdate(String recordtaskdate) {
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