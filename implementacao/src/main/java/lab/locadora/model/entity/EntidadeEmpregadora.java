package lab.locadora.model.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "Entidade_empregadora")
@Getter
@NoArgsConstructor
public class EntidadeEmpregadora {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

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

    //TODO entendi o que seria rendimentoAuferido
    @Column
    private String rendimentoAuferido;

}
