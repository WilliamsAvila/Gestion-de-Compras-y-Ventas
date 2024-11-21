package org.amazon.finalproject.DTO;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.amazon.finalproject.Model.Category;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class InventoryRequestDTO {

    @NotNull (message ="debe haber un id ")
    private int id;
    @NotNull (message = "debe haber un nombre")
    private String name;
    @NotNull
    private String description;
    @NotNull
    private Category category;
    @NotNull
    private double price;
}
