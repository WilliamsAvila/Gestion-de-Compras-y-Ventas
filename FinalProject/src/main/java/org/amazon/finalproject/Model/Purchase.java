package org.amazon.finalproject.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
//@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Purchase {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int purchaseRecordId;
    private LocalDate purchaseDate;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name= "customer_Id",referencedColumnName = "id")
    private Customer customer;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "product_Id",referencedColumnName = "productId")
    private Inventory inventory;


    public Purchase(LocalDate purchaseDate, Customer customer, Inventory inventory) {
        this.purchaseDate = purchaseDate;
        this.customer = customer;
        this.inventory = inventory;

}
}
