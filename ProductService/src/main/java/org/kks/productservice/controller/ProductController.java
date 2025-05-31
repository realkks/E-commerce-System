package org.kks.productservice.controller;


import org.kks.productservice.dtos.ProductRequestDto;
import org.kks.productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/products")
@RestController()
public class ProductController {

    ProductService productService;
    // Constructor injection for ProductService
//    public ProductController(@Qualifier("productServiceDBImpl") ProductService productService) {
//        this.productService = productService;
//    }


    @PostMapping("")
    public String createProduct(@RequestBody ProductRequestDto productRequestDto){   //Getting requestbody in form of ProductRequestDto java object
        return "The name is: "+ productRequestDto.getPrice();  //Returning the name of the product from the request

    }

    @GetMapping("")
    public void getAllProducts(){

    }
    @GetMapping("/{id}")
    public void getProductById(@PathVariable("id") Long id){

    }

    @DeleteMapping("")
    public void deleteProduct(){

    }
    @DeleteMapping("/{id}")
    public void deleteProductById(@PathVariable("id") Long id){
        // Logic to delete a product by ID
    }

    @RequestMapping(name = "kks",value="")
    public String customMethod(){
        return "magic";
    }


}
