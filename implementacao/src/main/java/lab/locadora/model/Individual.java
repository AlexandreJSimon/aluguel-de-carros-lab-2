package lab.locadora.model;

import lab.locadora.model.User;
import lab.locadora.model.entity.Endereco;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public abstract class Individual extends User{
    @Column
    private String cpf;

    @Column
    private String nome;

    @Column
    private String rg;

    @Column
    private String profissao;

    @OneToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private Endereco endereco;
}
