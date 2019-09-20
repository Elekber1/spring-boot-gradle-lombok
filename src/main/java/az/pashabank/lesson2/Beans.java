package az.pashabank.lesson2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Beans {

    @Bean
    public Customer getCustomer(){
        return new Customer("Alex");
    }

    @Bean
    public Account account(Customer customer){
        return new Account(customer);
    }
}
