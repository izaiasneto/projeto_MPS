package mapas;


import business.control.Persistencia;
import business.control.command.EditarUsuarioCommand;
import business.control.command.ImprimirUsuario;
import exceptions.InformacaoAlteradaException;
import exceptions.PersistenciaLoadException;
import exceptions.PersistenciaSaveException;
import exceptions.RemoveUsuarioException;
import exceptions.UsuarioNaoEncontradoException;
import exceptions.ValidarCadastrosDeUsuariosException;
import business.control.command.InserirUsuarioCommand;
import business.control.command.RemoverUsuarioCommand;
import business.control.controle;
import business.control.memento.TextoUsuario;
import business.model.Usuario;


public class UsaMapas {

	public static void main(String[] args) {
                
		Usuario usuario = new Usuario("neymar", "ney123");
                Usuario usuario2 = new Usuario("huck", "huck123");
                Usuario usuario3 = new Usuario("cassio", "cas123");
                
                controle control = new controle();
                Persistencia persist = new Persistencia();
                
                control.setcommand(persist, new InserirUsuarioCommand(usuario));
                control.setcommand(persist, new InserirUsuarioCommand(usuario2));
                control.setcommand(persist, new InserirUsuarioCommand(usuario3));
                
                control.setcommand(persist, new ImprimirUsuario());
                
                control.setcommand(persist, new EditarUsuarioCommand(usuario,"neymar","ney1234"));
                
                control.setcommand(persist, new ImprimirUsuario());
                
                control.setcommand(persist, new RemoverUsuarioCommand(usuario3));
                
                
                control.setcommand(persist, new ImprimirUsuario());
               
                
                        
                        
                     /*   System.out.println("Memento");
            			SalvaEstado.escreverTexto(usuario);
            			SalvaEstado.escreverTexto(usuario2);
            			SalvaEstado.escreverTexto(usuario3);
            			
            			SalvaEstado.mostrarTexto();
            			
            			SalvaEstado.desfazerEscrita();
            			
            			SalvaEstado.mostrarTexto();   */

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
