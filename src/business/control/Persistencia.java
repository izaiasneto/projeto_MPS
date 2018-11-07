package business.control;

import java.util.HashMap;
import java.util.Map;

import exceptions.InformacaoAlteradaException;
import exceptions.PersistenciaLoadException;
import exceptions.PersistenciaSaveException;
import exceptions.RemoveUsuarioException;
import exceptions.UsuarioNaoEncontradoException;
import exceptions.ValidarCadastrosDeUsuariosException;
import business.model.Usuario;

public class Persistencia {
	
	
	public HashMap<String, Usuario> usuarios;
        Map<String, Usuario> mapaNomes = new HashMap<>();
	
	//imprimir mapas
	public void imprimir(){
		
		for(String chave: mapaNomes.keySet()){
			String valor1, valor2;
			valor1 = mapaNomes.get(chave).getLogin();
			valor2 = mapaNomes.get(chave).getSenha();
			System.out.println(" login: " + valor1 + "\n senha: " + valor2 + "\n-----------------");
		}
		System.out.println("\n________________________________________________");
	}
	
	//inserir usuario
	public void inserirUsuario(Usuario usuario) throws ValidarCadastrosDeUsuariosException{
		if(usuario.getLogin().length() <= 15 && !usuario.getLogin().equals("") && !usuario.getLogin().matches(".*\\d+.*") && 
		   usuario.getSenha().length() <= 16 && usuario.getSenha().length() >= 6){
		
			//usuarios = Banco.Load();
			mapaNomes.put(usuario.getLogin(), usuario);
			//Banco.Save(usuarios);
		
		}else{
			String login = "login: " + usuario.getLogin() + " ou senha: " + usuario.getSenha() + " invalido.";
	        throw new ValidarCadastrosDeUsuariosException(login);
		}
		
	}
	
	//editar mapas
	public void editarUsuario(Usuario usuario, String login, String senha) throws InformacaoAlteradaException, UsuarioNaoEncontradoException{
		int encontrou = 0;
		
		for(String chave: mapaNomes.keySet()){
			
			if(chave.equals(login)){
				if(login.length() <= 15 || !login.equals("") || login.matches(".*\\d+.*") || 
				   senha.length() <= 16 || senha.length() >= 6){
					
					usuario.setLogin(login);
					usuario.setSenha(senha);
					mapaNomes.put(chave, usuario);
					encontrou = 1;
					
					/*usuarios = Banco.Load();

					if(usuarios.get(usuario.getLogin()) != null ){
						usuarios.put(usuario.getLogin(), usuario);
					}else{
						throw new UsuarioNaoEncontradoException();//System.out.println("Usuario nao encontrado");
					}
					Banco.Save(usuarios);
					*/
				}
				
			}
		}
		String mensagem;
		
		if(encontrou == 1){
			//System.out.println("\nInformacao de " +login+" foi alterada.");
			mensagem = "\n________________________________________________\n\nInformacao de " +usuario.getLogin()+ " foi alterada.\n________________________________________________\n";
            throw new InformacaoAlteradaException(mensagem);
		}else{
			//System.out.println("\nUsuario nao existe.");
			mensagem = "\n________________________________________________\n\n Usuario " + login + " nao encontrado.\n________________________________________________\n" ;
			throw new UsuarioNaoEncontradoException(mensagem);
		}
		
	}
	
	public void removeUsuario(String login) throws UsuarioNaoEncontradoException, RemoveUsuarioException{
		String chaveEncontrada = null, mensagem;
		int encontrou = 0;
		
		for(String chave: mapaNomes.keySet()){
			if(chave.equals(login)){
				encontrou = 1;
				chaveEncontrada = chave;
			}
		}
		if(encontrou == 1){
			mapaNomes.remove(chaveEncontrada);
			//usuarios = Banco.Load();
			//usuarios.remove(chaveEncontrada);
			//Banco.Save(usuarios);
			mensagem = "\n________________________________________________\nUsuario " +login+ " removido.\n________________________________________________\n";
			throw new RemoveUsuarioException(mensagem);
		}else{
			mensagem = "\n________________________________________________\n\n Usuario " + login + " nao encontrado.\n________________________________________________\n";
			throw new UsuarioNaoEncontradoException(mensagem);
		}
	
	}




}

