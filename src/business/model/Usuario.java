package business.model;

import java.io.Serializable;
import java.util.ArrayList;

@SuppressWarnings("serial")
public class Usuario implements Comparable<Usuario>, Serializable {

	private String Login;
	private String Senha;
        private ArrayList<Foto> fotos;

    
	private Data data_nascimento;
        private Long distancia;
        private String id;
        private String bio;
        private int IdadeMax;
        private int IdadeMin;

   
	
	public Usuario(){}
	
	public Usuario(String login, String senha, Data data_nascimento, Long distancia, String id, String bio, int IdadeMax, int IdadeMin) {
		 
		this.Login = login;
		this.Senha = senha;
                this.data_nascimento = data_nascimento;
                this.distancia = distancia;
                this.id = id;
                this.bio = bio;
                this.IdadeMax = IdadeMax;
                this.IdadeMin = IdadeMin;
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
	
         
         public  Long distancia (){
             
             return distancia;
         }
         
         public Usuario setDistancia (Long distancia){
             this.distancia = distancia;
             return this;
             
         }
         
         public Long getDistancia (){
             return distancia;
         }
             
         public String getId (){
                 return id;
             }
         public Usuario setId(String id){
             this.id = id;
             return this;
         }
          public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public int getIdadeMax() {
        return IdadeMax;
    }

    public void setIdadeMax(int IdadeMax) {
        this.IdadeMax = IdadeMax;
    }

    public int getIdadeMin() {
        return IdadeMin;
    }

    public void setIdadeMin(int IdadeMin) {
        this.IdadeMin = IdadeMin;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
       private String genero;
       
       public ArrayList<Foto> getFotos() {
        return fotos;
    }

    public void setFotos(ArrayList<Foto> fotos) {
        this.fotos = fotos;
    }
}


