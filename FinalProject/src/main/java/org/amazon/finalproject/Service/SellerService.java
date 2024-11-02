package org.amazon.finalproject.Service;

import org.amazon.finalproject.DTO.SellerRequestDTO;
import org.amazon.finalproject.Model.Seller;
import org.amazon.finalproject.Repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellerService {

    @Autowired
    private SellerRepository sellerRepository;

    public Seller addSeller(SellerRequestDTO seller) {
        Seller seller1 = new Seller(seller.getName(),seller.getPassword(),seller.getEmail(),seller.getPhone(),seller.getAddress(),seller.getCif(),seller.getRazonSocial(),seller.getTypeOfUser());
        return sellerRepository.save(seller1);
    }
}
