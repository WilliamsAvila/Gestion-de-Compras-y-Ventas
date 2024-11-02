package org.amazon.finalproject.DTO;

import org.amazon.finalproject.Model.Customer;
import org.amazon.finalproject.Model.TypeOfUser;

public class CustomerRequestDTO extends Customer {

    public CustomerRequestDTO(String name, String password, String email, String phone, String address, TypeOfUser typeOfUser) {
        super(name, password, email, phone, address, typeOfUser);
    }

}
