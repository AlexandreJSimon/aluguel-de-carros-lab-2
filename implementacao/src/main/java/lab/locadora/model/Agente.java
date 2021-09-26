package lab.locadora.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@Getter
@Builder
@MappedSuperclass
@AllArgsConstructor
@NoArgsConstructor
public abstract class Agente extends User {

    @Column
    private String cnpj;

    @Column
    private String nome;
}
