package br.henrique.ecommerce.checkout.service;

import br.henrique.ecommerce.checkout.controller.checkout.CheckoutRequest;
import br.henrique.ecommerce.checkout.entity.CheckoutEntity;

import java.util.Optional;

public interface CheckoutService {

    Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest);
}
