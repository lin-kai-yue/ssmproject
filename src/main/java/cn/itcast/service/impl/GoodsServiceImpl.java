package cn.itcast.service.impl;


import cn.itcast.dao.GoodsDao;
import cn.itcast.domain.Cart;
import cn.itcast.domain.Goods;
import cn.itcast.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("goodsService")
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsDao goodsDao;

    public List<Goods> findAll() {
        System.out.println("业务层：查询所有账户...");
        return goodsDao.findAll();
    }

    public Goods findByid(int goodsid) {
        System.out.println("业务层：根据用户名查询账户...");
        return goodsDao.findByid(goodsid);

    }

    @Override
    public List<Goods> findBytype(String type) {
        System.out.println("业务层：根据type查询商品...");
        return goodsDao.findBytype(type);
    }

    @Override
    public List<Goods> likename(String goodsname) {
        return goodsDao.likename(goodsname);
    }

    @Override
    public void addGoods(Goods goods) {
        goodsDao.addGoods(goods);
    }

    @Override
    public void deletegood(int goodsid) {
        goodsDao.deletegood(goodsid);
    }


}
