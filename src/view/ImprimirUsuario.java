/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import business.control.Comandos;
import business.model.Usuario;
import java.util.HashMap;
import java.util.Map;


public class ImprimirUsuario {
    
    Map<String, Usuario> mapaNomes = new HashMap<>();
    
    Comandos comando = new Comandos();
    
    public void ImprimirUsuario(){
            comando.imprimir(mapaNomes);   
    }   
}
