package business.model;

import business.control.Memento;

public class TextoUsuario {

	protected String texto;
    TextoCareTaker caretaker;
 
    public TextoUsuario() {
        caretaker = new TextoCareTaker();
        texto = new String();
    }
 
    public void escreverTexto(Usuario usuario) {
        caretaker.adicionarMemento(new Memento(texto));
        texto += " login: " + usuario.getLogin() + " senha: " + usuario.getSenha() + "\n";
    }
 
    public void desfazerEscrita() {
        texto = caretaker.getUltimoEstadoSalvo().getTextoSalvo();
    }
 
    public void mostrarTexto() {
        System.out.println(texto);
    }
}