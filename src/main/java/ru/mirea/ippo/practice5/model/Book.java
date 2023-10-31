package ru.mirea.ippo.practice5.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name ="author")
    private String author;

    @Column(name = "product_type")
    @Enumerated (EnumType.STRING)
    private ProductType productType;

    @Column(name = "cost")
    private Integer cost;

    @Column(name = "name")
    private String name;
}
