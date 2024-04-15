package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false)
    private String bookName;

    @Column(name = "autor", nullable = false)
    private String bookAuthor;

    @Column(name = "preco", nullable = false)
    private double bookPrice;

    @Column(name = "qte", nullable = false)
    private int bookQuantity;
}
