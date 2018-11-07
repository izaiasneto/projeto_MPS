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
                
                
                controle control = new controle();
                Persistencia persist = new Persistencia();
                                
                try {
                    control.setcommand(persist, new InserirUsuarioCommand(usuario));
                    persist.SalvarDadosNoMemento(usuario);
                    control.setcommand(persist, new InserirUsuarioCommand(usuario2));
                    persist.SalvarDadosNoMemento(usuario2);
                    control.setcommand(persist, new InserirUsuarioCommand(usuario3));
                    persist.SalvarDadosNoMemento(usuario3);
                    control.setcommand(persist, new InserirUsuarioCommand(usuario4));
                    persist.SalvarDadosNoMemento(usuario4);
                    
                    control.setcommand(persist, new ImprimirUsuario());
                                     
                    
				}catch (ValidarCadastrosDeUsuariosException VCU) {
					System.out.println(VCU.getMessage());
				}catch (InformacaoAlteradaException I) {
					System.out.println(I.getMessage());
				}catch (UsuarioNaoEncontradoException UE) {
					System.out.println(UE.getMessage());
				}catch (RemoveUsuarioException RU) {
					System.out.println(RU.getMessage());
				}
                
                try {
                	
                    control.setcommand(persist, new EditarUsuarioCommand(usuario,"neymar","ney1234"));
                    
				}catch (ValidarCadastrosDeUsuariosException VCU) {
					System.out.println(VCU.getMessage());
				}catch (InformacaoAlteradaException I) {
					System.out.println(I.getMessage());
				}catch (UsuarioNaoEncontradoException UE) {
					System.out.println(UE.getMessage());
				}catch (RemoveUsuarioException RU) {
					System.out.println(RU.getMessage());
				}
                
                try {
                	
                    control.setcommand(persist, new ImprimirUsuario());
                    
                    control.setcommand(persist, new RemoverUsuarioCommand(usuario3));
                       
				}catch (ValidarCadastrosDeUsuariosException VCU) {
					System.out.println(VCU.getMessage());
				}catch (InformacaoAlteradaException I) {
					System.out.println(I.getMessage());
				}catch (UsuarioNaoEncontradoException UE) {
					System.out.println(UE.getMessage());
				}catch (RemoveUsuarioException RU) {
					System.out.println(RU.getMessage());
				}

                try {                
                    
                    control.setcommand(persist, new ImprimirUsuario());
                   
				}catch (ValidarCadastrosDeUsuariosException VCU) {
					System.out.println(VCU.getMessage());
				}catch (InformacaoAlteradaException I) {
					System.out.println(I.getMessage());
				}catch (UsuarioNaoEncontradoException UE) {
					System.out.println(UE.getMessage());
				}catch (RemoveUsuarioException RU) {
					System.out.println(RU.getMessage());
				}
                
                System.out.println("\n\nLendo usuarios no memento.");
                persist.DadosSalvos();       
		
		
	}


       
       
}
