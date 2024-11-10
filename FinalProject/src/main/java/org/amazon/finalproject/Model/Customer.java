package org.amazon.finalproject.Model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.util.Collection;


@Entity
@Getter
@Setter
@NoArgsConstructor
@DiscriminatorValue("customer")
public class Customer extends Users {


    public Customer(String name, String email, String phone, String address) {
        super(name, email, phone, address);
    }

}
