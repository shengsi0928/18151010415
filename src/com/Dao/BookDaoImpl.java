package com.Dao;

import com.Data.Book;
import org.springframework.jdbc.core.JdbcTemplate;

public interface BookDaoImpl {
    public void AddBook(Book book);
    public void EditBook(Book book, Book book2);
    public void DeleteBook(Book book);
    public void SelectBook(Book book);
    public void EditBook(String isbn, String sm);
    public void SelectAllBook();
    public void SelectBookByName(String name);
    public void SelectTempBook(String BookName);
    public JdbcTemplate getJdbc();
    public void setJdbc(JdbcTemplate jdbc);
}
