package cn.itcast.domain;

import java.util.Date;

public class OrdersList {
    private Integer id;
    private Integer uid;
    private Integer goodsid;
    private Integer num;
    private double money;
    private Date orderstime;
    private String goodsname;
    private double goodsprices;
    private String pictersrc;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public Date getOrderstime() {
        return orderstime;
    }

    public void setOrderstime(Date orderstime) {
        this.orderstime = orderstime;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
    }

    public double getGoodsprices() {
        return goodsprices;
    }

    public void setGoodsprices(double goodsprices) {
        this.goodsprices = goodsprices;
    }

    public String getPictersrc() {
        return pictersrc;
    }

    public void setPictersrc(String pictersrc) {
        this.pictersrc = pictersrc;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "OrdersList{" +
                "id=" + id +
                ", uid=" + uid +
                ", goodsid=" + goodsid +
                ", num=" + num +
                ", money=" + money +
                ", orderstime=" + orderstime +
                ", goodsname='" + goodsname + '\'' +
                ", goodsprices=" + goodsprices +
                ", pictersrc='" + pictersrc + '\'' +
                '}';
    }
}
