package example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        // Create IoC container
        ApplicationContext con = new AnnotationConfigApplicationContext(AppConfig.class);
        MessagePrinter printer = con.getBean("messagePrinter",MessagePrinter.class);
        printer.printMessage();
    }
}