package org.amazon.finalproject.Repository;

import org.amazon.finalproject.Model.Customer;
import org.amazon.finalproject.Model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository <Customer, Integer>{

}
