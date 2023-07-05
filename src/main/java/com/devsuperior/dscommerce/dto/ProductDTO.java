package com.devsuperior.dscommerce.dto;

import com.devsuperior.dscommerce.entities.Product;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ProductDTO {

    private Long id;

    @NotBlank(message = "Required field")
    @Size(min = 3, max = 80 , message = "The name must be between 3 and 80 characters")
    private String name;

    @Size(min = 10 , message = "The description must be at least 10 characters")
    private String description;

    @Positive(message = "The price must be a positive value")
    private Double price;

    private String imgUrl;

    public ProductDTO(Product entity) {
        id = entity.getId();
        name = entity.getName();
        description = entity.getDescription();
        price = entity.getPrice();
        imgUrl = entity.getImgUrl();
    }
}