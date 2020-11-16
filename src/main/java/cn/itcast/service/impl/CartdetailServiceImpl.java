package cn.itcast.service.impl;

import cn.itcast.dao.AccountDao;
import cn.itcast.dao.CartdetailDao;
import cn.itcast.domain.*;
import cn.itcast.service.CartdetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("cartdetailService")
public class CartdetailServiceImpl implements CartdetailService {

    @Autowired
    private CartdetailDao cartdetailDao;

    public Boolean saveCart(Cartdetail cartdetail,double goodsprices) {
        System.out.println("业务层：查询是否goodsid重复");
        Cartdetail cd=cartdetailDao.findby(cartdetail);
        System.out.println("查到cd"+cd);
        if (cd==null){
            Cartdetail save=new Cartdetail();
            save.setUid(cartdetail.getUid());
            save.setGoodsid(cartdetail.getGoodsid());
            save.setNum(1);
            save.setMoney(1*goodsprices);
            System.out.println("查到save"+save);
            return cartdetailDao.savecart(save)>1;
        }
        else{
            cd.setNum(cd.getNum()+1);
            cd.setMoney(cd.getMoney()+goodsprices);
            return cartdetailDao.updateDetail(cd)>1;
        }
    }

    public List<Cart> findcart(int uid) {
        System.out.println("业务层：根据用户名查询账户...");
        return cartdetailDao.findcart(uid);
    }
    public Cartcount countcart(int uid) {
        System.out.println("业务层：根据uid查询购物车数量");
        return cartdetailDao.countcart(uid);
    }

    @Override
    public int Deletegood(int uid, int goodsid) {

        return cartdetailDao.deltegood(uid,goodsid);
    }

    @Override
    public int Deletegoods(int goodsid) {
        return cartdetailDao.deltegoods(goodsid);
    }


}
