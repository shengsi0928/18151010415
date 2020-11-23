import com.Service.BookServiceImpl;
import com.Service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.Service.BookService;

public class Test {
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{   "Beans.xml" });

//        ApplicationContext context1 = new AnnotationConfigApplicationContext(Config.class);

//        BookService bs = context1.getBean("ChineseBookService", BookService.class);
//        bs.AddBook();
//        BookDao impl = (BookDao)context.getBean("BookImpl");
//        impl.AddBook();
//        bs.SaveBook();
//        JdbcTemplate jdbc = (JdbcTemplate)context.getBean("jdbcTemplate", JdbcTemplate.class);
//        BookDao dao = context.getBean("BookImpl", BookDao.class);
        BookServiceImpl service = context.getBean("service", BookService.class);
        StudentService studentService = context.getBean("StudentService", StudentService.class);

//        studentService.DeleteStudentByjszh("20000001");
//        studentService.AddStudent(std);
//        studentService.SelectStudentByName("李");
//        Student std2 = studentService.SelectStudentByjszhParam("20000001");
//        studentService.SelectStudentByName("xx");

//        service.SelectBookByName("");
//
//        std.setXm("李大丽");
//        studentDao.EditStudent(std);
//        std = studentDao.SelectStudentByjszhParam("20000001");
//        System.out.println(std.toString());
//        studentDao.SelectStudentByName("李");
//        Book book3 = new Book("1", "xx", "cc", "cbs");
//        service.AddBook(book);
//        service.SelectBook(book);
//        service.EditBook(book, book3);
//        service.SelectBook(book);
//        service.DeleteBook(book);
//        service.SelectTempBook("计算机网络");
    }

}