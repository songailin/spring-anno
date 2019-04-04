package com.enjoy.cap9.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class TestDao2  implements ITestDao{
    @Override
    public void insert() {
        System.out.println("TestDao2...insert");
    }
}
