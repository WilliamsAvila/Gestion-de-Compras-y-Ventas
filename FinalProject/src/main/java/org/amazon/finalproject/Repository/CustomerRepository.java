package org.amazon.finalproject.Repository;

import org.amazon.finalproject.Model.Customer;
import org.amazon.finalproject.Model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository <Customer, Integer>{


    Optional<Customer> findByName(String name);


}
