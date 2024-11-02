package org.amazon.finalproject.Service;

import org.amazon.finalproject.DTO.CustomerRequestDTO;
import org.amazon.finalproject.Model.Customer;
import org.amazon.finalproject.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer addCustomer(CustomerRequestDTO customer) {
        Customer customer1 = new Customer(customer.getName(),customer.getPassword(),customer.getEmail(), customer.getPhone(), customer.getAddress(),customer.getTypeOfUser());
        return customerRepository.save(customer1);
    }

    public Optional<Customer> updateCustomer(Integer id, CustomerRequestDTO customer) {
        Optional<Customer> findCustomerById = customerRepository.findById(id);
        if (findCustomerById.isPresent()) {
            Customer foundCustomer = findCustomerById.get();
            if(!Objects.equals(customer.getName(), foundCustomer.getName()) && customer.getName()!=null) {
                foundCustomer.setName(customer.getName());

            }
        }

    }
}
