package ma.enset.supplierservice;
import ma.enset.supplierservice.entities.Supplier;
import ma.enset.supplierservice.repositories.SupplierRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;
@SpringBootApplication
public class SupplierServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(SupplierServiceApplication.class, args);
    }
    @Bean
    CommandLineRunner lineRunner(SupplierRepository supplierRepository){
        return args -> {
            Stream.of("Youssef_Qarssis","Master_I2ad","Faculte_Science_Meknes").forEach(n->{
                supplierRepository.save(new Supplier(null,n,n+"@"+n.toLowerCase()+".com"));
            });
        };
    }
}
