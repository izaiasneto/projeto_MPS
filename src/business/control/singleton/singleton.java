/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.control.singleton;

public class singleton {
    
    public static singleton instancia;
    
    protected singleton(){
    
    }
    
    protected static singleton getInstancia(){
        if(instancia == null)
            instancia = new singleton();
        
        return instancia;
        
        
    }
 
}