package cn.itcast.service.impl;

import cn.itcast.dao.OrdersDao;
import cn.itcast.domain.Orders;
import cn.itcast.domain.OrdersList;
import cn.itcast.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ordersService")
public class OrdersServiceImpl  implements OrdersService {

    @Autowired
    private OrdersDao ordersDao;
    @Override
    public void saveorders(Orders orders) {
        ordersDao.saveorder(orders);
    }

    @Override
    public List<Orders> findbyuid(int uid) {
        return ordersDao.findbyuid(uid);
    }

    @Override
    public List<OrdersList> findorderslist(int uid) {
        return ordersDao.findorderslist(uid);
    }
}
