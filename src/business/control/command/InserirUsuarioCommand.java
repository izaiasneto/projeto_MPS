/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.control.command;

import exceptions.ValidarCadastrosDeUsuariosException;
import business.control.Persistencia;
import business.model.Usuario;


public class InserirUsuarioCommand implements Command{
    
    Usuario usuario = new Usuario();

    
    public InserirUsuarioCommand(Usuario usuario){
        this.usuario = usuario;
    
    }
       
    @Override
    public void execute(Persistencia p) throws ValidarCadastrosDeUsuariosException {
        
        p.inserirUsuario(usuario);
        
       
    }
  
    
 }
    
  
