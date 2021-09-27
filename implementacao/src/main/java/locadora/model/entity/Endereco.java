package locadora.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "endereco")
public class Endereco {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    @Column
    private String cep;
    @Column
    private String estado;
    @Column
    private String cidade;
    @Column
    private String rua;
    @Column
    private Integer numero;
    @Column
    private String complemento;
}
