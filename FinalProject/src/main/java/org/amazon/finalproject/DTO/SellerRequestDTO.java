package org.amazon.finalproject.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SellerRequestDTO {

    private String name;
    private String email;
    private String phone;
    private String address;
    private String cif;
    private String companyName;
}
