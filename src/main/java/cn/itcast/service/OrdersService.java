package cn.itcast.service;

import cn.itcast.domain.Account;
import cn.itcast.domain.Orders;
import cn.itcast.domain.OrdersList;

import java.util.List;

public interface OrdersService {

    //添加订单
    public void saveorders(Orders orders);

    //根据uid查用户订单
    public List<Orders> findbyuid(int uid);

    //根据uid查用户订单
    public List<OrdersList> findorderslist(int uid);
}
