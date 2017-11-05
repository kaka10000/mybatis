package com.jeff.mybatis.po;

import java.io.Serializable;

public class Resource implements Serializable {
    private Integer id;

    private String resname;

    private String resurl;

    private Integer resdep;

    private Integer parentid;

    private Integer restype;

    private Integer resorder;

    private Integer resauth;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getResname() {
        return resname;
    }

    public void setResname(String resname) {
        this.resname = resname == null ? null : resname.trim();
    }

    public String getResurl() {
        return resurl;
    }

    public void setResurl(String resurl) {
        this.resurl = resurl == null ? null : resurl.trim();
    }

    public Integer getResdep() {
        return resdep;
    }

    public void setResdep(Integer resdep) {
        this.resdep = resdep;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public Integer getRestype() {
        return restype;
    }

    public void setRestype(Integer restype) {
        this.restype = restype;
    }

    public Integer getResorder() {
        return resorder;
    }

    public void setResorder(Integer resorder) {
        this.resorder = resorder;
    }

    public Integer getResauth() {
        return resauth;
    }

    public void setResauth(Integer resauth) {
        this.resauth = resauth;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", resname=").append(resname);
        sb.append(", resurl=").append(resurl);
        sb.append(", resdep=").append(resdep);
        sb.append(", parentid=").append(parentid);
        sb.append(", restype=").append(restype);
        sb.append(", resorder=").append(resorder);
        sb.append(", resauth=").append(resauth);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}