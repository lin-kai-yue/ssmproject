package cn.itcast.controller;

import cn.itcast.domain.*;
import cn.itcast.service.AccountService;
import cn.itcast.service.CartdetailService;
import cn.itcast.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * 帐户web
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @Autowired
    private GoodsService goodsService;

    @Autowired
    private CartdetailService cartdetailService;

    @RequestMapping("/findAll")
    public String findAll(Model model,int uid){
        System.out.println("表现层：查询所有账户...");
        // 调用service的方法
        List<Cart> cartlist = cartdetailService.findcart(uid);
        Cartcount cartcount=cartdetailService.countcart(uid);
        List<Goods> goodslist=goodsService.findAll();
        model.addAttribute("cartlist",cartlist);
        model.addAttribute("cartcount",cartcount);
        model.addAttribute("goodslist",goodslist);
        return "main";
    }
    @RequestMapping("/findbyid")
    public String findbyid(Model model,int uid){
        System.out.println("表现层：查询所有账户...");
        // 调用service的方法
        List<Cart> cartlist = cartdetailService.findcart(uid);
        Cartcount cartcount=cartdetailService.countcart(uid);
        model.addAttribute("cartlist",cartlist);
        model.addAttribute("cartcount",cartcount);
        return "addgoods";
    }
    @RequestMapping("/findPassword")
    public String findpassword(Model model,HttpServletResponse response,HttpServletRequest request,int name,int password) throws Exception {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        Account account = accountService.findPassword(name);
        System.out.println("name:"+name);
        System.out.println("password:"+password);
        System.out.println("表现层：根据用户名查询账户...");

        if (account.getPassword().equals(password)){
            Cartdetail cartdetail=new Cartdetail();
            cartdetail.setUid(1);
            cartdetail.setGoodsid(0);
            cartdetailService.saveCart(cartdetail,0);
            Cartcount cartcount=cartdetailService.countcart(account.getId());

            List<Goods> goodslist = goodsService.findAll();
            List<Cart> cartlist = cartdetailService.findcart(account.getId());

            model.addAttribute("account",account);
            model.addAttribute("goodslist",goodslist);
            model.addAttribute("cartlist",cartlist);
            model.addAttribute("cartcount",cartcount);
            /*response.sendRedirect(request.getContextPath()+"/goods/findAll");*/
            return "main";
        }
        else {
            out.print("<script type='text/javascript'>alert('用户名或密码错误!');</script>");
            out.flush();
            out.close();
            return "list";
        }

    }
    /**
     * 保存
     * @return
     */
    @RequestMapping("/save")
    public String save(Account account, HttpServletRequest request, HttpServletResponse response) throws IOException {
        accountService.saveAccount(account);
        /*response.sendRedirect(request.getContextPath()+"/account/findAll");*/
        return "redirect:/login.jsp";
    }
    @RequestMapping("/testAjax")
    public void testAjax(@RequestBody String body){
        System.out.println("testAjax方法执行了...");
        // 客户端发送ajax的请求，传的是json字符串，后端把json字符串封装到user对象中
        System.out.println(body);
        // 做响应，模拟查询数据库
      /*  account.setName(369);
        account.setPassword(963);
        // 做响应
        return account;*/
    }
}
