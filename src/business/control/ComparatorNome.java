package business.control;

import java.util.Comparator;
import business.model.Usuario;

public class ComparatorNome implements Comparator<Usuario> {

    public int compare(Usuario usuario1, Usuario usuario2) {
        if (usuario1.getLogin().compareTo(usuario2.getLogin()) != 0) {
            return usuario1.getLogin().compareTo(usuario2.getLogin());
        } else {
            return usuario1.getSenha().compareTo(usuario2.getSenha());
        }
    }
}
