package org.amazon.finalproject.Repository;

import org.amazon.finalproject.Model.Category;
import org.amazon.finalproject.Model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InventoryRepository extends JpaRepository<Inventory, Integer> {

    List<Inventory> findAllBySellerId (Long seller_id);
    List<Inventory> findAllByCategory (Category category);
}
