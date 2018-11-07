
package business.control.command;

import business.control.Persistencia;
import business.model.Usuario;

public class RemoverUsuarioCommand implements Command{
            
            Usuario usuario = new Usuario();
    
            public RemoverUsuarioCommand(Usuario usuario){

                   this.usuario = usuario;     

            }

            @Override
            public void execute(Persistencia p) {
                p.removeUsuario(usuario.getLogin());

            }
    
}
