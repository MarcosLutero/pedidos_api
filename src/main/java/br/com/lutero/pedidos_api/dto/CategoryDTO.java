package br.com.lutero.pedidos_api.dto;

import java.time.LocalDate;

import br.com.lutero.pedidos_api.Enums.Active;
import br.com.lutero.pedidos_api.entities.Category;

public class CategoryDTO {

    private Long id;
    private String nome;
    private String descricao;
    private Active active;
    private LocalDate createdAt;
    private LocalDate updatedAt;

    public CategoryDTO() {
    }

    public CategoryDTO(Long id, String nome, String descricao, Active active, LocalDate createdAt, LocalDate updatedAt) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.active = active;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public static CategoryDTO fromEntity(Category category) {
        if (category == null) {
            return null;
        }

        return new CategoryDTO(
                category.getId(),
                category.getNome(),
                category.getDescricao(),
                category.getActive(),
                category.getCreatedAt(),
                category.getUpdatedAt());
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
}
