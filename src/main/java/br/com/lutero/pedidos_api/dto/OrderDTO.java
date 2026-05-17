package br.com.lutero.pedidos_api.dto;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import br.com.lutero.pedidos_api.Enums.StatusOrder;
import br.com.lutero.pedidos_api.entities.Customer;
import br.com.lutero.pedidos_api.entities.Order;

public class OrderDTO {

    private Long id;
    private Long customerId;
    private String customerName;
    private List<OrderItemDTO> orderItems;
    private double total;
    private StatusOrder statusOrder;
    private PaymentDTO payment;
    private LocalDate orderDate;
    private LocalDate createdAt;
    private LocalDate updatedAt;

    public OrderDTO() {
    }

    public OrderDTO(Long id, Long customerId, String customerName, List<OrderItemDTO> orderItems, double total,
            StatusOrder statusOrder, PaymentDTO payment, LocalDate orderDate, LocalDate createdAt,
            LocalDate updatedAt) {
        this.id = id;
        this.customerId = customerId;
        this.customerName = customerName;
        this.orderItems = orderItems;
        this.total = total;
        this.statusOrder = statusOrder;
        this.payment = payment;
        this.orderDate = orderDate;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public static OrderDTO fromEntity(Order order) {
        if (order == null) {
            return null;
        }

        Customer customer = order.getCustomer();
        List<OrderItemDTO> orderItems = order.getOrderItems() == null
                ? Collections.emptyList()
                : order.getOrderItems().stream()
                        .map(OrderItemDTO::fromEntity)
                        .collect(Collectors.toList());

        return new OrderDTO(
                order.getId(),
                customer != null ? customer.getId() : null,
                customer != null ? customer.getName() : null,
                orderItems,
                order.getTotal(),
                order.getStatusOrder(),
                PaymentDTO.fromEntity(order.getPayment()),
                order.getOrderDate(),
                order.getCreatedAt(),
                order.getUpdatedAt());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public List<OrderItemDTO> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItemDTO> orderItems) {
        this.orderItems = orderItems;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public StatusOrder getStatusOrder() {
        return statusOrder;
    }

    public void setStatusOrder(StatusOrder statusOrder) {
        this.statusOrder = statusOrder;
    }

    public PaymentDTO getPayment() {
        return payment;
    }

    public void setPayment(PaymentDTO payment) {
        this.payment = payment;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
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
