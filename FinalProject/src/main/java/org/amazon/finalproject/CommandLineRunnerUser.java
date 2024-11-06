package org.amazon.finalproject;

import org.amazon.finalproject.Repository.CustomerRepository;
import org.amazon.finalproject.Repository.PurchaseRepository;
import org.amazon.finalproject.Repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLineRunnerUser implements CommandLineRunner {

    @Autowired
    private UsersRepository userRepository;

    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private PurchaseRepository purchaseRepository;

    @Override
    public void run(String... args) throws Exception {
//        Users user1 = new Users(1L,"Williams","123456789","wimolina@hotmail.com","642318353","calle nicolas salmeron");
//        userRepository.save(user1);
//
//        Customer customer1 = new Customer("Williams","12345","Will@hotmail.com","6423173654","calle nicolas");
//        customerRepository.save(customer1);
//
//        Purchase purchase = new Purchase(LocalDate.of(2024,5,11),1,customer1);
//        purchaseRepository.save(purchase);
    }
}
