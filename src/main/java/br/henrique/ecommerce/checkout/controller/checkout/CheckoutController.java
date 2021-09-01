package br.henrique.ecommerce.checkout.controller.checkout;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/checkout")
public class CheckoutController {

    @PostMapping("/")
    public ResponseEntity<Void> create(CheckoutController checkoutController){
        return ResponseEntity.ok().build();
    }
}
