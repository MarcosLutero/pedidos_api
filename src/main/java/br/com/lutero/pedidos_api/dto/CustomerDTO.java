package br.com.lutero.pedidos_api.dto;

import java.time.LocalDate;

import br.com.lutero.pedidos_api.Enums.Active;
import br.com.lutero.pedidos_api.entities.Customer;

public class CustomerDTO {

    private Long id;
    private String name;
    private String email;
    private String telefone;
    private String cpf;
    private Active active;
    private LocalDate createdAt;
    private LocalDate updatedAt;

    public CustomerDTO() {
    }

    public CustomerDTO(Long id, String name, String email, String telefone, String cpf, Active active,
            LocalDate createdAt, LocalDate updatedAt) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.telefone = telefone;
        this.cpf = cpf;
        this.active = active;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public static CustomerDTO fromEntity(Customer customer) {
        if (customer == null) {
            return null;
        }

        return new CustomerDTO(
                customer.getId(),
                customer.getName(),
                customer.getEmail(),
                customer.getTelefone(),
                customer.getCpf(),
                customer.getActive(),
                customer.getCreatedAt(),
                customer.getUpdatedAt());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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
