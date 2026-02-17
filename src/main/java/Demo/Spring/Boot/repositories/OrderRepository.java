package Demo.Spring.Boot.repositories;

import Demo.Spring.Boot.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
