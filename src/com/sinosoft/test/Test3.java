package com.sinosoft.test;

import com.sinosoft.demo.EmpEntity;
import com.sinosoft.demo.OrgEntity;
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
    * @Description: 同时保存一个部门 和 部门成员
    * @Param:
    * @return:
    * @Author: jiazhiping
    * @Date: 上午 8:55 2018/5/9 0009
    * @Modifier:
    * @Modify Date:
    */
    @Test
    public void Test(){
        EmpEntity emp = new EmpEntity();
        emp.setEmpname("TBD");
        emp.setEmpid(8);
        emp.setAddress("昌平区北七家镇");
        emp.setEmpcode("006");
        emp.setPhone("0000000");
        emp.setPostcode("710075");
        emp.setSex("M");
        emp.setWage(6745.000);
        emp.setOrgid(9);


        OrgEntity org = new OrgEntity();
        org.setOrgid(9);
        org.setOrgcode("006");
        org.setOrgleader("laowang");
        org.setOrgname("应用");

        org.getEmps().add(emp);

        Session s = HibernateUtil.getCurrentSession();
        Transaction tx =s.beginTransaction();
        s.save(emp);
        s.save(org);
        tx.commit();


    }
}
