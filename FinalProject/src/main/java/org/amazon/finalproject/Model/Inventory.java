package org.amazon.finalproject.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Inventory {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer productId;

    private String productName;
    private String description;
    @Enumerated(EnumType.STRING)
    private Category category;
    private double price;
    @ManyToOne
    @JsonIgnore
    private Seller seller;

    public Inventory(String productName, String description, Category category, double price, Seller seller) {
        this.productName = productName;
        this.description = description;
        this.category = category;
        this.price = price;
        this.seller = seller;
    }
}
