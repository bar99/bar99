package net.zuccherelli.bar99.model;

import java.util.Date;

public class Piatto implements IHasValidita {
    private int    id;
    private String desc;
    private Date   validitaInizio;
    private Date   validitaFine;

    enum TipoPortata {
        Antipasto,
        Primo,
        Secondo,
        Contorno,
        Dessert,
        Altro
    };

    private TipoPortata portata;

    /**
     * @return the portata
     */
    public TipoPortata getPortata() {
        return portata;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     * @param desc the desc to set
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public Date getValiditaFine() {
        return validitaFine;
    }

    @Override
    public Date getValiditaInizio() {
        return validitaInizio;
    }
}
