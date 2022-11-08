package com.id.inventoryservice.productController;

import com.id.inventoryservice.model.Product;
import com.id.inventoryservice.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@AllArgsConstructor
public class ProductController {
    private ProductRepository productRepository;
    @GetMapping(path = "allProduct")
    public Collection<Product> getAll(){
        return productRepository.findAll();
    }
    @GetMapping(path = "product/{id}")
    public Product getAll(@PathVariable(name="id") Long id){
        return productRepository.findById( id ).get();
    }
}
