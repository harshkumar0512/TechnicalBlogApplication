package technicalblog.service;

import org.springframework.stereotype.Controller;
import technicalblog.model.User;

@Controller
public class UserService {

    public boolean login(User user){
        if(user.getUsername().equals("validuser")){
            return true;
        }else{
            return false;
        }
    }

}
