package com.example.test1.demo.dao.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "bank")
public class Bank implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bank_id")
    private Long id;

    @Column(name = "bank_name")
    private  String bname;

    @Column(name = "bank_account")
    private String baccount;

    @Column(name = "user_name")
    private String uname;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
