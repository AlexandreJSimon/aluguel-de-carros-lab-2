package locadora.dto;

import locadora.model.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteDTO extends CrudRepository<Cliente, Long> {
}
