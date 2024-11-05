package org.amazon.finalproject.Service;

import org.amazon.finalproject.DTO.PurchaseRequestDTO;
import org.amazon.finalproject.Model.Customer;
import org.amazon.finalproject.Model.Inventory;
import org.amazon.finalproject.Model.Purchase;
import org.amazon.finalproject.Repository.CustomerRepository;
import org.amazon.finalproject.Repository.InventoryRepository;
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

    @Autowired
    private InventoryRepository inventoryRepository;

    public Optional<Purchase> createPurchase(PurchaseRequestDTO purchase) {
        Optional<Customer> foundCustomerId = customerRepository.findById(purchase.getCustomerId());
        Optional<Inventory> foundInventoryId = inventoryRepository.findById(purchase.getProductId());
        if (foundCustomerId.isPresent()&& foundInventoryId.isPresent()) {
            Customer foundCustomer = foundCustomerId.get();
            Inventory foundInventory = foundInventoryId.get();
            Purchase purchaseToUpdate = new Purchase(purchase.getPurchaseDate(), foundCustomer, foundInventory);

            Purchase updatedPurchase = purchaseRepository.save(purchaseToUpdate);
            return Optional.of(updatedPurchase);
        } else {
            return Optional.empty();
        }
    }
}
