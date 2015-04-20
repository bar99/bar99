package net.zuccherelli.bar99.model;

import java.util.Date;
import java.util.Set;

public class Menu implements IHasValidita {
    private Date        validitaInizio;
    private Date        validitaFine;
    private Set<Piatto> portate;

    /**
     * @return the piatti
     */
    public Set<Piatto> getPortate() {
        return portate;
    }

    /**
     * @param piatti the piatti to set
     */
    public void setPortate(Set<Piatto> piatti) {
        this.portate = piatti;
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
