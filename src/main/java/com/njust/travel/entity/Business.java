package com.njust.travel.entity;

import javax.persistence.*;

@Entity
@Table(name = "business")
public class Business {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "name",length = 30)
    private String name;
    @Column(name = "scenicname",length = 30)
    private String scenicname;
    @Column(name = "agencyid")
    private Integer agencyid;
    @Column(name = "price",length = 20)
    private String price;
    @Column(name = "scale",length = 10)
    private String scale;
    @Column(name = "nop")
    private Integer nop;
    @Column(name = "place",length = 200)
    private String place;
    @Column(name = "way",length = 100)
    private String way;
    @Column(name = "vehicle",length = 20)
    private String vehicle;
    @Column(name = "renop")
    private Integer renop;
    @Column(name = "introduce",length = 500)
    private String introduce;
    @Column(name = "p1",length = 50)
    private String p1;
    @Column(name = "p2",length = 50)
    private String p2;
    @Column(name = "p3",length = 50)
    private String p3;
    @Column(name = "p4",length = 50)
    private String p4;
    @Column(name = "p5",length = 50)
    private String p5;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScenicname() {
        return scenicname;
    }

    public void setScenicname(String scenicname) {
        this.scenicname = scenicname;
    }

    public Integer getAgencyid() {
        return agencyid;
    }

    public void setAgencyid(Integer agencyid) {
        this.agencyid = agencyid;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getScale() {
        return scale;
    }

    public void setScale(String scale) {
        this.scale = scale;
    }

    public Integer getNop() {
        return nop;
    }

    public void setNop(Integer nop) {
        this.nop = nop;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getWay() {
        return way;
    }

    public void setWay(String way) {
        this.way = way;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public Integer getRenop() {
        return renop;
    }

    public void setRenop(Integer renop) {
        this.renop = renop;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public String getP1() {
        return p1;
    }

    public void setP1(String p1) {
        this.p1 = p1;
    }

    public String getP2() {
        return p2;
    }

    public void setP2(String p2) {
        this.p2 = p2;
    }

    public String getP3() {
        return p3;
    }

    public void setP3(String p3) {
        this.p3 = p3;
    }

    public String getP4() {
        return p4;
    }

    public void setP4(String p4) {
        this.p4 = p4;
    }

    public String getP5() {
        return p5;
    }

    public void setP5(String p5) {
        this.p5 = p5;
    }

    @Override
    public String toString() {
        return "Business{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", scenicname='" + scenicname + '\'' +
                ", agencyid=" + agencyid +
                ", price='" + price + '\'' +
                ", scale='" + scale + '\'' +
                ", nop=" + nop +
                ", place='" + place + '\'' +
                ", way='" + way + '\'' +
                ", vehicle='" + vehicle + '\'' +
                ", renop=" + renop +
                ", introduce='" + introduce + '\'' +
                ", p1='" + p1 + '\'' +
                ", p2='" + p2 + '\'' +
                ", p3='" + p3 + '\'' +
                ", p4='" + p4 + '\'' +
                ", p5='" + p5 + '\'' +
                '}';
    }
}
