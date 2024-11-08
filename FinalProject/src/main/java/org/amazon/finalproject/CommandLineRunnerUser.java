package org.amazon.finalproject;

import org.amazon.finalproject.Model.Customer;
import org.amazon.finalproject.Repository.CustomerRepository;
import org.amazon.finalproject.Repository.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLineRunnerUser implements CommandLineRunner {

//    @Autowired
//    private UsersRepository userRepository;

    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private PurchaseRepository purchaseRepository;

    @Override
    public void run(String... args) throws Exception {


    }
}
