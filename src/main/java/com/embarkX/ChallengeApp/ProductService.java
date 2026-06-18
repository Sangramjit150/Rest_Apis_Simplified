package com.embarkX.ChallengeApp;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();

    public ProductService(){
        Product product1=new Product(1,"Microphone",45.60);
        products.add(product1);
        Product product2=new Product(2,"Mouse",50.60);
        products.add(product2);
    }

    public  List<Product>getAllProducts(){
        return products;
    }

    public boolean addProduct(Product product) {
        if (product != null) {
            products.add(product);
            return true;
        } else {
            return false;
        }
    }

}
