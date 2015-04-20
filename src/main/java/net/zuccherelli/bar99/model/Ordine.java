package net.zuccherelli.bar99.model;

import java.util.Set;

public class Ordine {
    private Set<Dettaglio> dettagli;

    public class Dettaglio {
        private int    quantita = 1;
        private Piatto piatto;

        /**
         * @return the quantita
         */
        public int getQuantita() {
            return quantita;
        }

        /**
         * @param quantita the quantita to set
         */
        public void setQuantita(int quantita) {
            this.quantita = quantita;
        }

        /**
         * @return the piatto
         */
        public Piatto getPiatto() {
            return piatto;
        }

        /**
         * @param piatto the piatto to set
         */
        public void setPiatto(Piatto piatto) {
            this.piatto = piatto;
        }
    }

    /**
     * @return the piatti
     */
    public Set<Dettaglio> getPiatti() {
        return dettagli;
    }

    /**
     * @param piatti the piatti to set
     */
    public void setPiatti(Set<Dettaglio> piatti) {
        this.dettagli = piatti;
    }
}
