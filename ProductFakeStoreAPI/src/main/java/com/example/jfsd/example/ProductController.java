
package com.example.jfsd.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
public class ProductController {
     @Autowired
     private ProductService productService;
     @GetMapping
     public List<Object> getAllProducts(){
    	 return productService.getAllProducts();
     }

}
