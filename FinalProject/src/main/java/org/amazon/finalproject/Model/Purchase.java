package org.amazon.finalproject.Model;

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
    private Integer purchaseRecordId;
    private LocalDate purchaseDate;
    private int productId;

    public Purchase(LocalDate purchaseDate, int productId, Customer customer) {
        this.purchaseDate = purchaseDate;
        this.productId = productId;
        this.customer = customer;
    }

    @ManyToOne
//    @JoinColumn(name= "purchase_id",referencedColumnName = "id")
    private Customer customer;



}
