package com.sinosoft.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @Title: Testhibernate
 * @Description: ${description}
 * @Copyright: Copyright (c) 2018
 * @Company: sinosoft
 * @Create: 2018-05-07 16:45
 * @Author: 贾治平
 * @Version: 1.0
 **/
public class HibernateUtil {

    private static SessionFactory factory;


    static{
        try{
            Configuration cfg = new Configuration();
            cfg.configure();
            factory = cfg.buildSessionFactory();
        }catch (Exception e){
            e.printStackTrace();
            throw new ExceptionInInitializerError("初始化SessionFactory失败");
        }

    }


    /**
     * 使用工厂生产一个Session对象，
     * 每次都是一个新的
     * 此时Session还不符合自己的使用原则
     *
     * 调整符合放到hibernate的第二天
     * @return
     */
    public static Session openSession(){
        return factory.openSession();
    }


    /**
     * 每次都是从当前线程上获取Session
     * @return
     */
    public static Session getCurrentSession(){
        return factory.getCurrentSession();
    }
}
