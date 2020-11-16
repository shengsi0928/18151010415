package com.Dao;

import com.Data.Book;
import com.Data.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.util.List;

@Repository
@Component("BookDao")
public class BookDao implements BookDaoImpl {

    @Autowired
    JdbcTemplate jdbc;

    @Override
    public void AddBook(Book book) {
        int state = 0;
        String sql = "insert into book (isbn, sm, zz, cbs, jg, fbl, kcl) value (?,?,?,?,?,?,?)";
        try {
            state = jdbc.update(sql, book.getIsbn(), book.getSm(), book.getZz(), book.getCbs(), book.getJg(), book.getFbl(), book.getKcl());
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (state != 0) {
            System.out.println("添加图书成功！");
        } else {
            System.out.println("添加图书失败！");
        }
    }

    @Override
    public void EditBook(Book book, Book book2) {
        int state = 0;
        String sql = "update book set sm = ?, zz = ?, cbs = ?, jg = ?, fbl = ?, kcl = ? where isbn = ?";
        try {
            state = jdbc.update(sql, book2.getSm(), book2.getZz(), book2.getCbs(), book2.getJg(), book2.getFbl(), book2.getKcl(), book.getIsbn());
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
    public void DeleteBook(Book book) {
        int state = 0;
        String sql = "delete from book where isbn = (?)";
        try {
            state = jdbc.update(sql, book.getIsbn());
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (state != 0) {
            System.out.println("删除图书成功！");
        } else {
            System.out.println("删除图书失败！");
        }
    }

    @Override
    public void SelectBook(Book book) {
        ResultSet rs = null;
        List<Book> books = null;
        String sql = "select * from book where isbn = '" + book.getIsbn() + "'";
        try {
            RowMapper<Book> rowMapper = new BeanPropertyRowMapper<Book>(Book.class);
            books = jdbc.query(sql, rowMapper);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (books != null) {
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

    @Override
    public void EditBook(String isbn, String sm) {
        int state = 0;
        String sql = "update book set sm = ?where isbn = ?";
        try {
            state = jdbc.update(sql, sm, isbn);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (state != 0) {
            System.out.println("编辑图书成功！");
        } else {
            System.out.println("编辑图书失败！");
        }
    }

    public void SelectTempBook(String BookName) {
        List<Student> books = null;
        String sql = "select * from student where jszh in (select jszh from jyls where isbn in (select isbn from book where sm ='" + BookName + "')) ";
        try {
            RowMapper<Student> rowMapper = new BeanPropertyRowMapper<Student>(Student.class);
            books = jdbc.query(sql, rowMapper);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (books != null) {
            System.out.println("查询所有图书成功！并查询到以下内容：");
            for (Student temp : books) {
                System.out.println(temp.toString());
            }
        } else {
            System.out.println("查询图书失败！");
        }
    }

    @Override
    public void SelectAllBook() {
        List<Book> books = null;
        String sql = "select * from book ";
        try {
            RowMapper<Book> rowMapper = new BeanPropertyRowMapper<Book>(Book.class);
            books = jdbc.query(sql, rowMapper);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (books != null) {
            System.out.println("查询所有图书成功！并查询到以下内容：");
            for (Book temp : books) {
                System.out.println(temp.toString());
            }
        } else {
            System.out.println("查询图书失败！");
        }
    }

    @Override
    public void SelectBookByName(String name) {

    }


    public JdbcTemplate getJdbc() {
        System.out.println("获取到了一个jdbc连接");
        return jdbc;
    }

    @Override
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }


}
