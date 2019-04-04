package com.enjoy.cap9.service;

import com.enjoy.cap9.dao.ITestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    @Autowired
    @Qualifier("testDao")
    private ITestDao testDao;

    public void insert() {
        testDao.insert();
    }

    public ITestDao getTestDao() {
        return testDao;
    }

    public void setTestDao(ITestDao testDao) {
        this.testDao = testDao;
    }
}
