package tn.esprit.tpvehicule.service.interfaces;

import tn.esprit.tpvehicule.entity.Vehicule;
import tn.esprit.tpvehicule.enums.CategorieVehicule;
import tn.esprit.tpvehicule.enums.StatutVehicule;

import java.math.BigDecimal;
import java.util.List;

public interface IVehiculeService {
    List<Vehicule> retrieveAllVehicules();
    Vehicule retrieveVehicule(Long vehiculeId);
    Vehicule addVehicule(Vehicule c);
    void removeVehicule(Long vehiculeId);
    Vehicule modifyVehicule(Vehicule vehicule);
    Vehicule affecterVehicule(Long idVehicule, Long idAgence);
    Vehicule affecterEquipement(Long idVehicule, Long idEquipement);
    Vehicule desaffecterEquipement(Long idVehicule, Long idEquipement);

    List<Vehicule> getVehiculesByMarque(String marque);
    List<Vehicule> getVehiculesByCategorie(CategorieVehicule categorie);
    List<Vehicule> getVehiculesDisponibles();
    List<Vehicule> getVehiculesByMarqueContaining(String marque);
    List<Vehicule> getVehiculesByModeleStartingWith(String modele);
    List<Vehicule> getVehiculesByTarifGreaterThan(BigDecimal tarif);
    List<Vehicule> getVehiculesByTarifLessThan(BigDecimal tarif);
    List<Vehicule> getVehiculesByTarifGreaterThanEqual(BigDecimal tarif);
    List<Vehicule> getVehiculesByMarqueAndStatut(String marque, StatutVehicule statut);
    List<Vehicule> getVehiculesByCategories(List<CategorieVehicule> categories);
    List<Vehicule> getVehiculesByMarqueAndTarifLessThan(String marque, BigDecimal tarif);
    List<Vehicule> getVehiculesDisponiblesOrderByTarifAsc();
    List<Vehicule> getAllVehiculesOrderByTarifDesc();
}