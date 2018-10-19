package infra;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.HashMap;

import exceptions.PersistenciaLoadException;
import exceptions.PersistenciaSaveException;
import business.model.Usuario;

public class Banco {


	//private String caminho = "C:/Users/comochega/workspace/ProjMapaSoul/src/Dados/Banco.txt";

    public static Boolean Save(HashMap<String, Usuario> usuario) throws PersistenciaSaveException {
        try {
        	
            File file = new File("C:/Users/comochega/workspace/ProjMapaSoul/src/Dados/Banco.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            OutputStream out = new FileOutputStream(file);
            @SuppressWarnings("resource")
			ObjectOutputStream s = new ObjectOutputStream(out);
            s.writeObject(usuario);
        	             return true;
        } catch (IOException io) {
            throw new PersistenciaSaveException();
        }
    }

	@SuppressWarnings("unchecked")
	public static HashMap<String, Usuario> Load() throws PersistenciaLoadException {
        try {
        	
        File file = new File("C:/Users/comochega/workspace/ProjMapaSoul/src/Dados/Banco.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            InputStream in = new FileInputStream(file);
            @SuppressWarnings("resource")
			ObjectInputStream s = new ObjectInputStream(in);
            HashMap<String, Usuario> usuarios = (HashMap) s.readObject();
            return usuarios;
                        
        } catch (IOException | ClassNotFoundException io) {
            throw new PersistenciaLoadException();
        }
    }

}
