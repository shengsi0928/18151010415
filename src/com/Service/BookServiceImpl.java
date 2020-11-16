package com.Service;

import com.Dao.BookDaoImpl;
import com.Data.Book;

public interface BookServiceImpl {
    public void AddBook(Book book);

    public void EditBook(Book book, Book book2);

    public void Editbook(String isbn, String sm);

    public void DeleteBook(Book book);

    public void SelectBook(Book book);

    public void SelectTempBook(String BookName);

    public BookDaoImpl getBookDao();

    public void setBookDao(BookDaoImpl bookDaoImpl);
}
