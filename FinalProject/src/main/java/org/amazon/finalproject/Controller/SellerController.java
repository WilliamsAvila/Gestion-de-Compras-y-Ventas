package org.amazon.finalproject.Controller;

import org.amazon.finalproject.DTO.SellerRequestDTO;
import org.amazon.finalproject.Model.Seller;
import org.amazon.finalproject.Service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

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

    @PutMapping("/{id}")
    public ResponseEntity<Seller> updateSeller(@PathVariable int id, @RequestBody SellerRequestDTO sellerRequestDTO) {
        Optional<Seller> seller1 = sellerService.updateSeller(id, sellerRequestDTO);
        if (seller1.isPresent()) {
            return ResponseEntity.status(HttpStatus.OK).body(seller1.get());
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }
}
