package com.Service;

import com.Data.Book;

public interface BookServiceImpl {
    public void AddBook(Book book);

    public void EditBook(Book book, Book book2);

    public void DeleteBookByName(String bookname);

    public void DeleteBookByisbn(String isbn);

    public void SelectAllBook();

    public void SelectTempBook(String BookName);

    public void SelectBookByIsbn(String isbn);

    public void SelectBookByName(String name);

    public void SelectStudentByBookName(String BookName);

}
