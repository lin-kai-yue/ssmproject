package cn.itcast.controller;

import cn.itcast.domain.Account;
import cn.itcast.domain.Cart;
import cn.itcast.domain.Cartcount;
import cn.itcast.domain.Goods;
import cn.itcast.service.AccountService;
import cn.itcast.service.CartdetailService;
import cn.itcast.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/goods")
public class GoodsController {
    @Autowired
    private GoodsService goodsService;

    @Autowired
    private AccountService accountService;

    @Autowired
    private CartdetailService cartdetailService;

    @RequestMapping("/findAll")
    public String findAll(Model model,int uid){
        System.out.println("表现层：查询所有账户...");
        // 调用service的方法
        List<Goods> goodslist = goodsService.findAll();
        List<Cart> cartlist = cartdetailService.findcart(uid);
        Cartcount cartcount=cartdetailService.countcart(uid);
        model.addAttribute("cartlist",cartlist);
        model.addAttribute("cartcount",cartcount);
        model.addAttribute("goodslist",goodslist);
        return "goods";
    }
   /* @RequestMapping("/testAjax")
    public @ResponseBody
    List<Goods> testAjax(@RequestBody Model model){
        System.out.println("testAjax方法执行了...");
        // 客户端发送ajax的请求，传的是json字符串，后端把json字符串封装到user对象中
        List<Goods> goodslist = goodsService.findAll();
        // 做响应，模拟查询数据库
        model.addAttribute("goodslist",goodslist);
        // 做响应
        return goodslist;
    }*/
   @RequestMapping("/findbytype")
   public String findByType(Model model,String type,int uid){
       // 调用service的方法
       List<Goods> typelist = goodsService.findBytype(type);
       List<Cart> cartlist = cartdetailService.findcart(uid);
       Cartcount cartcount=cartdetailService.countcart(uid);
       model.addAttribute("cartlist",cartlist);
       model.addAttribute("cartcount",cartcount);
       model.addAttribute("typelist",typelist);
       return "products";
   }
    @RequestMapping("/likename")
    public String likename(Model model,String name,int uid){
        // 调用service的方法
        List<Goods> typelist = goodsService.likename(name);
        List<Cart> cartlist = cartdetailService.findcart(uid);
        Cartcount cartcount=cartdetailService.countcart(uid);
        model.addAttribute("cartlist",cartlist);
        model.addAttribute("cartcount",cartcount);
        model.addAttribute("typelist",typelist);
        return "products";
    }
    @RequestMapping("/findbygoodsid")
    public String likename(Model model,int goodsid,int uid){
        // 调用service的方法
        Goods goods=goodsService.findByid(goodsid);
        List<Cart> cartlist = cartdetailService.findcart(uid);
        Cartcount cartcount=cartdetailService.countcart(uid);
        List<Goods> goodslist = goodsService.findAll();
        model.addAttribute("goodslist",goodslist);
        model.addAttribute("cartlist",cartlist);
        model.addAttribute("cartcount",cartcount);
        model.addAttribute("goods",goods);
        return "single";
    }

    @RequestMapping("/fileupload")
    public String fileuoload(int uid,Model model,HttpServletRequest request, MultipartFile upload,String goodsname,double goodsprices,String type,String firmname) throws Exception {
        System.out.println("springmvc文件上传...");


        // 使用fileupload组件完成文件上传
        // 上传的位置
        String path = request.getSession().getServletContext().getRealPath("/images/");
        // 判断，该路径是否存在
        File file = new File(path);
        if(!file.exists()){
            // 创建该文件夹
            file.mkdirs();
        }

        // 说明上传文件项
        // 获取上传文件的名称
        String filename = upload.getOriginalFilename();
        // 把文件的名称设置唯一值，uuid
        String uuid = UUID.randomUUID().toString().replace("-", "");
        filename = uuid+"_"+filename;

        Goods goods=new Goods();
        goods.setGoodsname(goodsname);
        goods.setGoodsprices(goodsprices);
        goods.setPictersrc("images/"+filename);
        goods.setType(type);
        goods.setFirmname(firmname);
        //将商品写入数据库
        goodsService.addGoods(goods);

        // 完成文件上传
        upload.transferTo(new File(path,filename));
        List<Goods> goodslist = goodsService.findAll();
        model.addAttribute("goodslist",goodslist);
        List<Cart> cartlist = cartdetailService.findcart(uid);
        Cartcount cartcount=cartdetailService.countcart(uid);
        model.addAttribute("cartlist",cartlist);
        model.addAttribute("cartcount",cartcount);
        return "main";
    }

    @RequestMapping("/deletegood")
    public String Deletegood(int uid, int goodsid, HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=utf-8");
       System.out.println("表现层：查询购物车");
        // 调用service的方法
        goodsService.deletegood(goodsid);
        cartdetailService.Deletegoods(goodsid);
        response.sendRedirect(request.getContextPath()+"/goods/findAll?uid="+uid);
        return "goods";
    }
}
