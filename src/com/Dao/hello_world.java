package com.Dao;

import com.Data.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

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
            List<Student> user = session.selectList(
                    "selectByName", "李");
            for(Student std:user){
                if(std!=null){
//                    String userInfo = "名字："+std.getXm()+", 所属部门："+std.getJss()+", 主页："+std.getXb();
                    System.out.println(std.toString());
                }
            }
        } finally {
            session.close();
        }
    }


}
