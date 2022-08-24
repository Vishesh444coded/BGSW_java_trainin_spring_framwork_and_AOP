package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import config.BeanConifg;
import model.Customer;
public class CustomerJavaConfigDemo {

    public static void  main(String [] args){

        ApplicationContext ctx;

        ctx = new AnnotationConfigApplicationContext(BeanConifg.class);
        Customer cust = (Customer) ctx.getBean(Customer.class);

        cust.display();
    }
}
