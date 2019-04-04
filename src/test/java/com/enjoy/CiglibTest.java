package com.enjoy;

import com.enjoy.cap10.cglib.Dao;
import com.enjoy.cap10.cglib.DaoAnotherProxy;
import com.enjoy.cap10.cglib.DaoFilter;
import com.enjoy.cap10.cglib.DaoProxy;
import org.junit.Test;
import org.springframework.cglib.proxy.Callback;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.NoOp;

public class CiglibTest {

    @Test
    public void testCiglib() {
        DaoProxy daoProxy = new DaoProxy();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Dao.class);
        enhancer.setCallback(daoProxy);

        Dao dao = (Dao) enhancer.create();
        dao.select();
        dao.update();
    }

    @Test
    public void testCglib2() {
        DaoProxy daoProxy = new DaoProxy();
        DaoAnotherProxy daoAnotherProxy = new DaoAnotherProxy();

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Dao.class);
        enhancer.setCallbacks(new Callback[]{daoProxy, daoAnotherProxy, NoOp.INSTANCE});
        enhancer.setCallbackFilter(new DaoFilter());

        Dao dao = (Dao)enhancer.create();
        dao.update();
        dao.select();
    }
}
