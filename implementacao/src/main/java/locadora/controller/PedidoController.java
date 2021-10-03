package locadora.controller;

import locadora.dto.PedidoDTO;
import locadora.model.User;
import locadora.model.entity.Pedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PedidoController {
    @Autowired
    private PedidoDTO pedidoDTO;

    @RequestMapping("/pedido/form")
    public String indexteste(User user){
        return "pedido/form";
    }

    @RequestMapping(value="/pedido/cadastrar", method= RequestMethod.POST)
    public String cadastrar(String automovel){
        try{
             pedidoDTO.save(new Pedido(automovel));

            return "cadastradoSucesso";
        }catch (Exception e ){
            return "error";
        }
    }
}
