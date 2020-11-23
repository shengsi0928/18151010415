package com.Dao;

import com.Data.Book;
import org.apache.ibatis.session.SqlSession;
import org.springframework.jdbc.core.JdbcTemplate;

public interface BookDaoImpl {
    public void AddBook(Book book);
    public void EditBook(Book book1, Book book2);
    public void DeleteBookByisbn(String isbn);
    public void DeleteBookByName(String bookname);
    public void SelectBook(String name);
    public void SelectStudentByBookName(String BookName);
    public void SelectAllBook();
    public void SelectBookByName(String name);
    public void SelectTempBook(String BookName);
    public void SelectBookByIsbn(String isbn);
    public SqlSession GetSession();
}
