package mapas;


import exceptions.InformacaoAlteradaException;
import exceptions.PersistenciaLoadException;
import exceptions.PersistenciaSaveException;
import exceptions.RemoveUsuarioException;
import exceptions.UsuarioNaoEncontradoException;
import exceptions.ValidarCadastrosDeUsuariosException;
import business.control.invoker;
import business.control.command.EditarUsuario;
import business.control.command.ImprimirUsuario;
import business.control.command.InserirUsuario;
import business.control.command.RemoveUsuario;
import business.control.memento.TextoUsuario;
import business.model.Usuario;
import java.util.HashMap;
import java.util.Map;

public class UsaMapas {

	public static void main(String[] args) {
            
			
		ImprimirUsuario imprimir = new ImprimirUsuario();
                
                invoker invo = new invoker();
        		TextoUsuario SalvaEstado = new TextoUsuario();
		//try {
                        
                        invo.invoker("neymar", "ney123", new InserirUsuario());
                        invo.invoker("neymar", "ney123", new InserirUsuario());
			
                        imprimir.ImprimirUsuario();
			
                        Usuario usuario = new Usuario("neymar", "ney123");
                		Usuario usuario2 = new Usuario("huck", "huck123");
                		Usuario usuario3 = new Usuario("cassio", "cas123");
                        
                        System.out.println("Memento");
            			SalvaEstado.escreverTexto(usuario);
            			SalvaEstado.escreverTexto(usuario2);
            			SalvaEstado.escreverTexto(usuario3);
            			
            			SalvaEstado.mostrarTexto();
            			
            			SalvaEstado.desfazerEscrita();
            			
            			SalvaEstado.mostrarTexto();   

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

     
        
       
}
