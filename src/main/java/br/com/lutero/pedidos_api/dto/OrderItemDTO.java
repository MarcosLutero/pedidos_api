package br.com.lutero.pedidos_api.dto;

import br.com.lutero.pedidos_api.entities.OrderItem;
import br.com.lutero.pedidos_api.entities.Product;

public class OrderItemDTO {

    private Long id;
    private Long productId;
    private String productNome;
    private int quantidade;
    private double precoUnitario;
    private double subtotal;

    public OrderItemDTO() {
    }

    public OrderItemDTO(Long id, Long productId, String productNome, int quantidade, double precoUnitario,
            double subtotal) {
        this.id = id;
        this.productId = productId;
        this.productNome = productNome;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
        this.subtotal = subtotal;
    }

    public static OrderItemDTO fromEntity(OrderItem orderItem) {
        if (orderItem == null) {
            return null;
        }

        Product product = orderItem.getProduct();

        return new OrderItemDTO(
                orderItem.getId(),
                product != null ? product.getId() : null,
                product != null ? product.getNome() : null,
                orderItem.getQuantidade(),
                orderItem.getPrecoUnitario(),
                orderItem.getSubtotal());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductNome() {
        return productNome;
    }

    public void setProductNome(String productNome) {
        this.productNome = productNome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
}
