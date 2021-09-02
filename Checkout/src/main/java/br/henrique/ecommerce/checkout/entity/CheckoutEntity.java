package br.henrique.ecommerce.checkout.entity;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import javax.persistence.*;

@Table(name = "CheckoutEntity")
@Entity
@Data
@Builder
public class CheckoutEntity {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String code;

    @Column
    @Enumerated(value = EnumType.STRING)
    private Status status;

    public enum Status{
        CREATED,
        APPROVED
    }
}
