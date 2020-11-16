package cn.itcast.domain;

import java.io.Serializable;

/**
 * 商品
 */
public class Goods implements Serializable {
    private Integer id;
    private Integer goodsid;
    private String goodsname;
    private double goodsprices;
    private String pictersrc;
    private String type;
    private String firmname;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFirmname() {
        return firmname;
    }

    public void setFirmname(String firmname) {
        this.firmname = firmname;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", goodsid=" + goodsid +
                ", goodsname='" + goodsname + '\'' +
                ", goodsprices=" + goodsprices +
                ", pictersrc='" + pictersrc + '\'' +
                ", type='" + type + '\'' +
                ", firmname='" + firmname + '\'' +
                '}';
    }
}
