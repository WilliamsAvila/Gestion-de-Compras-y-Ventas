package org.amazon.finalproject.Controller;


import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.amazon.finalproject.DTO.CustomerRequestDTO;
import org.amazon.finalproject.DTO.PurchaseRequestDTO;
import org.amazon.finalproject.Model.Category;
import org.amazon.finalproject.Model.Customer;
import org.amazon.finalproject.Model.Inventory;
import org.amazon.finalproject.Model.Purchase;
import org.amazon.finalproject.Service.CustomerService;
import org.amazon.finalproject.Service.InventoryService;
import org.amazon.finalproject.Service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@Slf4j
@RestController
@RequestMapping("/api/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private PurchaseService purchaseService;

    @Autowired
    private InventoryService inventoryService;

    @PostMapping
    public ResponseEntity<Customer> createCustomer(@Valid @RequestBody CustomerRequestDTO customer) {
    Customer customer1 = customerService.addCustomer(customer);
    return ResponseEntity.status(HttpStatus.CREATED).body(customer1);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Customer> updateCustomer(@PathVariable int id, @RequestBody CustomerRequestDTO customer) {
        Optional<Customer> customer1 = customerService.updateCustomer(id,customer);
        if (customer1.isPresent()) {
            return ResponseEntity.ok(customer1.get());
        } else
            return ResponseEntity.notFound().build();
    }

    @PostMapping("/purchase")
    public ResponseEntity<Purchase> createPurchase(@RequestBody PurchaseRequestDTO purchase) {
        Optional<Purchase> purchase1 = purchaseService.createPurchase(purchase);
        if (purchase1.isPresent()) {
            return ResponseEntity.ok(purchase1.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/category/{category}")
    public List<Inventory> getAllInventoryByCategory(@PathVariable Category category) {
        return inventoryService.getAllInventoryByCategory(category);
    }

    @GetMapping("/{findByName}")
    public String getCustomer(@PathVariable String findByName) {
        log.info("GET: customer{}", findByName);
        return customerService.findCustomerByName(findByName).getName() + " Esta en la base de datos";

    }

}

