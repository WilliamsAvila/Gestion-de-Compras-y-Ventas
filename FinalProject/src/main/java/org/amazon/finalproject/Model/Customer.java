package org.amazon.finalproject.Model;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@DiscriminatorValue("customer")
public class Customer extends User {

//    @Id
//    @GeneratedValue(strategy = GenerationType.TABLE)
//    private int customerId;
    @Enumerated (EnumType.STRING)
    private TypeOfUser typeOfUser;
    public Customer(String name, String password,
                    String email, String phone, String address,
                    TypeOfUser typeOfUser) {
        super(name, password, email, phone, address);
        this.typeOfUser = typeOfUser;
    }

}
