package br.com.lutero.pedidos_api.entities;

import java.time.LocalDate;

import br.com.lutero.pedidos_api.Enums.PaymentMetodo;
import br.com.lutero.pedidos_api.Enums.PaymentStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name= "tb_payment")
public class Payment {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name="order_id")
    private Order order;

    private double soma;

    @Enumerated(EnumType.STRING)
    private PaymentMetodo paymentMetodo;

    @Enumerated(EnumType.STRING)
    private PaymentStatus status;

    private LocalDate paymentDate;

    private LocalDate createdAt;

    private LocalDate updatedAt;

}
