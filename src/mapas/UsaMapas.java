package mapas;


import exceptions.InformacaoAlteradaException;
import exceptions.PersistenciaLoadException;
import exceptions.PersistenciaSaveException;
import exceptions.RemoveUsuarioException;
import exceptions.UsuarioNaoEncontradoException;
import exceptions.ValidarCadastrosDeUsuariosException;
import business.model.Usuario;
import business.model.invoker;
import java.util.HashMap;
import java.util.Map;
import view.EditarUsuario;
import view.ImprimirUsuario;
import view.InserirUsuario;
import view.RemoveUsuario;

public class UsaMapas {

	public static void main(String[] args) {
            
			
		ImprimirUsuario imprimir = new ImprimirUsuario();
                
                invoker invo = new invoker();
				
		//try {
                        
                        invo.invoker("neymar", "ney123", new InserirUsuario());
                        invo.invoker("glauber", "ney123", new InserirUsuario());
			
                        imprimir.ImprimirUsuario();
			
	
		/*} catch (PersistenciaLoadException PL) {
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
		}*/
        
		
		
	}

    private static void invoker(String neymar, String ney123, InserirUsuario inserirUsuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
        
       
}
