package business.control.memento;

import java.util.ArrayList;


public class TextoCareTaker {

	 protected ArrayList<Memento> estados;
	 
	    public TextoCareTaker() {
	        estados = new ArrayList<Memento>();
	    }
	 
	    public void adicionarMemento(Memento memento) {
	        estados.add(memento);
	    }
	 
	    public Memento getUltimoEstadoSalvo() {
	        if (estados.size() <= 0) {
	            return new Memento("");
	        }
	        Memento estadoSalvo = estados.get(estados.size() - 1);
	        estados.remove(estados.size() - 1);
	        return estadoSalvo;
	    }
}