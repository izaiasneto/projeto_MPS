/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infra;

/**
 *
 * @author Larissa
 */
public class AutenticacaoExterna {
    
    protected String email;
    protected String senha;
    
    public AutenticacaoExterna(){
    }
    
    public AutenticacaoExterna(String email, String senha){
        this.email = email;
        this.senha = senha;
    }
    
    
    public void EfetuarLogin (String email, String senha){
        
    }
    
}
