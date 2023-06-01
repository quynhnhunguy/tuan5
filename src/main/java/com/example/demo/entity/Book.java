package com.example.demo.entity;

import com.example.demo.Validator.anonation1.ValidUserId;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
@Table(name="book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    @Size(max = 50,min=1,message = "Title must be less than 50 charatecrs")
    private String title;

    @Column(name = "author",length = 50)
    @Size(max=50,message = "Author must be less than 50 charatecrs")
    private String author;

    @Column(name = "price")
    @NotNull(message = "Pirce is required")
    private Double price;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

   @ManyToOne
   @JoinColumn(name="user_id",referencedColumnName = "id")
   @ValidUserId
   private User user;
}

























