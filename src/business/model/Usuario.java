package business.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Usuario implements Comparable<Usuario>, Serializable {

	private String Login;
	private String Senha;
	private Data data_nascimento;
	
	public Usuario(){}
	
	public Usuario(String login, String senha) {
		super();
		Login = login;
		Senha = senha;
	}

	public String getLogin() {
		return Login;
	}

	public void setLogin(String login) {
		Login = login;
	}

	public String getSenha() {
		return Senha;
	}

	public void setSenha(String senha) {
		Senha = senha;
	}

	public Data getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(Data data_nascimento) {
		this.data_nascimento = data_nascimento;
	}
	
	 public int compareTo(Usuario u) {
	        return this.Login.compareTo(u.getLogin());
	    }
	
}
