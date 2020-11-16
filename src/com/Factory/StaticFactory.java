package com.Factory;

import com.Dao.BookDao;
import com.Service.BookService;

public class StaticFactory {

    public static BookService getService(){
        return new BookService();
    }
    public static BookDao getDaoImpl() { return new BookDao();}
}
