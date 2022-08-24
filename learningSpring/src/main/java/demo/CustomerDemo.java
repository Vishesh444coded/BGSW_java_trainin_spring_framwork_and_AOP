package demo;

import model.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerDemo {

    public static void main(String [] args ){

        ApplicationContext ctx;

        ctx = new ClassPathXmlApplicationContext("beans.xml");

        Customer cust = ctx.getBean("cust1", Customer.class);
        // by default, cust1 is of object type, we type cast it to model.Customer class

        cust.display();
    }
}
