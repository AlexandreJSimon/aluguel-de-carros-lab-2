package locadora.dto;

import locadora.model.entity.Pedido;
import org.springframework.data.repository.CrudRepository;

public interface PedidoDTO extends CrudRepository<Pedido, Long> {
}
