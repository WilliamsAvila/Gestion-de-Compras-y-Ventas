package org.amazon.finalproject.Model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@DiscriminatorValue("customer")
public class Customer extends Users {


    public Customer(String name, String password, String email, String phone, String address) {
        super(name, password, email, phone, address);

    }

//    @OneToMany(mappedBy = "customer")
//    private List<Purchase> purchases = new ArrayList<>();
}
