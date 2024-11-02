package org.amazon.finalproject.DTO;

import org.amazon.finalproject.Model.Seller;
import org.amazon.finalproject.Model.TypeOfUser;

public class SellerRequestDTO extends Seller {
    public SellerRequestDTO() {
    }

    public SellerRequestDTO(String name, String password, String email, String phone, String address, String cif, String razonSocial, TypeOfUser typeOfUser) {
        super(name, password, email, phone, address, cif, razonSocial, typeOfUser);
    }
}
