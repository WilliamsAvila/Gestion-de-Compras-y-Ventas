package org.amazon.finalproject.Repository;

import org.amazon.finalproject.Model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory, Integer> {
}
