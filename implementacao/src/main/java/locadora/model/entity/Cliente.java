package locadora.model.entity;

import locadora.model.Individual;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
@Getter
@Setter
public class Cliente extends Individual {
    public Cliente() {
        super();
    }
}
