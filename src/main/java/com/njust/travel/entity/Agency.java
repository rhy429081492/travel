package com.njust.travel.entity;

import javax.persistence.*;

@Entity
@Table(name = "agency")
public class Agency {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "username",length = 20)
    private String username;
    @Column(name = "password",length = 20)
    private String password;
    @Column(name = "name",length = 15)
    private String name;
    @Column(name = "cid",length = 18)
    private String cid;
    @Column(name = "tel",length = 11)
    private String tel;
    @Column(name = "licencesite",length = 50)
    private String licencesite;
    @Column(name = "agencyname",length = 30)
    private String agencyname;
    @Column(name = "status")
    private Boolean status;
    @Column(name = "email",length = 30)
    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getLicencesite() {
        return licencesite;
    }

    public void setLicencesite(String licencesite) {
        this.licencesite = licencesite;
    }

    public String getAgencyname() {
        return agencyname;
    }

    public void setAgencyname(String agencyname) {
        this.agencyname = agencyname;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Agency{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", cid='" + cid + '\'' +
                ", tel='" + tel + '\'' +
                ", licencesite='" + licencesite + '\'' +
                ", agencyname='" + agencyname + '\'' +
                ", status=" + status +
                ", email='" + email + '\'' +
                '}';
    }
}
