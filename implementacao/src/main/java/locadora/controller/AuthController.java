package locadora.controller;

import locadora.dao.user.authDao;
import locadora.dto.UserDTO;
import locadora.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class AuthController {

    @Autowired
    private UserDTO userDTO;

    @RequestMapping("/login/form")
    public String indexteste(){
        return "login";
    }

    @RequestMapping(value="/login", method=RequestMethod.POST)
    public ModelAndView login(authDao body){
        try{
            ModelAndView mv = new ModelAndView("menu");

            Optional<User> userEntity = userDTO.findByEmail(body.getEmail());

            if(userEntity.isPresent() && userEntity.get().getPassword().equals(body.getPassword())){
                return mv.addObject("id", userEntity.get().getId());
            }
            return new ModelAndView("login");
        }catch (Exception e ){
            return new ModelAndView("error");
        }
    }

    public Boolean authUser(authDao authDao){
        try{
            Optional<User> userEntity = userDTO.findByEmail(authDao.getEmail());

            if(userEntity.isPresent() && userEntity.get().getPassword().equals(authDao.getPassword())){
                return true;
            }
            return false;
        }catch (Exception e){
            new Exception();
        }
        return false;
    }

}
