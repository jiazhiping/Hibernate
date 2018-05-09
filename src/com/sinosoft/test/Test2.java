package com.sinosoft.test;

import com.sinosoft.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.junit.Test;

import java.util.List;

/**
 * @Title: Testhibernate
 * @Description: ${description}
 * @Copyright: Copyright (c) 2018
 * @Company: sinosoft
 * @Create: 2018-05-08 09:14
 * @Author: 贾治平
 * @Version: 1.0
 **/
public class Test2 {

    /**
    * @Title: HQL条件查询全部
    * @Description:
    * @Param:
    * @return:
    * @Author: jiazhiping
    * @Date: 上午 9:16 2018/5/8 0008
    * @Modifier:
    * @Modify Date:
    */
    @Test
    public void test1(){
        Session s = HibernateUtil.getCurrentSession();
        Transaction tx = s.beginTransaction();
        //获取查询对象
        Query query = s.createQuery("from TabEntity");
        //执行对象方法 获得结果集
        List list = query.list();
        for (Object o : list) {
            System.out.println(o);
            
        }
        tx.commit();
    }

    /**
    * @Title: 条件查询
    * @Description:  索引从0  开始  倒序
    * @Param:
    * @return:
    * @Author: jiazhiping
    * @Date: 上午 10:14 2018/5/8 0008
    * @Modifier:
    * @Modify Date:
    */
    @Test
    public void test2(){
        Session s = HibernateUtil.getCurrentSession();
        Transaction tx = s.beginTransaction();
        //获取query对象
        Query query = s.createQuery("from TabEntity where id = ? ");
        //给参数赋值
        query.setInteger(0,2);
        //query.setString(0,2);
        List list = query.list();
        for (Object o : list) {
            System.out.println(o);
        }
        tx.commit();
    }

    /**
    * @Title:  limit 分页关键字
    * @Description:
    * @Param:
    * @return:
    * @Author: jiazhiping
    * @Date: 上午 10:58 2018/5/8 0008
    * @Modifier:
    * @Modify Date:
     *
     *
     *setFirstResult(int firstResult);设置开始记录索引
     *setMaxResults(int maxResults);设置每次查询的记录条数
    */
    @Test
    public void test3(){

        Session s = HibernateUtil.getCurrentSession();
        Transaction tx = s.beginTransaction();

        Query query = s.createQuery("from TabEntity ");

        query.setFirstResult(1);
        query.setMaxResults(3);
        List list = query.list();
        for (Object o : list) {
            System.out.println(o);
        }
        tx.commit();
    }


    /**
    * @Title:  排序查询
    * @Description:
    * @Param:
    * @return:
    * @Author: jiazhiping
    * @Date: 上午 11:03 2018/5/8 0008
    * @Modifier:
    * @Modify Date:
    */
    @Test
    public void test4(){
        Session s = HibernateUtil.getCurrentSession();
        Transaction tx = s.beginTransaction();

        Query query = s.createQuery("from TabEntity order by id desc");
        List list = query.list();
        for (Object o : list) {
            System.out.println(o);
        }
        tx.commit();

    }

    /**
    * @Title: HQL统计查询
    * @Description:
    * @Param:
    * @return:
    * @Author: jiazhiping
    * @Date: 上午 11:14 2018/5/8 0008
    * @Modifier:
    * @Modify Date:
    */
    @Test
    public void test5(){

        Session s = HibernateUtil.getCurrentSession();
        Transaction tx = s.beginTransaction();
        Query query = s.createQuery("select count(id) from TabEntity ");



        List list = query.list();
        for (Object o : list) {
            System.out.println(o);
        }
        Long i = (Long) query.uniqueResult();
        System.out.println(i);
        tx.commit();

    }

}
