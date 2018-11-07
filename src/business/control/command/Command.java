/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.control.command;

import business.control.Persistencia;

public interface Command {
       
    public void execute(Persistencia p);
    
}
