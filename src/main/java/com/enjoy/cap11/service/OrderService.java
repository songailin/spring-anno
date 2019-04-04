package com.enjoy.cap11.service;

import com.enjoy.cap11.dao.OrderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderService {
    @Autowired
    private OrderDao orderDao;

    @Transactional
    public void addOrder() {
        orderDao.insert();
        System.out.println("插入Order完成。");
        int a = 9/0;
    }
}
