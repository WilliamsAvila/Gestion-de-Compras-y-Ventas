package org.amazon.finalproject.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ResgistoCompra {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer purchaseRecordId;

    //forenkey

    private int customerId;
    private LocalDate purchaseDate;
    private int productId;

    @ManyToOne
    @JoinColumn(name= "PurchaseID",referencedColumnName = "id")
    private Customer customerList;



}
