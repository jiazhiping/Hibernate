package com.sinosoft.test;

import com.sinosoft.demo.TabEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

/**
 * @Title: Testhibernate
 * @Description: ${description}
 * @Copyright: Copyright (c) 2018
 * @Company: sinosoft
 * @Create: 2018-05-04 13:37
 * @Author: 贾治平
 * @Version: 1.0
 **/
public class test {


    private SessionFactory sessionFactory;
    private Session session;
    private Transaction transaction;

    @Test
    public void test(){
        System.out.println("test....");

        //1. 创建配置对象
        Configuration config = new Configuration().configure();

        //3. 创建会话工厂对象
        sessionFactory = config.buildSessionFactory();
        //4. 会话对象
        session = sessionFactory.openSession();
        //5. 开启事务
        transaction = session.beginTransaction();

        //6. 生成专业对象
        TabEntity tabEntity = new TabEntity(3,"wangwu");
        session.save(tabEntity);


        //8. 提交事务
        transaction.commit();
        //9. 关闭会话
        session.close();
        //10. 关闭会话工厂
        sessionFactory.close();
    }
}
