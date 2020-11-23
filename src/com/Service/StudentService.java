package com.Service;

import com.Dao.StudentDao;
import com.Data.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements StudentServiceImpl{

    @Autowired
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
