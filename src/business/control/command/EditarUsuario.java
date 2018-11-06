/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.control.command;

import business.control.RegrasDeNegocio;
import business.model.Usuario;
import java.util.HashMap;
import java.util.Map;

public class EditarUsuario extends ComandoAbstrato{
    
    RegrasDeNegocio comando = new RegrasDeNegocio();
    
    public EditarUsuario(){
    
    }

    @Override
    public void execute() {
        comando.editarUsuario( usuario, usuario.getLogin(), usuario.getSenha());
                        
    }

    
}


