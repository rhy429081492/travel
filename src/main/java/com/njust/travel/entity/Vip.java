package com.njust.travel.entity;

import javax.persistence.*;

@Entity
@Table(name = "vip")
public class Vip {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "username",length = 20)
    private String username;
    @Column(name = "password",length = 20)
    private String password;
    @Column(name = "name",length = 15)
    private String name;
    @Column(name = "sex",length = 5)
    private String sex;
    @Column(name = "age")
    private Integer age;
    @Column(name = "cid",length = 18)
    private String cid;
    @Column(name = "tel",length = 11)
    private String tel;
    @Column(name = "email",length = 30)
    private String email;
    @Column(name = "status")
    private Boolean status;

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Vip{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", cid='" + cid + '\'' +
                ", tel='" + tel + '\'' +
                ", email='" + email + '\'' +
                ", status=" + status +
                '}';
    }
}
