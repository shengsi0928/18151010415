package com.Dao;

import com.Data.Book;
import com.Data.Student;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.List;

@Repository
public class BookDao implements BookDaoImpl {

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


    @Override
    public void AddBook(Book book) {
        SqlSession session = GetSession();
        int state = 0;
        try{
            state = session.update("insertBook", book);
            session.commit();
        }catch (Exception e){
            e.printStackTrace();
        }
        if (state != 0) {
            System.out.println("添加图书成功！");
        } else {
            System.out.println("添加图书失败！");
        }
    }


    @Override
    public void DeleteBookByisbn(String isbn) {
        SqlSession session = GetSession();
        int state = 0;
        try{
            state = session.delete("deleteBookByisbn", isbn);
            session.commit();
        }catch (Exception e){
            e.printStackTrace();
        }
        if (state != 0) {
            System.out.println("删除图书成功！");
        } else {
            System.out.println("删除图书失败！");
        }
    }

    @Override
    public void DeleteBookByName(String bookname) {
        SqlSession session = GetSession();
        int state = 0;
        try{
            state = session.delete("deleteBookByName", bookname);
            session.commit();
        }catch (Exception e){
            e.printStackTrace();
        }
        if (state != 0) {
            System.out.println("删除图书成功！");
        } else {
            System.out.println("删除图书失败！");
        }
    }

    @Override
    public void SelectBook(String name) {

    }

    @Override
    public void SelectStudentByBookName(String BookName) {
        SqlSession session = GetSession();
        List<Book> books = null;
        try {
            books = session.selectList("selectStudentByBookName", BookName);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (books.size() > 0) {
            System.out.println("查询单本图书成功！并查询到以下内容：");
            for (Book temp : books) {
                System.out.println("isbn:" + temp.getIsbn());
                System.out.println("sm:" + temp.getSm());
                System.out.println("zz:" + temp.getZz());
            }
        } else {
            System.out.println("查询图书失败！");
        }
    }



    public void SelectTempBook(String StudentName) {
        SqlSession session = GetSession();
        List<Student> list = null;
        try{
            list = session.selectList("selectStudentByBookName", StudentName);
            if(list.size()>0){
                System.out.println("查询到书本");
                System.out.println(list.size());
                for(Student book:list){
                    System.out.println("book:"+book.toString());
                }
            }else{
                System.out.println("查询不到学生！");
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void SelectAllBook() {
        SqlSession session = GetSession();
        List<Book> list = null;
        try{
            list = session.selectList("selectAllBook");
            if(list.size()>0){
                for(Book book:list){
                    System.out.println("book:"+book.toString());
                }
            }else{
                System.out.println("查询不到学生！");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void SelectBookByName(String name) {
        SqlSession session = GetSession();
        List<Book> list = null;
        try{
            list = session.selectList("selectBookByName", name);
            if(list != null){
                for(Book book:list){
                    System.out.println("book:"+book.toString());
                }
            }else{
                System.out.println("查询不到学生！");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void SelectBookByIsbn(String isbn) {
        SqlSession session = GetSession();
        Book book = null;
        try{
            book = session.selectOne("selectBookByisbn", isbn);
            if(book !=  null){
                System.out.println("book:"+book.toString());
            }else{
                System.out.println("没有isbn为"+isbn+"的书本！");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void EditBook(Book book1, Book book2) {
        SqlSession session = GetSession();
        int state = 0;
        String sql = "update book set sm = ?where isbn = ?";
        try {
            state = session.update("updateBook", book1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (state != 0) {
            System.out.println("编辑图书成功！");
        } else {
            System.out.println("编辑图书失败！");
        }
    }
    @Override
    public SqlSession GetSession() {
        SqlSessionFactory sqlSessionFactory = null;
        try{
            InputStream inputStream = org.apache.ibatis.io.Resources.getResourceAsStream("SqlMapConfig.xml");
            sqlSessionFactory= new SqlSessionFactoryBuilder().build(inputStream);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return sqlSessionFactory.openSession();
    }


}
