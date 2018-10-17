package exceptions;

@SuppressWarnings("serial")
public class PersistenciaLoadException extends Exception {

	public PersistenciaLoadException(){
		super("Erro ao realizar leitura dos dados.");
	}
		
	public PersistenciaLoadException(String mensagem){
		super(mensagem);
	}
	
}
