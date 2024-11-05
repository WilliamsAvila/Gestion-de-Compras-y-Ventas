package org.amazon.finalproject.Model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@DiscriminatorValue("seller")
@Entity
public class Seller extends User {

//    @Id
//    @GeneratedValue(strategy = GenerationType.TABLE)
//    private int sellerId;

    private String cif;
    private String companyName;


    public Seller(String name, String password, String email, String phone, String address, String cif, String companyName) {
        super(name, password, email, phone, address);
        this.cif = cif;
        this.companyName = companyName;
    }
}
