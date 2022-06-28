package fr.diginamic.tp.tp02.Class;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;


@Entity
@Table(name = "emprunt")
public class Emprint {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "seq")
    @GenericGenerator(name = "seq",strategy = "increment")
    Long ID;
    @Column(name = "DATE_DEBUT",nullable = false)
    LocalDate DATE_Debut;
    @Column(name = "DELAI",nullable = false )
    Integer Delai;
    @Column(name = "DATE_FIN",nullable = false)
    LocalDate DATE_Fin;
    @ManyToOne
    @JoinColumn(name = "ID")
    Client client;
    @ManyToMany
    @JoinTable(name = "COMPO",
        joinColumns = @JoinColumn(name="ID_EMP",referencedColumnName = ""))
    private Set<LIVRE>livres;
}
