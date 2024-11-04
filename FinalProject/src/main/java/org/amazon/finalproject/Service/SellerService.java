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
        Seller seller2 = new Seller();
        if(seller.getName()!=null){
            seller2.setName(seller.getName());
        } else {
//            seller2.setName("Debe haber un nombre");
            throw new RuntimeException("no se puede ingresar el nombre");
        }
        seller2.setCif(seller.getCif());
        seller2.setEmail(seller.getEmail());
        seller2.setPassword(seller.getPassword());
        seller2.setAddress(seller.getAddress());
        seller2.setPhone(seller.getPhone());
        seller2.setRazonSocial(seller.getRazonSocial());
        seller2.setTypeOfUser(seller.getTypeOfUser());
        sellerRepository.save(seller2);
        return seller2;



//        if (seller.getName() == null && seller.getEmail() == null && seller.getPassword() == null) {
//            throw new IllegalArgumentException("No se puede agregar el usuario");
//        } else {
//            Seller seller1 = new Seller(seller.getName(),seller.getPassword(),seller.getEmail(),seller.getPhone(),seller.getAddress(),seller.getCif(),seller.getRazonSocial(),seller.getTypeOfUser());
//            return sellerRepository.save(seller);
//        }
    }


}
