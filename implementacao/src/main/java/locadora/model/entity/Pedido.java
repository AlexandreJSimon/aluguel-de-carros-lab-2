package locadora.model.entity;

import locadora.model.Agente;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "pedido")
@Getter
@Setter
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column()
    private String automovel;

    public Pedido() {
    }
    public Pedido(String automovel) {
        this.automovel = automovel;
    }
}

