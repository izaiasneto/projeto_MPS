/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import business.control.Comandos;
import business.control.Command;
import business.model.Usuario;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author izaia
 */
public class RemoveUsuario implements Command{
    
   //Map<String, Usuario> mapaNomes = new HashMap<>();
    
    Comandos comando = new Comandos();
    
    public RemoveUsuario() {
    }

    @Override
    public void execute(Usuario usuario) {
            comando.removeUsuario(usuario.getLogin());
    }
 
    
}
