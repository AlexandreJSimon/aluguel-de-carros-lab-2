package locadora.controller;

import locadora.dao.cliente.CatastroDao;
import locadora.dto.ClienteDTO;
import locadora.model.entity.Cliente;
import locadora.model.entity.Endereco;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AuthController {

    @Autowired
    private ClienteDTO clienteDTO;

    @RequestMapping("/login/form")
    public String indexteste(){
        return "cliente/form";
    }

}
