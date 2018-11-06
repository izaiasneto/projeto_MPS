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


public class ImprimirUsuario {
   
	RegrasDeNegocio comando = new RegrasDeNegocio();
    
    
      public void ImprimirUsuario(){
          comando.imprimir();
    }  
    
}
