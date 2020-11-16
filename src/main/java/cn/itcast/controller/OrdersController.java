package cn.itcast.controller;

import cn.itcast.domain.*;
import cn.itcast.service.CartdetailService;
import cn.itcast.service.GoodsService;
import cn.itcast.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PipedReader;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/orders")
public class OrdersController {
    @Autowired
    private OrdersService ordersService;

    @Autowired
    private GoodsService goodsService;

    @Autowired
    private CartdetailService cartdetailService;

    @RequestMapping("/savecart")
    public void savecart(int uid, HttpServletRequest request, HttpServletResponse response) throws IOException {

        List<Cart> list=cartdetailService.findcart(uid);
        for(Cart cart : list){
            System.out.println(cart);
            Orders orders=new Orders();
            orders.setUid(uid);
            orders.setGoodsid(cart.getGoodsid());
            orders.setNum(cart.getNum());
            orders.setMoney(cart.getMoney());
            orders.setOrderstime(new Date());
            ordersService.saveorders(orders);
            cartdetailService.Deletegood(uid,orders.getGoodsid());
        }
        Cartdetail cartdetail=new Cartdetail();
        cartdetail.setUid(1);
        cartdetail.setGoodsid(0);
        cartdetailService.saveCart(cartdetail,0);
        Cartcount cartcount=cartdetailService.countcart(uid);
        response.sendRedirect(request.getContextPath()+"/orders/findbyuid?uid="+uid);
    }
    @RequestMapping("/save")
    public void save(int uid,int goodsid, HttpServletRequest request, HttpServletResponse response) throws IOException {
        Goods goods=goodsService.findByid(goodsid);
        Orders orders=new Orders();
        orders.setUid(uid);
        orders.setGoodsid(goodsid);
        orders.setMoney(goods.getGoodsprices());
        orders.setNum(1);
        orders.setOrderstime(new Date());
        ordersService.saveorders(orders);
        response.sendRedirect(request.getContextPath()+"/orders/findbyuid?uid="+uid);

    }
    @RequestMapping("/findbyuid")
    public String findbyuid(int uid, HttpServletRequest request, HttpServletResponse response, Model model) throws IOException {
        List<OrdersList> ordersList=ordersService.findorderslist(uid);
        /*ordersService.saveorders(orders);*/
        model.addAttribute("ordersList",ordersList);
        List<Cart> cartlist = cartdetailService.findcart(uid);
        Cartcount cartcount=cartdetailService.countcart(uid);
        model.addAttribute("cartlist",cartlist);
        model.addAttribute("cartcount",cartcount);
        return "orders";

    }
}
