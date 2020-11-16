package com.Factory;

import com.Dao.BookDao;
import com.Service.BookService;

public class InstanceFactory {
    public BookService getService(String str){ return new BookService(); }
    public BookDao getDaoImpl() { return new BookDao();}
}
