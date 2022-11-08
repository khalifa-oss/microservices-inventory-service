package com.id.inventoryservice;

import com.id.inventoryservice.model.Product;
import com.id.inventoryservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import java.util.List;

@SpringBootApplication
public class InventoryServiceApplication implements CommandLineRunner {
        public static void main(String[] args) {
        SpringApplication.run( InventoryServiceApplication.class, args );
    }

    @Override
    public void run(String... args) throws Exception {
    }
    @Bean
    CommandLineRunner start(RepositoryRestConfiguration repositoryRestConfiguration,ProductRepository productRepository){
        return args -> {
            repositoryRestConfiguration.exposeIdsFor( Product.class );
            List<Product> listProduct = List
                    .of( new Product( null, "Book", 1800.0 ), new Product( null, "keyboard", 120.0 ),
                            new Product( null, "mouse", 100.0 ));
//        Iterable<Customer> itr= (Iterable<Customer>) list.iterator();
            productRepository.saveAll( listProduct );


        };
    }
}
