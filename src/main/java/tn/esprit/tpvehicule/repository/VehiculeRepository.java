package tn.esprit.tpvehicule.repository;

import tn.esprit.tpvehicule.entity.Vehicule;
import tn.esprit.tpvehicule.enums.CategorieVehicule;
import tn.esprit.tpvehicule.enums.StatutVehicule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface VehiculeRepository extends JpaRepository<Vehicule, Long> {
    List<Vehicule> findByMarque(String marque);
    List<Vehicule> findByCategorie(CategorieVehicule categorie);
    List<Vehicule> findByStatut(StatutVehicule statut);
    List<Vehicule> findByMarqueContaining(String marque);
    List<Vehicule> findByModeleStartingWith(String modele);
    List<Vehicule> findByTarifJournalierGreaterThan(BigDecimal tarif);
    List<Vehicule> findByTarifJournalierLessThan(BigDecimal tarif);
    List<Vehicule> findByTarifJournalierGreaterThanEqual(BigDecimal tarif);
    List<Vehicule> findByMarqueAndStatut(String marque, StatutVehicule statut);
    List<Vehicule> findByCategorieIn(List<CategorieVehicule> categories);
    List<Vehicule> findByMarqueAndTarifJournalierLessThan(String marque, BigDecimal tarif);
    List<Vehicule> findByStatutOrderByTarifJournalierAsc(StatutVehicule statut);
    List<Vehicule> findAllByOrderByTarifJournalierDesc();
}