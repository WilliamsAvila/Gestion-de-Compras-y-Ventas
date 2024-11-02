package org.amazon.finalproject.Repository;

import org.amazon.finalproject.Model.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerRepository extends JpaRepository<Seller, Integer> {
}
