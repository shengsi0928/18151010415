package com.Service;

import com.Dao.BookDao;
import com.Dao.BookDaoImpl;
import com.Data.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

@Service("service")
public class BookService implements BookServiceImpl {
    @Autowired
    private BookDaoImpl bookDao;

//    setter and getter

    public BookDaoImpl getBookDao() {
        return bookDao;
    }

    public void setBookDao(BookDaoImpl bookDaoImpl) {
        this.bookDao = bookDaoImpl;
    }


    @Override
    public void AddBook(Book book) {
        bookDao.AddBook(book);
    }

    @Override
    public void EditBook(Book book, Book book2) {
        bookDao.EditBook(book, book2);
    }

    @Override
    public void Editbook(String isbn, String sm) {
        bookDao.EditBook(isbn, sm);
    }

    @Override
    public void DeleteBook(Book book) {
        bookDao.DeleteBook(book);
    }

    @Override
    public void SelectBook(Book book) {
        bookDao.SelectBook(book);
    }

    @Override
    public void SelectTempBook(String BookName) {
        bookDao.SelectTempBook(BookName);
    }

}
