package org.amazon.finalproject.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.amazon.finalproject.Model.Customer;

import java.time.LocalDate;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PurchaseRequestDTO {
    private int id;
    private Integer purchaseRecordId;
    private LocalDate purchaseDate;
    private int productId;

    // customerId
}
