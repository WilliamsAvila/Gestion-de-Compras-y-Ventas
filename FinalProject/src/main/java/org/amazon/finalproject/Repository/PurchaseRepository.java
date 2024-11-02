package org.amazon.finalproject.Repository;

import org.amazon.finalproject.Model.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseRepository extends JpaRepository<Purchase, Integer>{
}
