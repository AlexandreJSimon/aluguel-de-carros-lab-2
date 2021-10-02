package locadora.model;

import locadora.model.entity.Endereco;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
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
