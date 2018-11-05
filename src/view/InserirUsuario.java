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


public class InserirUsuario implements Command{

    Comandos acao = new Comandos();
    
    @Override
    public void execute( Usuario usuario) {
        
        acao.inserirUsuario(usuario);
       
    }
    

    
 }
    
  
