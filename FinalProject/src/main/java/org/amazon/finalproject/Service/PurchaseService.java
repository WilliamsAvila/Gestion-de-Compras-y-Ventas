package org.amazon.finalproject.Service;

import org.amazon.finalproject.DTO.PurchaseRequestDTO;
import org.amazon.finalproject.Model.Customer;
import org.amazon.finalproject.Model.Purchase;
import org.amazon.finalproject.Repository.CustomerRepository;
import org.amazon.finalproject.Repository.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PurchaseService {

    @Autowired
    private PurchaseRepository purchaseRepository;

    @Autowired
    private CustomerRepository customerRepository;

    public Optional<Purchase> createPurchase(PurchaseRequestDTO purchase) {
        Optional<Customer> foundId = customerRepository.findById(purchase.getId());
        if (foundId.isPresent()) {
            Customer foundCustomer = foundId.get();
            Purchase purchaseToUpdate = new Purchase(purchase.getPurchaseDate(), purchase.getPurchaseRecordId(),foundCustomer);
            Purchase updatedPurchase = purchaseRepository.save(purchaseToUpdate);
            return Optional.of(updatedPurchase);
        } else {
            return Optional.empty();
        }
    }
}
