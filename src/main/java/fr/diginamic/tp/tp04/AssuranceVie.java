package fr.diginamic.tp.tp04;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "ASSURANCEVIE")
public class AssuranceVie extends Compte{
    @Column(name = "date_fin")
    private LocalDate dateFin;

    @Column(name = "taux")
    private Double taux;

    public Double getTaux() {
        return taux;
    }

    public void setTaux(Double taux) {
        this.taux = taux;
    }

    public LocalDate getDateFin() {
        return dateFin;
    }

    public void setDateFin(LocalDate dateFin) {
        this.dateFin = dateFin;
    }
}
