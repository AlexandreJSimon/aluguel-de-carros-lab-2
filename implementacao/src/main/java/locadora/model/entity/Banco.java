package locadora.model.entity;

import locadora.model.Agente;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "banco")
@Getter
@Builder
@NoArgsConstructor
public class Banco extends Agente {
}
