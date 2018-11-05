/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.model;

import business.control.Command;
import java.util.HashMap;
import java.util.Map;

public class invoker {
  
    
    public void invoker(String login, String senha, Command command){
    
            Usuario user = new Usuario();
            
            user.setLogin(login);
            user.setSenha(senha);
            
            command.execute(user);
    }
    
  
    
    
}
