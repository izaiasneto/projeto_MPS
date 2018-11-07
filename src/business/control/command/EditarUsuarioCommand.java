
package business.control.command;

import business.control.Persistencia;
import business.model.Usuario;


public class EditarUsuarioCommand implements Command{
    Usuario usuario = new Usuario();
    String login, senha;
    
    public EditarUsuarioCommand(Usuario usuario, String login, String senha){
        this.usuario = usuario;
        this.login = login;
        this.senha = senha;
        
    
    }
    
    @Override
    public void execute( Persistencia p) {
        p.editarUsuario(usuario, login, senha);
    }
    
}
