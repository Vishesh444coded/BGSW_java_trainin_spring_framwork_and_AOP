package config;

import model.Customer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConifg {

    @Bean
    public Customer createCustomer(){

        return new Customer( 100, "supriya", 20000.0);
    }
}
