package test.com.Service; 

import com.Service.BookService;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/** 
* BookService Tester. 
* 
* @author <Authors name> 
* @since <pre>11月 23, 2020</pre> 
* @version 1.0 
*/ 
public class BookServiceTest { 

@Before
public void before() throws Exception {

} 

@After
public void after() throws Exception {

} 

/** 
* 
* Method: SelectBookByIsbn(String isbn) 
* 
*/ 
@Test
public void testSelectBookByIsbn() throws Exception { 
//TODO: Test goes here...
    ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{   "Beans.xml" });
    BookService bookService = context.getBean("BookService", BookService.class);
    bookService.SelectBookByIsbn("");
} 

/** 
* 
* Method: SelectBookByName(String name) 
* 
*/ 
@Test
public void testSelectBookByName() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: SelectStudentByBookName(String BookName) 
* 
*/ 
@Test
public void testSelectStudentByBookName() throws Exception { 
//TODO: Test goes here...
    ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{   "Beans.xml" });
    BookService bookService = context.getBean("BookService", BookService.class);
    bookService.DeleteBookByName("计算机网络");
} 

/** 
* 
* Method: AddBook(Book book) 
* 
*/ 
@Test
public void testAddBook() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: EditBook(Book book, Book book2) 
* 
*/ 
@Test
public void testEditBook() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: DeleteBook(String book) 
* 
*/ 
@Test
public void testDeleteBookByName() throws Exception {
//TODO: Test goes here...
    ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{   "Beans.xml" });
    BookService bookService = context.getBean("BookService", BookService.class);
    bookService.DeleteBookByName("计算机网络");
} 

/** 
* 
* Method: SelectAllBook() 
* 
*/ 
@Test
public void testSelectAllBook() throws Exception { 
//TODO: Test goes here...
    ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{   "Beans.xml" });
    BookService bookService = context.getBean("BookService", BookService.class);
    bookService.SelectAllBook();
} 

/** 
* 
* Method: SelectTempBook(String BookName) 
* 
*/ 
@Test
public void testSelectTempBook() throws Exception { 
//TODO: Test goes here...
    ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{   "Beans.xml" });
    BookService bookService = context.getBean("BookService", BookService.class);
    bookService.SelectTempBook("");
} 


} 
