package com.example.test1.demo.dto;

public class BankDTO {
    private Long id;

    @Override
    public String toString() {
        return "BankDTO{" +
                "id=" + id +
                ", bname='" + bname + '\'' +
                ", baccount='" + baccount + '\'' +
                ", uname='" + uname + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private String bname;
    private String baccount;
    private String uname;

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getBaccount() {
        return baccount;
    }

    public void setBaccount(String baccount) {
        this.baccount = baccount;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }
}
