package org.amazon.finalproject.Controller;

import org.amazon.finalproject.DTO.SellerRequestDTO;
import org.amazon.finalproject.Model.Seller;
import org.amazon.finalproject.Service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/seller")
public class SellerController {

    @Autowired
    private SellerService sellerService;

    @PostMapping
    public ResponseEntity<Seller> creteSeller(@RequestBody SellerRequestDTO sellerRequestDTO) {
        Seller seller = sellerService.addSeller(sellerRequestDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(seller);
    }
}
