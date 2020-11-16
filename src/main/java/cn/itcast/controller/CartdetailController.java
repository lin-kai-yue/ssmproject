package cn.itcast.controller;

import cn.itcast.domain.*;
import cn.itcast.service.AccountService;
import cn.itcast.service.CartdetailService;
import cn.itcast.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/cartdetail")
public class CartdetailController {

    @Autowired
    private CartdetailService cartdetailService;

    @Autowired
    private GoodsService goodsService;

    @Autowired
    private AccountService accountService;

    @RequestMapping("/add")
    public String add(int id,int goodsid,Model model){
        Cartdetail cartdetail=new Cartdetail();
        Goods goods=goodsService.findByid(goodsid);

        System.out.println(goods.getGoodsprices());
        cartdetail.setUid(id);
        cartdetail.setGoodsid(goodsid);
        cartdetailService.saveCart(cartdetail,goods.getGoodsprices());
        Account account = accountService.findbyid(id);
        List<Goods> goodslist = goodsService.findAll();
        model.addAttribute("account",account);
        model.addAttribute("goodslist",goodslist);
        List<Cart> cartlist = cartdetailService.findcart(id);
        Cartcount cartcount=cartdetailService.countcart(id);
        model.addAttribute("cartlist",cartlist);
        model.addAttribute("cartcount",cartcount);

        return "main";


    }
    @RequestMapping("/findCart")
    public String findCart(Model model,int uid){
        System.out.println("表现层：查询购物车");
        // 调用service的方法
        List<Cart> cartlist = cartdetailService.findcart(uid);
        Cartcount cartcount=cartdetailService.countcart(uid);
        model.addAttribute("cartlist",cartlist);
        model.addAttribute("cartcount",cartcount);
        return "cart";
    }

    @RequestMapping("/deletegood")
    public String Deletegood(Model model,int uid,int goodsid){
        System.out.println("表现层：查询购物车");
        // 调用service的方法
        cartdetailService.Deletegood(uid,goodsid);
        List<Cart> cartlist = cartdetailService.findcart(uid);
        Cartcount cartcount=cartdetailService.countcart(uid);
        model.addAttribute("cartlist",cartlist);
        model.addAttribute("cartcount",cartcount);

        return "cart";
    }
}
