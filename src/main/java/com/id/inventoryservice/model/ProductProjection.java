package com.id.inventoryservice.model;

import org.springframework.data.rest.core.config.Projection;

@Projection( name="prod",types = Product.class)
public interface ProductProjection {
     Long getId();
     String getName();
     Double getPrice();
}
