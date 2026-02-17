package Demo.Spring.Boot.repositories;

import Demo.Spring.Boot.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
