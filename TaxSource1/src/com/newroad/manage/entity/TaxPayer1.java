package com.newroad.manage.entity;


public class TaxPayer1 {
    private Integer id;
    
    private String payerCode;

    private String payername;

    private String bizaddress;

    private Integer taxorganid;

    private Integer industryid;

    private String bizscope;

    private String invoicetype;

    private String legalperson;

    private String legalidcard;

    private String legalmobile;

    private String legalidcardimageurl;

    private String finacename;

    private String finaceidcard;

    private String finacemobile;

    private String finaceidcardimageurl;

    private String taxername;

    private String taxeridcard;

    private String taxermobile;

    private String taxeridcardimageurl;

    private String bizaddressphone;
//日期用String 不用Date格式
    private String recorddate;

    private Integer userid;

    private Integer removestate;
//联表查询新增的属性
    private String organName;
    private String industryName;
    
    public String getOrganName() {
		return organName;
	}

	public void setOrganName(String organName) {
		this.organName = organName;
	}

	public String getIndustryName() {
		return industryName;
	}

	public void setIndustryName(String industryName) {
		this.industryName = industryName;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPayerCode() {
        return payerCode;
    }

    public void setPayerCode(String payerCode) {
        this.payerCode = payerCode;
    }

    public String getPayername() {
        return payername;
    }

    public void setPayername(String payername) {
        this.payername = payername;
    }

    public String getBizaddress() {
        return bizaddress;
    }

    public void setBizaddress(String bizaddress) {
        this.bizaddress = bizaddress;
    }

    public Integer getTaxorganid() {
        return taxorganid;
    }

    public void setTaxorganid(Integer taxorganid) {
        this.taxorganid = taxorganid;
    }

    public Integer getIndustryid() {
        return industryid;
    }

    public void setIndustryid(Integer industryid) {
        this.industryid = industryid;
    }

    public String getBizscope() {
        return bizscope;
    }

    public void setBizscope(String bizscope) {
        this.bizscope = bizscope;
    }

    public String getInvoicetype() {
        return invoicetype;
    }

    public void setInvoicetype(String invoicetype) {
        this.invoicetype = invoicetype;
    }

    public String getLegalperson() {
        return legalperson;
    }

    public void setLegalperson(String legalperson) {
        this.legalperson = legalperson;
    }

    public String getLegalidcard() {
        return legalidcard;
    }

    public void setLegalidcard(String legalidcard) {
        this.legalidcard = legalidcard;
    }

    public String getLegalmobile() {
        return legalmobile;
    }

    public void setLegalmobile(String legalmobile) {
        this.legalmobile = legalmobile;
    }

    public String getLegalidcardimageurl() {
        return legalidcardimageurl;
    }

    public void setLegalidcardimageurl(String legalidcardimageurl) {
        this.legalidcardimageurl = legalidcardimageurl;
    }

    public String getFinacename() {
        return finacename;
    }

    public void setFinacename(String finacename) {
        this.finacename = finacename;
    }

    public String getFinaceidcard() {
        return finaceidcard;
    }

    public void setFinaceidcard(String finaceidcard) {
        this.finaceidcard = finaceidcard;
    }

    public String getFinacemobile() {
        return finacemobile;
    }

    public void setFinacemobile(String finacemobile) {
        this.finacemobile = finacemobile;
    }

    public String getFinaceidcardimageurl() {
        return finaceidcardimageurl;
    }

    public void setFinaceidcardimageurl(String finaceidcardimageurl) {
        this.finaceidcardimageurl = finaceidcardimageurl;
    }

    public String getTaxername() {
        return taxername;
    }

    public void setTaxername(String taxername) {
        this.taxername = taxername;
    }

    public String getTaxeridcard() {
        return taxeridcard;
    }

    public void setTaxeridcard(String taxeridcard) {
        this.taxeridcard = taxeridcard;
    }

    public String getTaxermobile() {
        return taxermobile;
    }

    public void setTaxermobile(String taxermobile) {
        this.taxermobile = taxermobile;
    }

    public String getTaxeridcardimageurl() {
        return taxeridcardimageurl;
    }

    public void setTaxeridcardimageurl(String taxeridcardimageurl) {
        this.taxeridcardimageurl = taxeridcardimageurl;
    }

    public String getBizaddressphone() {
        return bizaddressphone;
    }

    public void setBizaddressphone(String bizaddressphone) {
        this.bizaddressphone = bizaddressphone;
    }

    public String getRecorddate() {
        return recorddate;
    }

    public void setRecorddate(String recorddate) {
        this.recorddate = recorddate;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getRemovestate() {
        return removestate;
    }

    public void setRemovestate(Integer removestate) {
        this.removestate = removestate;
    }
}