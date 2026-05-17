package br.com.lutero.pedidos_api.dto;

import java.time.LocalDate;

import br.com.lutero.pedidos_api.Enums.Active;
import br.com.lutero.pedidos_api.entities.Category;
import br.com.lutero.pedidos_api.entities.Product;

public class ProductDTO {

    private Long id;
    private String nome;
    private String descricao;
    private double price;
    private int qnt;
    private Active active;
    private LocalDate createdAt;
    private LocalDate updatedAt;
    private Long categoryId;
    private String categoryNome;

    public ProductDTO() {
    }

    public ProductDTO(Long id, String nome, String descricao, double price, int qnt, Active active,
            LocalDate createdAt, LocalDate updatedAt, Long categoryId, String categoryNome) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.price = price;
        this.qnt = qnt;
        this.active = active;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.categoryId = categoryId;
        this.categoryNome = categoryNome;
    }

    public static ProductDTO fromEntity(Product product) {
        if (product == null) {
            return null;
        }

        Category category = product.getCategory();

        return new ProductDTO(
                product.getId(),
                product.getNome(),
                product.getDescricao(),
                product.getPrice(),
                product.getQnt(),
                product.getActive(),
                product.getCreatedAt(),
                product.getUpdatedAt(),
                category != null ? category.getId() : null,
                category != null ? category.getNome() : null);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQnt() {
        return qnt;
    }

    public void setQnt(int qnt) {
        this.qnt = qnt;
    }

    public Active getActive() {
        return active;
    }

    public void setActive(Active active) {
        this.active = active;
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

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryNome() {
        return categoryNome;
    }

    public void setCategoryNome(String categoryNome) {
        this.categoryNome = categoryNome;
    }
}
