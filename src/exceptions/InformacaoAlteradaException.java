package exceptions;

@SuppressWarnings("serial")
public class InformacaoAlteradaException extends Exception{

	public InformacaoAlteradaException(){
		super("Informacao alterada.");
	}
	
	public InformacaoAlteradaException(String mensagem){
		super(mensagem);
	}
}
