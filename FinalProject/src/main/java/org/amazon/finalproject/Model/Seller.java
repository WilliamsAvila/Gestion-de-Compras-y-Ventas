package org.amazon.finalproject.Model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.util.Collection;

@Getter
@Setter
@NoArgsConstructor
@DiscriminatorValue("seller")
@Entity
public class Seller extends Users {


    private String cif;
    private String companyName;

    public Seller(String name, String email, String phone, String address, String cif, String companyName) {
        super(name, email, phone, address);
        this.cif = cif;
        this.companyName = companyName;
    }
}
