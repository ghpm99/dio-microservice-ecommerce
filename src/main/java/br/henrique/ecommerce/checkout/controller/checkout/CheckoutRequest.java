package br.henrique.ecommerce.checkout.controller.checkout;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CheckoutRequest {

    private String firstName;
    private String lastName;
    private String userName;
    private String email;
    private String address;
    private String complement;
    private String country;
    private String state;
    private String cep;
    private boolean saveAddress;
    private boolean saveInfo;
    private String paymentMethod;
    private String cardName;
}
