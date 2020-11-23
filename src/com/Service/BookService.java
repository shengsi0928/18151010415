package com.Service;

import com.Dao.BookDao;
import com.Data.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService implements BookServiceImpl {

    @Autowired
    BookDao bookDao;

    @Override
    public void SelectBookByIsbn(String isbn) {
        bookDao.SelectBookByIsbn(isbn);
    }

    @Override
    public void SelectBookByName(String name) {
        bookDao.SelectBookByName(name);
    }

    @Override
    public void SelectStudentByBookName(String BookName) {
        bookDao.SelectStudentByBookName(BookName);
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
    public void DeleteBookByName(String bookname) {
        bookDao.DeleteBookByName(bookname);

    }

    @Override
    public void DeleteBookByisbn(String isbn) {
        bookDao.DeleteBookByName(isbn);

    }


    @Override
    public void SelectAllBook() {
        bookDao.SelectAllBook();
    }

    @Override
    public void SelectTempBook(String BookName) {
        bookDao.SelectTempBook(BookName);
    }

}
