package business.control.util;

import java.util.Comparator;

import business.control.singleton.singleton;
import business.model.Usuario;

public class ComparatorNome extends singleton implements Comparator<Usuario> {

    public int compare(Usuario usuario1, Usuario usuario2) {
        if (usuario1.getLogin().compareTo(usuario2.getLogin()) != 0) {
            return usuario1.getLogin().compareTo(usuario2.getLogin());
        } else {
            return usuario1.getSenha().compareTo(usuario2.getSenha());
        }
    }
}
