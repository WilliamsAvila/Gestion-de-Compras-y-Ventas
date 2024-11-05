package org.amazon.finalproject;

import org.amazon.finalproject.Model.Customer;
import org.amazon.finalproject.Model.Purchase;
import org.amazon.finalproject.Model.TypeOfUser;
import org.amazon.finalproject.Model.User;
import org.amazon.finalproject.Repository.CustomerRepository;
import org.amazon.finalproject.Repository.PurchaseRepository;
import org.amazon.finalproject.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class CommandLineRunnerUser implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private PurchaseRepository purchaseRepository;

    @Override
    public void run(String... args) throws Exception {
//        User user1 = new User(1L,"Williams","123456789","wimolina@hotmail.com","642318353","calle nicolas salmeron");
//        userRepository.save(user1);
//
//        Customer customer1 = new Customer("Williams","12345","Will@hotmail.com","6423173654","calle nicolas");
//        customerRepository.save(customer1);
//
//        Purchase purchase = new Purchase(LocalDate.of(2024,5,11),1,customer1);
//        purchaseRepository.save(purchase);
    }
}
