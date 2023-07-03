package com.example.PostgresqlAssignment2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Immutable;

@Entity(name="v2_product")
@Immutable
@Data
public class Product {
    @Id
    private int productId;
    private String productName;
    private int productQuantity;
    private float productPrice;
    private double totalprice;
}
