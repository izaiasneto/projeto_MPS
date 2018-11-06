package business.control.util;

import java.util.Comparator;

import business.control.singleton.singleton;
import business.model.Usuario;

public class ComparatorData extends singleton implements Comparator<Usuario>{

	public int compare(Usuario usuario1, Usuario usuario2) {
        return usuario1.getData_nascimento().compareTo(usuario2.getData_nascimento());
    }
}
