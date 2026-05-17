package br.com.lutero.pedidos_api.entities;

import java.time.LocalDate;
import java.util.List;

import br.com.lutero.pedidos_api.Enums.Active;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tb_category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String descricao;

    @Enumerated(EnumType.STRING)
    private Active active;

    private LocalDate createdAt;

    private LocalDate updatedAt;

    @OneToMany(mappedBy = "category")
    private List<Product> products;

}
