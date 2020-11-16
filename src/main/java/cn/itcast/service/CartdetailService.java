package cn.itcast.service;

import cn.itcast.domain.*;

import java.util.List;

public interface CartdetailService {

    //添加购物车
    public Boolean saveCart(Cartdetail cartdetail, double goodsprices);

    //查询购物车内容
    public List<Cart> findcart(int uid);

    //查询总金额及总数
    public Cartcount countcart(int uid);

    //删除购物车物品
    public int Deletegood(int uid,int goodsid);

    //删除购物车物品
    public int Deletegoods(int goodsid);
}
