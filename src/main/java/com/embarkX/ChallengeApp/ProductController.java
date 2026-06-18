package com.embarkX.ChallengeApp;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService){
        this.productService=productService;
    }

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getAllChallenges(){

        return new ResponseEntity<>(productService.getAllProducts(), HttpStatus.OK);
    }

    @PostMapping("/products")

    public ResponseEntity <String> addProduct(@RequestBody Product product){
        boolean isProductAdded= productService.addProduct(product);
        if(isProductAdded){
            return new ResponseEntity<>("Product was added successfully", HttpStatus.OK);
        }
        return  new ResponseEntity<>("Product was not added successfully",HttpStatus.NOT_FOUND);
    }
}
