package org.amazon.finalproject.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.amazon.finalproject.Model.Customer;
import org.amazon.finalproject.Model.Inventory;

import java.time.LocalDate;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PurchaseRequestDTO {

    private LocalDate purchaseDate;
    private int customerId;
    private int productId;


    // customerId
}
