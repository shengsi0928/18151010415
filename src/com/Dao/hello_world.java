package com.Dao;

import com.Data.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.Reader;

public class hello_world {
    private static SqlSessionFactory sqlSessionFactory;
    private static Reader reader;

    private static final org.apache.ibatis.io.Resources Resources = null;

    static {
        try {
            reader = Resources.getResourceAsReader("SqlMapConfig.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static SqlSessionFactory getSession() {
        return sqlSessionFactory;
    }
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        SqlSession session = sqlSessionFactory.openSession();
        try {
            Student user = (Student) session.selectOne(
                    "selectByid", 10000001);
            if(user!=null){
                String userInfo = "名字："+user.getXm()+", 所属部门："+user.getJss()+", 主页："+user.getXb();
                System.out.println(userInfo);
            }
        } finally {
            session.close();
        }
    }


}
