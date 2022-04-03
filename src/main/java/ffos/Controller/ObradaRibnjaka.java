/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.Controller;

import ffos.Model.Ribnjak;
import java.util.List;

/**
 *
 * @author Ivor
 */
public class ObradaRibnjaka extends Obrada<Ribnjak> {

    public void SetData(String naziv, String opis){
    
    if(getEntitet()==null){
    Ribnjak r = new Ribnjak();
    r.setNaziv(naziv);
    r.setOpis(opis);
        setEntitet(r);
    }else {
    getEntitet().setNaziv(naziv);
    getEntitet().setOpis(opis);
    }
    
    
    }
    
    public List<Ribnjak> read(){
    return session.createQuery("from Ribnjak").list();
    }
    
    
    @Override
    public void kontrolaCreate() throws Exception {
    }

    @Override
    public void kontrolaUpdate() throws Exception {
    }

    @Override
    public void kontrolaDelete() throws Exception {
    }
    
}
