package net.javaguides.springboot.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PRODUCT_TBL")
public class Product {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int quantity;
    private double price;
}
