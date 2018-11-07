
package business.control.command;

import exceptions.InformacaoAlteradaException;
import exceptions.UsuarioNaoEncontradoException;
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
    public void execute( Persistencia p) throws InformacaoAlteradaException, UsuarioNaoEncontradoException {
        p.editarUsuario(usuario, login, senha);
    }
    
}
