/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.control.command;

import business.control.Persistencia;


public class ImprimirUsuario implements Command{
    
    public ImprimirUsuario(){
    
    }

    @Override
    public void execute(Persistencia p) {
        p.imprimir();
    }
    
    
    
    
}
