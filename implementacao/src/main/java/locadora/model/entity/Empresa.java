package locadora.model.entity;

import locadora.model.Agente;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "empresa")
@Getter
@Builder
@NoArgsConstructor
public class Empresa extends Agente {
}
