package fr.diginamic.tp.tp02.Class;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "livre")
public class LIVRE {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "seq")
    @GenericGenerator(name = "seq",strategy = "increment")
    Long id;
    @Column(name = "TITRE")
    String titre;
    @Column(name = "AUTEUR")
    String auteur;
    @ManyToMany(mappedBy = "livres")
    private List<Emprint> emprunts;
}
