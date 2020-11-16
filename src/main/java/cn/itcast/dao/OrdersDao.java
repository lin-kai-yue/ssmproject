package cn.itcast.dao;

import cn.itcast.domain.Account;
import cn.itcast.domain.Orders;
import cn.itcast.domain.OrdersList;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrdersDao {

    @Insert("INSERT INTO orders(uid,goodsid,num,money,orderstime) VALUES (#{uid},#{goodsid},#{num},#{money},#{orderstime})")
    public void saveorder(Orders orders);

    @Select("select * from orders where uid = #{uid}")
    List<Orders> findbyuid(int uid);

    @Select("SELECT orders.*,goods.goodsname,goods.goodsprices,goods.pictersrc FROM orders JOIN goods on goods.goodsid=orders.goodsid WHERE uid=#{uid}")
    List<OrdersList> findorderslist(int uid);
}
