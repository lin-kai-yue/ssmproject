package cn.itcast.test;

import cn.itcast.dao.AccountDao;
import cn.itcast.dao.CartdetailDao;
import cn.itcast.dao.GoodsDao;
import cn.itcast.dao.OrdersDao;
import cn.itcast.domain.*;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestMyBatis {

    /**
     * 测试查询
     * @throws Exception
     */
   /* @Test
    public void run1() throws Exception {
        Cartdetail cartdetail=new Cartdetail();
        // 加载配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        // 创建SqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        // 创建SqlSession对象
        SqlSession session = factory.openSession();
        // 获取到代理对象
        CartdetailDao dao = session.getMapper(CartdetailDao.class);
        // 查询所有数据
        List<Cartdetail> list=dao.findby(cartdetail);
        for(Cartdetail list : list) {
            System.out.println(list);
        }

        // 关闭资源
        session.close();
        in.close();
    }*/

    /**
     * 测试保存
     * @throws Exception
     */
    @Test
    public void run2() throws Exception {
/*        Orders orders=new Orders();
        orders.setUid(1);
        orders.setGoodsid(2);
        orders.setNum(1);
        orders.setMoney(20);

        Orders orders2=new Orders();
        orders2.setUid(1);
        orders2.setGoodsid(3);
        orders2.setNum(1);
        orders2.setMoney(40);

        List<Orders> list = new ArrayList<>();
        list.add(orders2);
        list.add(orders);*/

        // 加载配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        // 创建SqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        // 创建SqlSession对象
        SqlSession session = factory.openSession();
        // 获取到代理对象
        GoodsDao dao = session.getMapper(GoodsDao.class);

        // 保存

        dao.deletegood(25);
/*        List<OrdersList> list=dao.findorderslist(1);
*//*        for(OrdersList ordersList : list){
            System.out.println(ordersList);
        }*//*
        System.out.println(list);*/


        // 提交事务
        session.commit();

        // 关闭资源
        session.close();
        in.close();
    }
    /**
     * 测试用户名查询密码
     */
    @Test
    public void run3() throws Exception {

        Cartdetail save=new Cartdetail();
        save.setUid(3);
        save.setGoodsid(4);
        // 加载配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        // 创建SqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        // 创建SqlSession对象
        SqlSession session = factory.openSession();
        // 获取到代理对象
        CartdetailDao dao = session.getMapper(CartdetailDao.class);
        // 查询所有数据
        dao.findby(save);
        Random random = new Random();
        for (int i = 0; i < 20; i++){
            System.out.print("ra"+random.nextInt(18)+",");
        }

        for (int i = 0; i < 20; i++){
            int num=(int)(Math.random()*18);
            System.out.print("num"+num+",");
        }



        // 关闭资源
        session.close();
        in.close();
    }
    @Test
    public void run4() throws Exception {
        Goods goods=new Goods();
        goods.setGoodsname("小米手机");
        goods.setGoodsprices(90);
        goods.setPictersrc("images/pi5.jpg");
        goods.setType("手机和平板");




        // 加载配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        // 创建SqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        // 创建SqlSession对象
        SqlSession session = factory.openSession();
        // 获取到代理对象
        GoodsDao dao = session.getMapper(GoodsDao.class);

        // 保存
        dao.addGoods(goods);



        // 提交事务
        session.commit();

        // 关闭资源
        session.close();
        in.close();
    }
}
