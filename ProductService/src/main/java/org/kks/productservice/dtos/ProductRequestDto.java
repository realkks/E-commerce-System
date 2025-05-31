package org.kks.productservice.dtos;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ProductRequestDto {
    private String name;
    private String description;
    private double price;
    private String category;
    private String imageUrl;

//    public ProductRequestDto toProduct(){
//
//    }
}
