package locadora.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ClienteController {

    @RequestMapping("/cliente/form")
    public String indexteste(){
        return "cliente/form";
    }

    @RequestMapping("/cliente/cadastrar")
    public String a(){
        String teste = "a";
        return "cliente/form";
    }

    @RequestMapping(value="/cliente/cadastrar", method=RequestMethod.POST)
    public String cadastrar(){
        String teste = "a";
        return "cliente/form";
    }
}
