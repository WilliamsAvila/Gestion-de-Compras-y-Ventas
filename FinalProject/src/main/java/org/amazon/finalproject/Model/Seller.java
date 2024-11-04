package org.amazon.finalproject.Model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
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
    private String razonSocial;
    @Enumerated(EnumType.STRING)
    private TypeOfUser typeOfUser;

    public Seller(String name, String password, String email, String phone, String address, String cif, String razonSocial, TypeOfUser typeOfUser) {
        super(name, password, email, phone, address);
        this.cif = cif;
        this.razonSocial = razonSocial;
        this.typeOfUser = typeOfUser;
    }
}
