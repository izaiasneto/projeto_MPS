package exceptions;

@SuppressWarnings("serial")
public class PersistenciaSaveException extends Exception {

	public PersistenciaSaveException(){
		super("Erro ao salvar os dados.");
	}
	
	public PersistenciaSaveException(String mensagem){
		super(mensagem);
	}
}
