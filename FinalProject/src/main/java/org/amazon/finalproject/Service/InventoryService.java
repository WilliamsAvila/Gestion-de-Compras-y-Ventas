package org.amazon.finalproject.Service;

import org.amazon.finalproject.DTO.InventoryRequestDTO;
import org.amazon.finalproject.Model.Category;
import org.amazon.finalproject.Model.Inventory;
import org.amazon.finalproject.Model.Seller;
import org.amazon.finalproject.Repository.InventoryRepository;
import org.amazon.finalproject.Repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InventoryService {

    @Autowired
    private InventoryRepository inventoryRepository;

    @Autowired
    private SellerRepository sellerRepository;

    public Optional<Inventory> createInventory(InventoryRequestDTO inventory) {
        Optional<Seller> foundId = sellerRepository.findById(inventory.getId());
        if (foundId.isPresent()) {
            Seller foundSeller = foundId.get();
            Inventory newInventory = new Inventory(inventory.getName(),inventory.getDescription(),inventory.getCategory(),inventory.getPrice(),foundSeller);
            Inventory savedInventory = inventoryRepository.save(newInventory);
            return Optional.of(savedInventory);
        } else {
            return Optional.empty();
        }
    }

    public List<Inventory> getAllInventoryBySellerId(Long id) {
        return inventoryRepository.findAllBySellerId(id);

    }

    public  List<Inventory> getAllInventoryByCategory(Category category) {
        return inventoryRepository.findAllByCategory(category);
    }

    public Optional <Inventory> deleteInventory(int id){
        Optional<Inventory> inventory = inventoryRepository.findById(id);
        if(inventory.isPresent()) {
            inventoryRepository.deleteById(id);
            return inventory;
        } else {
            return Optional.empty();
        }
    }
}
