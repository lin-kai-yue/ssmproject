package cn.itcast.service;


import cn.itcast.domain.Goods;

import java.util.List;

public interface GoodsService {
    // 查询所有商品信息
    public List<Goods> findAll();

    //根据id查商品
    public  Goods findByid(int goodsid);

    //根据type查商品
    public  List<Goods> findBytype(String type);

    //根据name模糊查商品
    public  List<Goods> likename(String goodsname);

    //添加商品
    public void addGoods(Goods goods);

    //删除商品
    public void deletegood(int goodsid);
}
