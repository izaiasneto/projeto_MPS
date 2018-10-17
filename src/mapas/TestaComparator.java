package mapas;

import java.util.TreeSet;

import business.model.Data;
import business.model.Usuario;

public class TestaComparator {

	private TreeSet<Usuario> login = new TreeSet<Usuario>();
	private TreeSet<Usuario> data = new TreeSet<Usuario>();
	
	public void verificarTreeSet(){
	
		Usuario usuario = new Usuario("neymar", "ney123");
		usuario.setData_nascimento(new Data(15, 01, 1995));
		login.add(usuario);
		data.add(usuario);
		
		Usuario usuario2 = new Usuario("huck", "huck123");
		usuario2.setData_nascimento(new Data(20, 05, 1992));
		login.add(usuario2);
		data.add(usuario2);
		
		Usuario usuario3 = new Usuario("cassio", "cas123");
		usuario3.setData_nascimento(new Data(24, 02, 1980));
		login.add(usuario3);
		data.add(usuario3);
		
		Usuario usuario4 = new Usuario("glauber", "glau123");
		usuario4.setData_nascimento(new Data(23, 07, 1983));
		login.add(usuario4);
		data.add(usuario4);
		
		System.out.println("TreeSet Login ordenado");
		for(Usuario user: login){
            System.out.println("Login: " + user.getLogin() + " senha: " + user.getSenha());
        }
		
		System.out.println("TreeSet Data ordenada");
		for(Usuario user: data){
            System.out.println("Login: " + user.getLogin() + " senha: " + user.getSenha()+" data: "+ user.getData_nascimento().getDia()+"/"+user.getData_nascimento().getMes()+"/"+ user.getData_nascimento().getAno());
        }
		
	}
	
}
