package tn.esprit.tpvehicule.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tn.esprit.tpvehicule.entity.Employe;
import tn.esprit.tpvehicule.entity.Vehicule;

import java.util.*;

@Entity
@Table(name = "agence")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Agence {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;

    private String ville;

    private String adresse;

    private String telephone;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "agence")
    private Set<Employe> employes;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "agence")
    private Set<Vehicule> vehicules;
}