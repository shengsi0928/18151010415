package com.Dao;

import com.Data.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Repository
public class StudentDao implements StudentDaoImpl{
    @Override
    public int AddStudent(Student temp_std) {
        SqlSession session = GetSession();
        int insert_state = 0;
        if(temp_std == null){
            System.out.println("添加失败！因为传入的student对象为空！");
        }
        try{
            insert_state = session.insert("insertStudent2", temp_std);
            session.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            session.close();
        }
        return insert_state;
    }

    @Override
    public int EditStudent(Student temp_std) {
        SqlSession session = GetSession();
        int update_state = 0;
        if(temp_std == null){
            System.out.println("更新失败！因为传入的student对象为空！");
        }
        try{
            update_state = session.update("updateStudent", temp_std);
            session.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            session.close();
        }
        return update_state;
    }

    @Override
    public void EditStudentByName(Student temp_std) {
        SqlSession session = GetSession();
    }

    @Override
    public void DeleteStudentByjszh(String jszh) {
        SqlSession session = GetSession();
        List<Student> user = null;
        try {
            session.delete("deleteStudentByjszh", jszh);
            session.commit();
        } finally {
            session.close();
        }
    }

    @Override
    public void DeleteStudentByName(String name) {
        SqlSession session = GetSession();
        try {
            session.delete("deleteStudentByName", name);
            session.commit();

        } finally {
            session.close();
        }
    }

    @Override
    public void SelectStudentByjszh(String jszh) {
        SqlSession session = GetSession();
        try {
            List<Student> user = session.selectList(
                    "selectByjszh", jszh);
            for(Student std:user){
                if(std!=null){
                    System.out.println(std.toString());
                }
            }
        } finally {
            session.close();
        }
    }

    @Override
    public void SelectStudentByName(String name) {
        SqlSession session = GetSession();
        List<Student> user;
        try {
            user = session.selectList(
                    "selectByName", name);
            for(Student std:user){
                if(std!=null){
                    System.out.println(std.toString());
                }
                else{
                    System.out.println("查不到学生！");
                }
            }
        } finally {
            session.close();
        }
    }

    @Override
    public List<Student> SelectStudentByNameParam(String name) {
        SqlSession session = GetSession();
        List<Student> user;
        try {
            user = session.selectList(
                    "selectByName", name);
            for(Student std:user){
                if(std!=null){
                    System.out.println(std.toString());
                }
            }
        } finally {
            session.close();
        }
        return user;
    }

    @Override
    public Student SelectStudentByjszhParam(String jszh) {
        SqlSession session = GetSession();
        Student std;
        try {
            std = session.selectOne(
                    "selectByjszh", jszh);

        } finally {
            session.close();
        }
        return std;
    }

    @Override
    public SqlSession GetSession() {
        SqlSessionFactory sqlSessionFactory = null;
        try{
            InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
            sqlSessionFactory= new SqlSessionFactoryBuilder().build(inputStream);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return sqlSessionFactory.openSession();
    }
}
