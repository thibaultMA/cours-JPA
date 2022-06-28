package fr.diginamic.tp.tp01;


import javax.persistence.*;

@Entity
@Table(name = "auteur")

public class Auteurs {

    public Long getId() {
        return id;
    }
@Id
@GeneratedValue
    private Long id;
    @Column(name = "Nom",length = 30,nullable = false, unique = true)
    private String nom;

    @Column(name = "PreNom",length = 30,nullable = false)
    private String preNom;

    public Auteurs() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPreNom() {
        return preNom;
    }

    public void setPreNom(String preNom) {
        this.preNom = preNom;
    }
}
