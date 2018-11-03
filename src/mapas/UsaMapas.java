package mapas;


import exceptions.InformacaoAlteradaException;
import exceptions.PersistenciaLoadException;
import exceptions.PersistenciaSaveException;
import exceptions.RemoveUsuarioException;
import exceptions.UsuarioNaoEncontradoException;
import exceptions.ValidarCadastrosDeUsuariosException;
import business.model.Usuario;
import view.EditarUsuario;
import view.ImprimirUsuario;
import view.InserirUsuario;

public class UsaMapas {

	public static void main(String[] args) {
		
		Usuario usuario = new Usuario();
		Usuario usuario2 = new Usuario();
		Usuario usuario3 = new Usuario();
		Usuario usuario4 = new Usuario();
		
		ImprimirUsuario imprimir = new ImprimirUsuario();
				
		try {
			usuario.acao("neymar", "ney123", new InserirUsuario());
                        usuario2.acao("huck", "huck123", new InserirUsuario());
                        usuario3.acao("cassio", "cas123", new InserirUsuario());
                        usuario4.acao("glauber", "glau123", new InserirUsuario());
                    
                        usuario.acao("neymar", "neynew", new EditarUsuario());
                        usuario4.acao("glauber", "newgla", new EditarUsuario());
			
                        imprimir.ImprimirUsuario();
			
	
		} catch (PersistenciaLoadException PL) {
			System.err.println(PL.getMessage());
		}catch (InformacaoAlteradaException I) {
			System.err.println(I.getMessage());
		}catch (PersistenciaSaveException PS) {
			System.err.println(PS.getMessage());
		}catch (UsuarioNaoEncontradoException UE) {
			System.err.println(UE.getMessage());
		}catch (RemoveUsuarioException RU) {
			System.err.println(RU.getMessage());
		}catch (ValidarCadastrosDeUsuariosException VCU) {
			System.err.println(VCU.getMessage());
		}
        
		
		
	}
        
        
       
}
