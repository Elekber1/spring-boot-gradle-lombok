package az.pashabank;

import az.pashabank.lesson2.Account;
import az.pashabank.lesson2.Customer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootGradleLombokApplication {

    public static void main(String[] args) {
    ApplicationContext applicationContext =  SpringApplication.run(SpringBootGradleLombokApplication.class, args);

       Customer customer = (Customer) applicationContext.getBean("getCustomer");
       System.out.println(customer.getName());

       Account account = (Account) applicationContext.getBean(Account.class);
       System.out.println(account.getCustomer().getName());

    }
}
