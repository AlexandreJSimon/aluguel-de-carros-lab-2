package locadora.model.entity;

import locadora.model.Individual;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
@Getter
@Builder
@NoArgsConstructor
public class Cliente extends Individual {
}
