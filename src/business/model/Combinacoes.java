/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.model;

import java.util.ArrayList;

/**
 *
 * @author Larissa
 */
public class Combinacoes {
    private String id;
    private ArrayList<Mensagem> msgs;
    private boolean isNovaMsg;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Mensagem> getMsgs() {
        return msgs;
    }

    public void setMsgs(ArrayList<Mensagem> msgs) {
        this.msgs = msgs;
    }

    public boolean isNovaMsg() {
        return isNovaMsg;
    }

    public void setNovaMsg(boolean isNovaMsg) {
        this.isNovaMsg = isNovaMsg;
    }
}
