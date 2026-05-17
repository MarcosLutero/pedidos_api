package br.com.lutero.pedidos_api.dto;

import java.time.LocalDate;

import br.com.lutero.pedidos_api.Enums.PaymentMetodo;
import br.com.lutero.pedidos_api.Enums.PaymentStatus;
import br.com.lutero.pedidos_api.entities.Order;
import br.com.lutero.pedidos_api.entities.Payment;

public class PaymentDTO {

    private Long id;
    private Long orderId;
    private double soma;
    private PaymentMetodo paymentMetodo;
    private PaymentStatus status;
    private LocalDate paymentDate;
    private LocalDate createdAt;
    private LocalDate updatedAt;

    public PaymentDTO() {
    }

    public PaymentDTO(Long id, Long orderId, double soma, PaymentMetodo paymentMetodo, PaymentStatus status,
            LocalDate paymentDate, LocalDate createdAt, LocalDate updatedAt) {
        this.id = id;
        this.orderId = orderId;
        this.soma = soma;
        this.paymentMetodo = paymentMetodo;
        this.status = status;
        this.paymentDate = paymentDate;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public static PaymentDTO fromEntity(Payment payment) {
        if (payment == null) {
            return null;
        }

        Order order = payment.getOrder();

        return new PaymentDTO(
                payment.getId(),
                order != null ? order.getId() : null,
                payment.getSoma(),
                payment.getPaymentMetodo(),
                payment.getStatus(),
                payment.getPaymentDate(),
                payment.getCreatedAt(),
                payment.getUpdatedAt());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public double getSoma() {
        return soma;
    }

    public void setSoma(double soma) {
        this.soma = soma;
    }

    public PaymentMetodo getPaymentMetodo() {
        return paymentMetodo;
    }

    public void setPaymentMetodo(PaymentMetodo paymentMetodo) {
        this.paymentMetodo = paymentMetodo;
    }

    public PaymentStatus getStatus() {
        return status;
    }

    public void setStatus(PaymentStatus status) {
        this.status = status;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDate getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDate updatedAt) {
        this.updatedAt = updatedAt;
    }
}
