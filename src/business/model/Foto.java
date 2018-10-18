/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.model;

/**
 *
 * @author Larissa
 */
public class Foto {
    
      private String id;
    private String url;
    private String NomedoArquivo;
    
    
    public Foto(){
        
    }
    public Foto(String id, String url, String NomedoArquivo){
        this.url = url;
        this.id =id;
        this.NomedoArquivo = NomedoArquivo;
    }

    public String getNomedoArquivo() {
        return NomedoArquivo;
    }

    public void setNomedoArquivo(String NomedoArquivo) {
        this.NomedoArquivo = NomedoArquivo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
