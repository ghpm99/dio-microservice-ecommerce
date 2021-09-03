package br.henrique.ecommerce.checkout.listener;

import br.henrique.ecommerce.checkout.entity.CheckoutEntity;
import br.henrique.ecommerce.checkout.repository.CheckoutRepository;
import br.henrique.ecommerce.checkout.streaming.PaymentPaidSink;
import br.henrique.ecommerce.payment.event.PaymentCreatedEvent;
import org.springframework.cloud.stream.annotation.StreamListener;

public class PaymentPaidListener {

    private CheckoutRepository checkoutRepository;

    @StreamListener(PaymentPaidSink.INPUT)
    public void handler(PaymentCreatedEvent event){
        final CheckoutEntity checkoutEntity =  checkoutRepository.findByCode(event.getCheckoutCode().toString()).orElseThrow();
        checkoutEntity.setStatus(CheckoutEntity.Status.APPROVED);
        checkoutRepository.save(checkoutEntity);

    }
}
