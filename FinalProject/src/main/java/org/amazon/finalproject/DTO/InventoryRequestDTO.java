package org.amazon.finalproject.DTO;

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

    private int id;
    private String name;
    private String description;
    private Category category;
    private double price;
}
