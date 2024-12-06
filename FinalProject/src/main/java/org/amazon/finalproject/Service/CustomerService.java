package org.amazon.finalproject.Service;

import org.amazon.finalproject.DTO.CustomerRequestDTO;
import org.amazon.finalproject.Model.Customer;
import org.amazon.finalproject.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.rmi.NoSuchObjectException;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer addCustomer(CustomerRequestDTO customer) {
        Customer customer1 = new Customer(customer.getName(), customer.getEmail(),customer.getPhone(),customer.getAddress());
        return customerRepository.save(customer1);
    }

    public Optional<Customer> updateCustomer(Integer id, CustomerRequestDTO customer) {
        Optional<Customer> findCustomerById = customerRepository.findById(id);

        if (findCustomerById.isPresent()) {
            Customer foundCustomer = findCustomerById.get();
            if (!Objects.equals(customer.getName(), foundCustomer.getName()) && customer.getName() != null) {
                foundCustomer.setName(customer.getName());
            }
            if (!Objects.equals(customer.getEmail(), foundCustomer.getEmail()) && customer.getEmail() != null) {
                foundCustomer.setEmail(customer.getEmail());
            }
            if (!Objects.equals(customer.getPhone(), foundCustomer.getPhone()) && customer.getPhone() != null) {
                foundCustomer.setPhone(customer.getPhone());
            }
            if (!Objects.equals(customer.getAddress(), foundCustomer.getAddress()) && customer.getAddress() != null) {
                foundCustomer.setAddress(customer.getAddress());
            }
            Customer updatedCustomer = customerRepository.save(foundCustomer);
            return Optional.of(updatedCustomer);

        } else {
            return Optional.empty();
        }
    }


    public Customer findCustomerByName(String name) {
        return this.customerRepository.findByName(name).orElseThrow(() -> new NoSuchElementException("Customer not found"));
    }




}
