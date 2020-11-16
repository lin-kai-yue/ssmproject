package cn.itcast.domain;

import java.io.Serializable;

public class Cartdetail implements Serializable {
    private Integer id;
    private Integer uid;
    private Integer goodsid;
    private Integer num;
    private double money;

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
        return "Cartdetail{" +
                "id=" + id +
                ", uid=" + uid +
                ", goodsid=" + goodsid +
                ", num=" + num +
                ", money=" + money +
                '}';
    }
}
