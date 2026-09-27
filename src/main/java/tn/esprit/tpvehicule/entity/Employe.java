package tn.esprit.tpvehicule.entity;

import jakarta.persistence.*;
import lombok.*;
import tn.esprit.tpvehicule.enums.RoleEmploye;

@Entity
@Table(name = "employe")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEmploye;

    private String nom;
    private String prenom;

    @Enumerated(EnumType.STRING)
    private RoleEmploye role;
}
