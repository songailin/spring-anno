package com.enjoy.cap11.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public class OrderDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    private final static String INSERT_SQL = "insert into `order`(ordertime, ordermoney, orderstatus) values(?,?,?)";

    public void insert() {
        jdbcTemplate.update(INSERT_SQL, new Date(), 20, 0);
    }
}
