package fr.diginamic.tp.tp04;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name = "Client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    String nom;
    String preNom;
    LocalDate dateNaissance;

    @ManyToOne
    @JoinColumn(name = "banque_id")
    private Banque banque;

    @Embedded
    private Adresse adresse;

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public Banque getBanque() {
        return banque;
    }

    public void setBanque(Banque banque) {
        this.banque = banque;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
