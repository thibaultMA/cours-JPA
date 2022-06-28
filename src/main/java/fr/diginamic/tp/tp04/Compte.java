package fr.diginamic.tp.tp04;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "Compte", uniqueConstraints = {
        @UniqueConstraint(name = "uc_compte_id", columnNames = {"id"})
})
public class Compte {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToMany
    @JoinTable(name = "Compte_clients",
            joinColumns = @JoinColumn(name = "compte_id"),
            inverseJoinColumns = @JoinColumn(name = "clients_id"))
    private Set<Client> clients = new LinkedHashSet<>();



    @OneToMany(mappedBy = "compte", orphanRemoval = true)
    private Set<Operation> operations = new LinkedHashSet<>();

    @Column(name = "solde")
    private Double solde;

    @Column(name = "numero")
    private String numero;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Double getSolde() {
        return solde;
    }

    public void setSolde(Double solde) {
        this.solde = solde;
    }

    public Set<Operation> getOperations() {
        return operations;
    }

    public void setOperations(Set<Operation> operations) {
        this.operations = operations;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Set<Client> getClients() {
        return clients;
    }

    public void setClients(Set<Client> clients) {
        this.clients = clients;
    }

}
