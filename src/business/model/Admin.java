/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.model;

/**
 *
 * @author Larissa
 */
public class Admin {
    
    protected String Login;
    protected String senha;
    
    public Admin (){
        
    }
    public Admin(String Login, String senha){
        this.Login = Login;
        this.senha = senha;
        }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String Login) {
        this.Login = Login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    
    public void GerenciarCombinacoes(){
        
    }
    
    public void GerarRelatorio( ){
        
    }
}
