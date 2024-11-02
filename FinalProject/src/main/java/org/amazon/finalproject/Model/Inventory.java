package org.amazon.finalproject.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Inventory {
    @Id
    private Integer productId;

    private String productName;
    private String productDescription;
    private String productCategory;
    private String productPrice;
}
