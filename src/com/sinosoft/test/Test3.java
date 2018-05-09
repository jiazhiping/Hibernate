package com.sinosoft.test;

import com.sinosoft.demo.GradeEntity;
import com.sinosoft.demo.StudentEntity;
import com.sinosoft.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

/**
 * @Title: Testhibernate
 * @Description: ${description}
 * @Copyright: Copyright (c) 2018
 * @Company: sinosoft
 * @Create: 2018-05-09 08:54
 * @Author: 贾治平
 * @Version: 1.0
 **/
public class Test3 {

    /**
    * @Title:  多表保存
    * @Description:
    * @Param:
    * @return:
    * @Author: jiazhiping
    * @Date: 上午 8:55 2018/5/9 0009
    * @Modifier:
    * @Modify Date:
    */
    @Test
    public void Testadd(){
        GradeEntity g = new GradeEntity("Java一班", "Java软件开发一班");
        StudentEntity stu1 = new StudentEntity("张三", "男");
        StudentEntity stu2 = new StudentEntity("木女神", "女");

        //如果希望在学生表中添加对应的班级编号，需要在班级中添加学生，建立关联关系
        g.getStudents().add(stu1);
        g.getStudents().add(stu2);

        Session session = HibernateUtil.getCurrentSession();
        Transaction tx = session.beginTransaction();
        session.save(g);
        session.save(stu1);
        session.save(stu2);
        tx.commit();


    }
}
