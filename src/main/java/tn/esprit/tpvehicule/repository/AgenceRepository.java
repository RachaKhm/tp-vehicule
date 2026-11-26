package tn.esprit.tpvehicule.repository;

import tn.esprit.tpvehicule.entity.Agence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AgenceRepository extends JpaRepository<Agence, Long> {
    List<Agence> findByVille(String ville);
    List<Agence> findByNomEndingWith(String nom);
}