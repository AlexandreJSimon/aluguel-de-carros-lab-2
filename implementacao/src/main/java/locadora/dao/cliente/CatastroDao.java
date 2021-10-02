package locadora.dao.cliente;

import locadora.model.entity.Endereco;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CatastroDao {
    private String email;
    private String password;
    private String nome;
    private String cpf;
    private String rg;
    private String profissao;
    private String cep;
    private String estado;
    private String cidade;
    private String rua;
    private String numero;
    private String complemento;
}
