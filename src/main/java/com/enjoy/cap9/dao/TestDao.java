package com.enjoy.cap9.dao;

import org.springframework.stereotype.Repository;

@Repository
public class TestDao implements ITestDao {
    @Override
    public void insert() {
        System.out.println("TestDao...insert");
    }
}
