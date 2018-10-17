package exceptions;

@SuppressWarnings("serial")
public class ValidarCadastrosDeUsuariosException extends Exception{

	public ValidarCadastrosDeUsuariosException(){
		super("Login ou senha invalido.");
	}
	
	public ValidarCadastrosDeUsuariosException(String mensagem){
		super(mensagem);
	}
}
