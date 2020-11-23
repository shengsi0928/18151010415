package com.Dao;

import com.Data.Student;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public interface StudentDaoImpl {
    public int AddStudent(Student std);
    public int EditStudent(Student std);
    public void EditStudentByName(Student std);
    public void DeleteStudentByjszh(String jszh);
    public void DeleteStudentByName(String name);
    public void SelectStudentByjszh(String jszh);
    public void SelectStudentByName(String name);
    public List<Student> SelectStudentByNameParam(String name);
    public Student SelectStudentByjszhParam(String jszh);
    public SqlSession GetSession();
}
