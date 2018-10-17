package view;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import exceptions.InformacaoAlteradaException;
import exceptions.PersistenciaLoadException;
import exceptions.PersistenciaSaveException;
import exceptions.RemoveUsuarioException;
import exceptions.UsuarioNaoEncontradoException;
import exceptions.ValidarCadastrosDeUsuariosException;

import business.control.Comandos;
import business.model.Usuario;

public class Conta {

	Comandos comandos = new Comandos();
	
	Map<String, Usuario> mapaNomes = new HashMap<String, Usuario>();
	Map<String, Usuario> mapNomes2 = new TreeMap<String, Usuario>();
	
	public void CadastradasUsuarioNoHashMap(Usuario usuario)throws ValidarCadastrosDeUsuariosException{
		comandos.inserirUsuario(mapaNomes, usuario);		
	}
	
	public void CadastradasUsuarioNoTreeMap(Usuario usuario) throws ValidarCadastrosDeUsuariosException{
		comandos.inserirUsuario(mapNomes2, usuario);		
	}
	
	public void ImprimirUsuarioTreeMap(){
		comandos.imprimirTreemap(mapNomes2);
	}
	
	public void ImprimirUsuario(){
		comandos.imprimir(mapaNomes);		
	}
	
	public void EditarUsuario(Usuario usuario, String login, String senha)throws PersistenciaLoadException, PersistenciaSaveException, InformacaoAlteradaException, UsuarioNaoEncontradoException{
		comandos.editarUsuario(mapaNomes, usuario, login, senha);		
	}
	
	public void RemoveUsuario(String login) throws RemoveUsuarioException, UsuarioNaoEncontradoException, PersistenciaLoadException, PersistenciaSaveException{
		comandos.removeUsuario(mapaNomes, login);		
	}
}
