package tn.esprit.tpvehicule.entity;

import jakarta.persistence.*;
import tn.esprit.tpvehicule.enums.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.*;

@Entity
@Table(name = "vehicule")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Vehicule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVehicule;

    private String immatriculation;

    private String marque;

    private String modele;

    private CategorieVehicule categorie;

    private BigDecimal tarifJournalier;

    private StatutVehicule statut;

    @ManyToOne
    private Agence agence;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "vehicule")
    private Set<Reservation> reservations;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "vehicule")
    private Set<Maintenance> maintenances;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Equipement> equipements;
}