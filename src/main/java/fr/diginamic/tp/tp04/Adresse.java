package fr.diginamic.tp.tp04;

import javax.persistence.*;

@Embeddable
public class Adresse {
    @Column(name = "numero")
    private Integer numero;

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    @Column(name = "ville")
    private String ville;

    @Column(name = "code_postal", nullable = false)
    private int codePostal;

    @Column(name = "rue")
    private String rue;

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public int getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(int codePostal) {
        this.codePostal = codePostal;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }
}
