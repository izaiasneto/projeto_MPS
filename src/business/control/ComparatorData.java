package business.control;

import java.util.Comparator;
import business.model.Usuario;

public class ComparatorData implements Comparator<Usuario>{

	public int compare(Usuario usuario1, Usuario usuario2) {
        return usuario1.getData_nascimento().compareTo(usuario2.getData_nascimento());
    }
}
