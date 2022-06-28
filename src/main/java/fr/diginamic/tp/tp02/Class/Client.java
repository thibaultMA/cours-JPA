package fr.diginamic.tp.tp02.Class;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Set;


@Entity
@Table(name = "client")
public class Client {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "seq")
    @GenericGenerator(name = "seq",strategy = "increment")
    Long ID;
    @Column(name = "NOM",length = 50)
    String nom;
    @Column(name = "PRENOM",length = 50)
    String prenom;

}
