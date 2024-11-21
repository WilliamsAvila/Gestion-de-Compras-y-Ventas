package org.amazon.finalproject.DTO;

import jakarta.validation.constraints.NotNull;
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

    @NotNull
    private LocalDate purchaseDate;
    @NotNull
    private int customerId;
    @NotNull
    private int productId;


}
