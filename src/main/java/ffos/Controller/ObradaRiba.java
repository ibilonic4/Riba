/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.Controller;

import ffos.Model.Riba;
import ffos.Model.Ribar;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Ivor
 */
public class ObradaRiba extends Obrada<Riba>{

    public void SetData(String broj, String datum){
    
    if(getEntitet()==null){
    Riba r = new Riba();
    SimpleDateFormat df = new SimpleDateFormat("dd.MM.yyyy.");
    try{
    r.setBroj(Integer.parseInt(broj));
    r.setDatum((Date)df.parse(datum));
    } catch(ParseException ex){}
        setEntitet(r);
    }else {
        SimpleDateFormat df = new SimpleDateFormat("dd.MM.yyyy.");
        try{
    getEntitet().setBroj(Integer.parseInt(broj));
    getEntitet().setDatum((Date)df.parse(datum));}catch(ParseException ex){}
    }
    
    
    }
    
    public List<Riba> read(){
    return session.createQuery("from Riba").list();
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
