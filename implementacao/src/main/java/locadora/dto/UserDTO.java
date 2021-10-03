package locadora.dto;

import locadora.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserDTO extends CrudRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
