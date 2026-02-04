package com.produit1.produit1services.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Table(name = "produit1")
public class Produit {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private double price;
}
