package exceptions;

@SuppressWarnings("serial")
public class RemoveUsuarioException extends Exception {

	public RemoveUsuarioException(){
		super("Usuario removido.");
	}
	
	public RemoveUsuarioException(String mensagem){
		super(mensagem);
	}
}
