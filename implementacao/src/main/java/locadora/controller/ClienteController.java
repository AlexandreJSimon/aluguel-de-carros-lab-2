package locadora.controller;

import locadora.dao.cliente.CatastroDao;
import locadora.dto.ClienteDTO;
import locadora.model.User;
import locadora.model.entity.Cliente;
import locadora.model.entity.Endereco;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ClienteController {

    @Autowired
    private ClienteDTO clienteDTO;

    @RequestMapping("/cliente/form")
    public String indexteste(){
        return "cliente/form";
    }

    @RequestMapping(value="/cliente/cadastrar", method=RequestMethod.POST)
    public String cadastrar(CatastroDao body){
        try{
            Cliente clienteBody = new Cliente();

            Endereco endereco = Endereco.builder()
                    .numero(body.getNumero())
                    .cep(body.getCep())
                    .cidade(body.getCidade())
                    .complemento(body.getComplemento())
                    .estado(body.getEstado())
                    .rua(body.getRua()).build();
            clienteBody.setEndereco(endereco);

           User user = User.builder()
                   .email(body.getEmail())
                   .password(body.getPassword()).build();
           clienteBody.setUser(user);

            clienteBody.setNome(body.getNome());
            clienteBody.setCpf(body.getCpf());
            clienteBody.setRg(body.getRg());
            clienteBody.setProfissao(body.getProfissao());

            Cliente cLienteEntity = clienteDTO.save(clienteBody);

            return "index";
        }catch (Exception e ){
            return "error";
        }
    }
}
