package locadora.model;

import locadora.model.entity.Endereco;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@MappedSuperclass
public abstract class Individual{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column
    private String cpf;

    @Column
    private String nome;

    @Column
    private String rg;

    @Column
    private String profissao;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "endereco_id", referencedColumnName = "id")
    private Endereco endereco;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    public Individual() {
        super();
    }
}
