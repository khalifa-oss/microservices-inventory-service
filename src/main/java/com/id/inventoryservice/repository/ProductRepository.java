package com.id.inventoryservice.repository;

import com.id.inventoryservice.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.Optional;

@RepositoryRestResource(path = "product")
public interface ProductRepository extends JpaRepository<Product,Long> {
    @RestResource(path = "/byId")
    Product findProductById (@Param("id" ) Long id);
}
