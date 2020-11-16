package cn.itcast.domain;

public class ViewCart {
    private String name;
    private double price;
    private int num;
    private double money;
    private int goodsid;//商品主键

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public int getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(int goodsid) {
        this.goodsid = goodsid;
    }

    @Override
    public String toString() {
        return "ViewCart{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", num=" + num +
                ", money=" + money +
                ", goodsid=" + goodsid +
                '}';
    }
}
