package locadora.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ClienteController {

    @RequestMapping("/cliente/form")
    public String indexteste(){
        return "cliente/form";
    }
}
