package com.yc.petshop.bean;

import java.util.Date;

public class Pets {
    private Integer pid;

    private String pname;

    private Date page;

    private Integer psex;

    private String ptype;

    private Date pdate;

    private Integer psale;

    private String pimage;

    private String pdesc;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname == null ? null : pname.trim();
    }

    public Date getPage() {
        return page;
    }

    public void setPage(Date page) {
        this.page = page;
    }

    public Integer getPsex() {
        return psex;
    }

    public void setPsex(Integer psex) {
        this.psex = psex;
    }

    public String getPtype() {
        return ptype;
    }

    public void setPtype(String ptype) {
        this.ptype = ptype == null ? null : ptype.trim();
    }

    public Date getPdate() {
        return pdate;
    }

    public void setPdate(Date pdate) {
        this.pdate = pdate;
    }

    public Integer getPsale() {
        return psale;
    }

    public void setPsale(Integer psale) {
        this.psale = psale;
    }

    public String getPimage() {
        return pimage;
    }

    public void setPimage(String pimage) {
        this.pimage = pimage == null ? null : pimage.trim();
    }

    public String getPdesc() {
        return pdesc;
    }

    public void setPdesc(String pdesc) {
        this.pdesc = pdesc == null ? null : pdesc.trim();
    }
}