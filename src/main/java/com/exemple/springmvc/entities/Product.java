package com.exemple.springmvc.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.*;

@Entity // Cette classe Java représente une table dans la base de données.
@NoArgsConstructor @AllArgsConstructor @Getter @Setter @ToString @Builder
public class Product {
    @Id @GeneratedValue // ce qui est en bas de cette ligne est l'id AUTOINCREMENT
    private long id;
    @NotEmpty
    @Size(min=3, max=50)
    private String name;
    @Min(0)
    private double price;
    @Min(1)
    private double quantity;
}
