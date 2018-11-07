package business.control.memento;

import business.model.Usuario;

public class TextoUsuario {

	protected String texto;
    TextoCareTaker caretaker;
 
    public TextoUsuario() {
        caretaker = new TextoCareTaker();
        texto = new String();
    }
 
    public void salvarLoginSenha(Usuario usuario) {
        caretaker.adicionarMemento(new Memento(texto));
        texto += " login: " + usuario.getLogin() + " senha: " + usuario.getSenha() + "\n";
    }
 
    public void desfazer() {
        texto = caretaker.getUltimoEstadoSalvo().getTextoSalvo();
    }
 
    public void mostrarTexto() {
        System.out.println(texto);
    }
}
