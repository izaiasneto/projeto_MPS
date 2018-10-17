package exceptions;

@SuppressWarnings("serial")
public class UsuarioNaoEncontradoException extends Exception{

	public UsuarioNaoEncontradoException(){
		super("Usuario n�o encontrado.");
	}
	
	public UsuarioNaoEncontradoException(String mensagem){
		super(mensagem);
	}
}
