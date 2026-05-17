package br.com.lutero.pedidos_api.entities;

import java.time.LocalDate;
import java.util.List;

import br.com.lutero.pedidos_api.Enums.StatusOrder;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "tb_order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @OneToMany(mappedBy = "order")
    private List<OrderItem> orderItems;

    private double total;

    @Enumerated(EnumType.STRING)
    private StatusOrder statusOrder;

    @OneToOne(mappedBy="order")
    private Payment payment;

    private LocalDate orderDate;

    private LocalDate createdAt;

    private LocalDate updatedAt;

}
