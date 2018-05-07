package com.sinosoft.test;

import com.sinosoft.demo.TabEntity;
import com.sinosoft.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

/**
 * @Title: Testhibernate
 * @Description: ${description}
 * @Copyright: Copyright (c) 2018
 * @Company: sinosoft
 * @Create: 2018-05-07 16:53
 * @Author: 贾治平
 * @Version: 1.0
 **/
public class Test1 {

    /**
    * @Title: 保存信息
    * @Description:
    * @Param:
    * @return:
    * @Author: jiazhiping
    * @Date: 下午 5:05 2018/5/7 0007
    * @Modifier:
    * @Modify Date:
    */
    @Test
    public void testAdd(){
        TabEntity tab = new TabEntity();
        tab.setId(4);
        tab.setName("赵六");

        //获取session
        Session session = HibernateUtil.openSession();
        //开启事务
        Transaction tx = session.beginTransaction();
        //保存
        session.save(tab);
        //提交事务
        tx.commit();
        session.close();

    }

    /**
    * @Title: 修改信息
    * @Description:
    * @Param:
    * @return:
    * @Author: jiazhiping
    * @Date: 下午 5:06 2018/5/7 0007
    * @Modifier:
    * @Modify Date:
    */
    @Test
    public void testUpdate(){
        //获取session
        Session session = HibernateUtil.openSession();
        //开启事务
        Transaction tx = session.beginTransaction();
        //根据id查询
        TabEntity tab = session.get(TabEntity.class, 2);
        tab.setName("test");
        session.update(tab);

        //提交事务
        tx.commit();
        session.close();
    }


    /**
    * @Title: 删除信息
    * @Description:
    * @Param:
    * @return:
    * @Author: jiazhiping
    * @Date: 下午 5:08 2018/5/7 0007
    * @Modifier:
    * @Modify Date:
    */
    @Test
    public void testDelete(){
        Session session = HibernateUtil.openSession();
        Transaction tx = session.beginTransaction();
        TabEntity tab = session.get(TabEntity.class, 1);
        session.delete(tab);
        tx.commit();
        session.close();
    }
}
