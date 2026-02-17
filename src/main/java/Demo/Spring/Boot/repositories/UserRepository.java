package Demo.Spring.Boot.repositories;

import Demo.Spring.Boot.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
