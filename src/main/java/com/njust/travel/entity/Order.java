package com.njust.travel.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "viporder")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "date")
    private Date date;
    @Column(name = "status")
    private Boolean status;
    @Column(name = "discuss",length = 500)
    private String discuss;
    @Column(name = "level")
    private Integer level;
    @Column(name = "businessid")
    private Integer businessid;
    @Column(name = "vipid")
    private Integer vipid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getDiscuss() {
        return discuss;
    }

    public void setDiscuss(String discuss) {
        this.discuss = discuss;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getBusinessid() {
        return businessid;
    }

    public void setBusinessid(Integer businessid) {
        this.businessid = businessid;
    }

    public Integer getVipid() {
        return vipid;
    }

    public void setVipid(Integer vipid) {
        this.vipid = vipid;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", date=" + date +
                ", status=" + status +
                ", discuss='" + discuss + '\'' +
                ", level=" + level +
                ", businessid=" + businessid +
                ", vipid=" + vipid +
                '}';
    }
}
