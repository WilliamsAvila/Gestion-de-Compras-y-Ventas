package org.amazon.finalproject.Model;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@DiscriminatorValue("Customer")
public class Customer extends User {

//    @Id
//    @GeneratedValue(strategy = GenerationType.TABLE)
//    private int customerId;
    private TypeOfUser typeOfUser;
    public Customer(Long id, String name, String password,
                    String email, String phone, String address,
                    TypeOfUser typeOfUser) {
        super(id, name, password, email, phone, address);
        this.typeOfUser = typeOfUser;
    }

}
