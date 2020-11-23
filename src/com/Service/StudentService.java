package com.Service;

import com.Dao.StudentDao;
import com.Dao.StudentDaoImpl;
import com.Data.Student;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//@Component
public class StudentService implements StudentServiceImpl{

    @Autowired
    @Qualifier("StdDao")
    StudentDao studentDao;


    @Override
    public int AddStudent(Student std) {
        return studentDao.AddStudent(std);
    }

    @Override
    public int EditStudent(Student std) {
        return studentDao.EditStudent(std);
    }

    @Override
    public void EditStudentByName(Student std) {
        studentDao.EditStudentByName(std);
    }

    @Override
    public void DeleteStudentByjszh(String jszh) {
        studentDao.DeleteStudentByjszh(jszh);
    }

    @Override
    public void DeleteStudentByName(String name) {
        studentDao.DeleteStudentByName(name);
    }

    @Override
    public void SelectStudentByjszh(String jszh) {
        studentDao.SelectStudentByjszh(jszh);
    }

    @Override
    public void SelectStudentByName(String name) {
        studentDao.SelectStudentByName(name);
    }

    @Override
    public List<Student> SelectStudentByNameParam(String name) {
        return studentDao.SelectStudentByNameParam(name);
    }

    @Override
    public Student SelectStudentByjszhParam(String jszh) {
        return studentDao.SelectStudentByjszhParam(jszh);
    }

}
