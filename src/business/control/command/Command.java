/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.control.command;

import business.model.Usuario;
import java.util.Map;

public interface Command {
    
        void execute(Usuario usuario);
        
           
}
