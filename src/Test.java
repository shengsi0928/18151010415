import com.Config;
import com.Data.Book;
import com.Service.BookServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.Service.BookService;

public class Test {
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{   "Beans.xml" });

        ApplicationContext context1 = new AnnotationConfigApplicationContext(Config.class);

//        BookService bs = context1.getBean("ChineseBookService", BookService.class);
//        bs.AddBook();
//        BookDao impl = (BookDao)context.getBean("BookImpl");
//        impl.AddBook();
//        bs.SaveBook();
//        JdbcTemplate jdbc = (JdbcTemplate)context.getBean("jdbcTemplate", JdbcTemplate.class);
//        BookDao dao = context.getBean("BookImpl", BookDao.class);
        BookServiceImpl service = context.getBean("service", BookService.class);
        Book book = context.getBean("book1", Book.class);
        Book book2 = context.getBean("book2", Book.class);
        Book book3 = book;
        book3.setSm("sbsshs");
        book3.setZz("hfdjsahfkahls");
//        Book book3 = new Book("1", "xx", "cc", "cbs");
//        service.AddBook(book);
//        service.SelectBook(book);
//        service.EditBook(book, book3);
//        service.SelectBook(book);
//        service.DeleteBook(book);
        service.SelectTempBook("计算机网络");
    }

}