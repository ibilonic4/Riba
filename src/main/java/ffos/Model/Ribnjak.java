/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.Model;

import com.sun.istack.NotNull;
import javax.persistence.Entity;

/**
 *
 * @author Ivor
 */
@Entity
public class Ribnjak extends Entitet {
    @NotNull
    private String naziv;
    private String opis;

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }
    
    @Override
    public String toString(){
    return naziv;
    }
    
    
}
