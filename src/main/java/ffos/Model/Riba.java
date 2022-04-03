/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.Model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Ivor
 */
@Entity
public class Riba extends Entitet{
    
    private Integer broj;
    @Temporal(TemporalType.DATE)
    private Date datum;
    @ManyToOne
    private Ribar ribar;
    @ManyToOne
    private Ribnjak ribnjak;

    public Integer getBroj() {
        return broj;
    }

    public void setBroj(Integer broj) {
        this.broj = broj;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public Ribar getRibar() {
        return ribar;
    }

    public void setRibar(Ribar ribar) {
        this.ribar = ribar;
    }

    public Ribnjak getRibnjak() {
        return ribnjak;
    }

    public void setRibnjak(Ribnjak ribnjak) {
        this.ribnjak = ribnjak;
    }
    
    
    
}
