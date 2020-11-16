package cn.itcast.domain;

public class Cart {
    private Integer id;
    private Integer goodsid;
    private String goodsname;
    private double goodsprices;
    private String pictersrc;
    private  Integer uid;
    private Integer num;
    private  double money;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
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

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "id=" + id +
                ", goodsid=" + goodsid +
                ", goodsname='" + goodsname + '\'' +
                ", goodsprices=" + goodsprices +
                ", pictersrc='" + pictersrc + '\'' +
                ", uid=" + uid +
                ", num=" + num +
                ", money=" + money +
                '}';
    }
}
