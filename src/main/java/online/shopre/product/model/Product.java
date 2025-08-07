package online.shopre.product.model;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class Product {

    private UUID id;

    private String name;

    private String slug;

    private String[] images;

    private String brand;

    private String description;

    private Integer stock;

    private Double price;

    private Double rating;

    private Integer ratingCount;

    private Boolean isFeatured;

    private LocalDateTime createdAt;
    protected void onCreate(){

    }

}
