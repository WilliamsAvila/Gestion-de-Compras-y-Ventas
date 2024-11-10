package org.amazon.finalproject.Service;

import org.amazon.finalproject.DTO.SellerRequestDTO;
import org.amazon.finalproject.Model.Seller;
import org.amazon.finalproject.Repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Optional;

@Service
public class SellerService {

    @Autowired
    private SellerRepository sellerRepository;

    public Seller addSeller(SellerRequestDTO seller) {
        Seller seller2 = new Seller();
        if(seller.getName()!=null){
            seller2.setName(seller.getName());
        } else {
            throw new RuntimeException("no se puede ingresar el nombre");
        }
        seller2.setCif(seller.getCif());
        seller2.setEmail(seller.getEmail());
        seller2.setAddress(seller.getAddress());
        seller2.setPhone(seller.getPhone());
        seller2.setCompanyName(seller.getCompanyName());
        sellerRepository.save(seller2);
        return seller2;
    }

    public Optional<Seller> updateSeller(Integer id, SellerRequestDTO seller) {
        Optional<Seller> findCustomerById = sellerRepository.findById(id);
        if (findCustomerById.isPresent()) {
            Seller foundCustomer = findCustomerById.get();
            if (!Objects.equals(seller.getName(), foundCustomer.getName()) && seller.getName() != null) {
                foundCustomer.setName(seller.getName());
            }
            if (!Objects.equals(seller.getEmail(), foundCustomer.getEmail()) && seller.getEmail() != null) {
                foundCustomer.setEmail(seller.getEmail());
            }
            if (!Objects.equals(seller.getPhone(), foundCustomer.getPhone()) && seller.getPhone() != null) {
                foundCustomer.setPhone(seller.getPhone());
            }
            if (!Objects.equals(seller.getAddress(), foundCustomer.getAddress()) && seller.getAddress() != null) {
                foundCustomer.setAddress(seller.getAddress());
            }
            if(!Objects.equals(seller.getCompanyName(), foundCustomer.getCompanyName())&& seller.getCompanyName() != null) {
                foundCustomer.setCompanyName(seller.getCompanyName());
            }
            if(!Objects.equals(seller.getCif(), foundCustomer.getCif()) && seller.getCif() != null) {
                foundCustomer.setCif(seller.getCif());
            }
            Seller updatedCustomer = sellerRepository.save(foundCustomer);
            return Optional.of(updatedCustomer);
        } else {
            return Optional.empty();
        }
    }


}
