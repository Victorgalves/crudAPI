package com.cesarschool.crudapi.domain.product;


import jakarta.persistence.*;
import lombok.*;

@Table(name="catalogo_produtos")
@Entity(name="product")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of ="id")
public class Product {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String name;
    private double price_in_cents;

    public Product(RequestProduct requestProduct) {
        this.name = requestProduct.name();
        this.price_in_cents = requestProduct.price_in_cents();
    }
}
