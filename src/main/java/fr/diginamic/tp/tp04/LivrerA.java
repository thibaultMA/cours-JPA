package fr.diginamic.tp.tp04;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "LIVRETA")
public class LivrerA extends Compte{

    @Column(name = "taux")
    private Double taux;

    public Double getTaux() {
        return taux;
    }

    public void setTaux(Double taux) {
        this.taux = taux;
    }
}
