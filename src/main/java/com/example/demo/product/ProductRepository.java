package com.example.demo.product;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class ProductRepository {

    private Map<Integer, Product> db= new HashMap<>();
    private int id =1;

    public String getProduct(int id){
        // return db.get(id);
        // 이름만 돌려주고 싶은 경우
        return db.get(id).getName();
    }
    public void saveProduct(Product product){
        db.put(id++, product);
    }
}
