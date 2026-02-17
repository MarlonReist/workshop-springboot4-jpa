package Demo.Spring.Boot.repositories;

import Demo.Spring.Boot.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
