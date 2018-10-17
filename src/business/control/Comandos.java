package business.control;

import infra.Banco;

import java.util.HashMap;
import java.util.Map;

import exceptions.InformacaoAlteradaException;
import exceptions.PersistenciaLoadException;
import exceptions.PersistenciaSaveException;
import exceptions.RemoveUsuarioException;
import exceptions.UsuarioNaoEncontradoException;
import exceptions.ValidarCadastrosDeUsuariosException;
import business.model.Usuario;

public class Comandos {
	
	
	public HashMap<String, Usuario> usuarios;
	
	//imprimir mapas
	public void imprimir(Map<String, Usuario> mapasNomes){
		
		//usuarios = Banco.Load();
		/*
		for (Map.Entry<String, Usuario> entry : usuarios.entrySet()) {
            Usuario usuario = entry.getValue();
            System.out.println("Login: " + usuario.getLogin() + " senha: " + usuario.getSenha());
        }*/
		
		for(String chave: mapasNomes.keySet()){
			String valor1, valor2;
			valor1 = mapasNomes.get(chave).getLogin();
			valor2 = mapasNomes.get(chave).getSenha();
			System.out.println(" login: " + valor1 + " senha: " + valor2);
		}
		System.out.println("------------------------------------------");
	}
	
	//imprimir treemaps
	public void imprimirTreemap(Map<String, Usuario> mapasNomes){
		
		for (Usuario user : mapasNomes.values()) {
            System.out.println("Login: " + user.getLogin() + " Senha: " + user.getSenha());
		}
		System.out.println("--------------------------------------------------");
	}
	
	
	//inserir usuario
	public void inserirUsuario(Map<String, Usuario> mapasNomes, Usuario usuario){
		if(usuario.getLogin().length() <= 15 || !usuario.getLogin().equals("") || usuario.getLogin().matches(".*\\d+.*") || 
		   usuario.getSenha().length() <= 16 || usuario.getSenha().length() >= 6){
		
			//usuarios = Banco.Load();
			mapasNomes.put(usuario.getLogin(), usuario);
			//Banco.Save(usuarios);
		
		}else{
	        //throw new ValidarCadastrosDeUsuariosException();
		}
		
	}
	
	//editar mapas
	public void editarUsuario(Map<String, Usuario> mapasNomes,Usuario usuario, String login, String senha){
		int encontrou = 0;
		
		for(String chave: mapasNomes.keySet()){
			
			if(chave.equals(login)){
				if(login.length() <= 15 || !login.equals("") || login.matches(".*\\d+.*") || 
				   senha.length() <= 16 || senha.length() >= 6){
					
					usuario.setLogin(login);
					usuario.setSenha(senha);
					mapasNomes.put(chave, usuario);
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
		if(encontrou == 1){
			System.out.println("Informacao alterada.");
			//throw new InformacaoAlteradaException();
		}else{
			System.out.println("Usuario nao existir.");
			//throw new UsuarioNaoEncontradoException();
		}
		
	}
	
	public void removeUsuario(Map<String, Usuario> mapasNomes, String login){
		String chaveEncontrada = null;
		int encontrou = 0;
		
		for(String chave: mapasNomes.keySet()){
			if(chave.equals(login)){
				encontrou = 1;
				chaveEncontrada = chave;
			}
		}
		if(encontrou == 1){
			System.out.println("Usuario removido.");
			mapasNomes.remove(chaveEncontrada);
			//usuarios = Banco.Load();
			//usuarios.remove(chaveEncontrada);
			//Banco.Save(usuarios);
			//throw new RemoveUsuarioException();
		}else{
			System.out.println("Usuario não encontrado.");
			//throw new UsuarioNaoEncontradoException();
		}
	
	}
}

