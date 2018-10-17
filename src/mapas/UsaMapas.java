package mapas;

import exceptions.InformacaoAlteradaException;
import exceptions.PersistenciaLoadException;
import exceptions.PersistenciaSaveException;
import exceptions.RemoveUsuarioException;
import exceptions.UsuarioNaoEncontradoException;
import exceptions.ValidarCadastrosDeUsuariosException;
import view.Conta;
import business.model.Usuario;

public class UsaMapas {

	public static void main(String[] args) {
		
		Usuario usuario = new Usuario("neymar", "ney123");
		Usuario usuario2 = new Usuario("huck", "huck123");
		Usuario usuario3 = new Usuario("cassio", "cas123");
		Usuario usuario4 = new Usuario("glauber", "glau123");
		
		Conta contaUsuario = new Conta();
				
		try {
			/*  essa parte ta funcionado
			contaUsuario.CadastradasUsuarioNoTreeMap(usuario);
			contaUsuario.CadastradasUsuarioNoTreeMap(usuario2);
			contaUsuario.CadastradasUsuarioNoTreeMap(usuario3);
			contaUsuario.CadastradasUsuarioNoTreeMap(usuario4);
			
			contaUsuario.ImprimirUsuarioTreeMap();
			*/
			contaUsuario.CadastradasUsuarioNoHashMap(usuario);
			contaUsuario.CadastradasUsuarioNoHashMap(usuario2);
			contaUsuario.CadastradasUsuarioNoHashMap(usuario3);
			contaUsuario.CadastradasUsuarioNoHashMap(usuario4);
			
			contaUsuario.ImprimirUsuario();
			
			
			contaUsuario.EditarUsuario(usuario4, "glauber", "glauber1234");
			
			contaUsuario.ImprimirUsuario();
			
			contaUsuario.RemoveUsuario("gl");
			contaUsuario.RemoveUsuario("glauber");
			
			contaUsuario.ImprimirUsuario();
			/*
			TestaComparator TC = new TestaComparator();
			TC.verificarTreeSet();
			*/
			
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
