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
                Usuario usuario4 = new Usuario("glauber", "gfa123");
                
                TextoUsuario guardaRegistro = new TextoUsuario();
                controle control = new controle();
                Persistencia persist = new Persistencia();
                                
                try {
                    control.setcommand(persist, new InserirUsuarioCommand(usuario));
                    guardaRegistro.salvarLoginSenha(usuario);
                    control.setcommand(persist, new InserirUsuarioCommand(usuario2));
                    guardaRegistro.salvarLoginSenha(usuario2);
                    control.setcommand(persist, new InserirUsuarioCommand(usuario3));
                    guardaRegistro.salvarLoginSenha(usuario3);
                    control.setcommand(persist, new InserirUsuarioCommand(usuario4));
                    guardaRegistro.salvarLoginSenha(usuario4);
                    
                    control.setcommand(persist, new ImprimirUsuario());
                                     
                    
				}catch (ValidarCadastrosDeUsuariosException VCU) {
					System.err.println(VCU.getMessage());
				}catch (InformacaoAlteradaException I) {
					System.err.println(I.getMessage());
				}catch (UsuarioNaoEncontradoException UE) {
					System.err.println(UE.getMessage());
				}catch (RemoveUsuarioException RU) {
					System.err.println(RU.getMessage());
				}
                
                try {
                	
                    control.setcommand(persist, new EditarUsuarioCommand(usuario,"neymair","ney1234"));
                    
				}catch (ValidarCadastrosDeUsuariosException VCU) {
					System.err.println(VCU.getMessage());
				}catch (InformacaoAlteradaException I) {
					System.err.println(I.getMessage());
				}catch (UsuarioNaoEncontradoException UE) {
					System.err.println(UE.getMessage());
				}catch (RemoveUsuarioException RU) {
					System.err.println(RU.getMessage());
				}
                
                try {
                	
                    control.setcommand(persist, new ImprimirUsuario());
                    
                    control.setcommand(persist, new RemoverUsuarioCommand(usuario3));
                       
				}catch (ValidarCadastrosDeUsuariosException VCU) {
					System.err.println(VCU.getMessage());
				}catch (InformacaoAlteradaException I) {
					System.err.println(I.getMessage());
				}catch (UsuarioNaoEncontradoException UE) {
					System.err.println(UE.getMessage());
				}catch (RemoveUsuarioException RU) {
					System.err.println(RU.getMessage());
				}

                try {                
                    
                    control.setcommand(persist, new ImprimirUsuario());
                   
				}catch (ValidarCadastrosDeUsuariosException VCU) {
					System.err.println(VCU.getMessage());
				}catch (InformacaoAlteradaException I) {
					System.err.println(I.getMessage());
				}catch (UsuarioNaoEncontradoException UE) {
					System.err.println(UE.getMessage());
				}catch (RemoveUsuarioException RU) {
					System.err.println(RU.getMessage());
				}
                
                System.out.println("Lendo usuarios no memento.");
                guardaRegistro.desfazer();
                guardaRegistro.desfazer();
                guardaRegistro.desfazer();
                guardaRegistro.desfazer();
                       
		
		
	}


       
       
}
