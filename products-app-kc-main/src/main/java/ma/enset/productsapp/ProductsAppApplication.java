package ma.enset.productsapp;

import ma.enset.productsapp.entities.Product;
import ma.enset.productsapp.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProductsAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductsAppApplication.class, args);
    }
    @Bean
    CommandLineRunner start(ProductRepository productRepository){
        return args -> {
            productRepository.save(new Product(null,"Dell i7 10Th",15000,20));
            productRepository.save(new Product(null,"Asus Gamer GTXS",20000,15));
            productRepository.save(new Product(null,"MSI Gamer RS Nitro1500s",25000,10));
        };
    }

}
