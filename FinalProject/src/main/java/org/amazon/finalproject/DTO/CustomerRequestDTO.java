package org.amazon.finalproject.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.amazon.finalproject.Model.Customer;
import org.amazon.finalproject.Model.TypeOfUser;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomerRequestDTO  {

    private String name;
    private String password;
    private String email;
    private String phone;
    private String address;

}
