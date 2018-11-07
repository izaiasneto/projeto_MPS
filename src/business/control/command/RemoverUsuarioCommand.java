
package business.control.command;

import exceptions.RemoveUsuarioException;
import exceptions.UsuarioNaoEncontradoException;
import business.control.Persistencia;
import business.model.Usuario;

public class RemoverUsuarioCommand implements Command{
            
            Usuario usuario = new Usuario();
    
            public RemoverUsuarioCommand(Usuario usuario){

                   this.usuario = usuario;     

            }

            @Override
            public void execute(Persistencia p) throws UsuarioNaoEncontradoException, RemoveUsuarioException {
                p.removeUsuario(usuario.getLogin());

            }
    
}
