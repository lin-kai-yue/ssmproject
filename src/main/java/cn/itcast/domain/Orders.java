package cn.itcast.domain;

import java.io.Serializable;
import java.util.Date;

public class Orders implements Serializable {
    private Integer id;
    private Integer uid;
    private Integer goodsid;
    private Integer num;
    private double money;
    private Date orderstime;

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

    public Date getOrderstime() {
        return orderstime;
    }

    public void setOrderstime(Date orderstime) {
        this.orderstime = orderstime;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", uid=" + uid +
                ", goodsid=" + goodsid +
                ", num=" + num +
                ", money=" + money +
                ", orderstime=" + orderstime +
                '}';
    }
}
