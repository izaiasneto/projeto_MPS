package business.control;

import exceptions.InformacaoAlteradaException;
import exceptions.RemoveUsuarioException;
import exceptions.UsuarioNaoEncontradoException;
import exceptions.ValidarCadastrosDeUsuariosException;
import business.control.command.Command;

public class controle{
  
    public void controle (){           
            
    }
    
    public void setcommand(Persistencia p, Command command) throws ValidarCadastrosDeUsuariosException, InformacaoAlteradaException, UsuarioNaoEncontradoException, RemoveUsuarioException{
        command.execute(p);
    }
        
}
