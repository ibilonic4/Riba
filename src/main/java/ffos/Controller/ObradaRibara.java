/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.Controller;

import ffos.Model.Ribar;
import ffos.Model.Ribnjak;
import java.util.List;

/**
 *
 * @author Ivor
 */
public class ObradaRibara extends Obrada<Ribar> {

        public void SetData(String ime, String prezime){
    
    if(getEntitet()==null){
    Ribar r = new Ribar();
    r.setIme(ime);
    r.setPrezime(prezime);
        setEntitet(r);
    }else {
    getEntitet().setIme(ime);
    getEntitet().setPrezime(prezime);
    }
    
    
    }
    
    public List<Ribar> read(){
    return session.createQuery("from Ribar").list();
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
