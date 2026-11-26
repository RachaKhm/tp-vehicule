package tn.esprit.tpvehicule.service.impl;

import tn.esprit.tpvehicule.entity.Agence;
import tn.esprit.tpvehicule.entity.Equipement;
import tn.esprit.tpvehicule.entity.Vehicule;
import tn.esprit.tpvehicule.enums.CategorieVehicule;
import tn.esprit.tpvehicule.enums.StatutVehicule;
import tn.esprit.tpvehicule.repository.AgenceRepository;
import tn.esprit.tpvehicule.repository.EquipementRepository;
import tn.esprit.tpvehicule.repository.VehiculeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpvehicule.service.interfaces.IVehiculeService;

import java.math.BigDecimal;
import java.util.List;

@Service
@AllArgsConstructor
public class VehiculeServiceImpl implements IVehiculeService {

    VehiculeRepository vehiculeRepository;
    AgenceRepository agenceRepository;
    EquipementRepository equipementRepository;

    public List<Vehicule> retrieveAllVehicules() {
        return vehiculeRepository.findAll();
    }

    public Vehicule retrieveVehicule(Long vehiculeId) {
        return vehiculeRepository.findById(vehiculeId).get();
    }

    public Vehicule addVehicule(Vehicule c) {
        return vehiculeRepository.save(c);
    }

    public void removeVehicule(Long vehiculeId) {
        vehiculeRepository.deleteById(vehiculeId);
    }

    public Vehicule modifyVehicule(Vehicule vehicule) {
        return vehiculeRepository.save(vehicule);
    }

    @Override
    public Vehicule affecterVehicule(Long idVehicule, Long idAgence) {
        Vehicule vehicule = vehiculeRepository.findById(idVehicule)
                .orElseThrow(() -> new RuntimeException("Vehicule introuvable avec l'id : " + idVehicule));
        Agence agence = agenceRepository.findById(idAgence)
                .orElseThrow(() -> new RuntimeException("Agence introuvable avec l'id : " + idAgence));
        vehicule.setAgence(agence);
        return vehiculeRepository.save(vehicule);
    }

    @Override
    public Vehicule affecterEquipement(Long idVehicule, Long idEquipement) {
        Vehicule vehicule = vehiculeRepository.findById(idVehicule)
                .orElseThrow(() -> new RuntimeException("Vehicule introuvable avec l'id : " + idVehicule));
        Equipement equipement = equipementRepository.findById(idEquipement)
                .orElseThrow(() -> new RuntimeException("Equipement introuvable avec l'id : " + idEquipement));
        vehicule.getEquipements().add(equipement);
        return vehiculeRepository.save(vehicule);
    }

    @Override
    public Vehicule desaffecterEquipement(Long idVehicule, Long idEquipement) {
        Vehicule vehicule = vehiculeRepository.findById(idVehicule)
                .orElseThrow(() -> new RuntimeException("Vehicule introuvable avec l'id : " + idVehicule));
        Equipement equipement = equipementRepository.findById(idEquipement)
                .orElseThrow(() -> new RuntimeException("Equipement introuvable avec l'id : " + idEquipement));
        vehicule.getEquipements().remove(equipement);
        return vehiculeRepository.save(vehicule);
    }

    @Override
    public List<Vehicule> getVehiculesByMarque(String marque) {
        return vehiculeRepository.findByMarque(marque);
    }

    @Override
    public List<Vehicule> getVehiculesByCategorie(CategorieVehicule categorie) {
        return vehiculeRepository.findByCategorie(categorie);
    }

    @Override
    public List<Vehicule> getVehiculesDisponibles() {
        return vehiculeRepository.findByStatut(StatutVehicule.DISPONIBLE);
    }

    @Override
    public List<Vehicule> getVehiculesByMarqueContaining(String marque) {
        return vehiculeRepository.findByMarqueContaining(marque);
    }

    @Override
    public List<Vehicule> getVehiculesByModeleStartingWith(String modele) {
        return vehiculeRepository.findByModeleStartingWith(modele);
    }

    @Override
    public List<Vehicule> getVehiculesByTarifGreaterThan(BigDecimal tarif) {
        return vehiculeRepository.findByTarifJournalierGreaterThan(tarif);
    }

    @Override
    public List<Vehicule> getVehiculesByTarifLessThan(BigDecimal tarif) {
        return vehiculeRepository.findByTarifJournalierLessThan(tarif);
    }

    @Override
    public List<Vehicule> getVehiculesByTarifGreaterThanEqual(BigDecimal tarif) {
        return vehiculeRepository.findByTarifJournalierGreaterThanEqual(tarif);
    }

    @Override
    public List<Vehicule> getVehiculesByMarqueAndStatut(String marque, StatutVehicule statut) {
        return vehiculeRepository.findByMarqueAndStatut(marque, statut);
    }

    @Override
    public List<Vehicule> getVehiculesByCategories(List<CategorieVehicule> categories) {
        return vehiculeRepository.findByCategorieIn(categories);
    }

    @Override
    public List<Vehicule> getVehiculesByMarqueAndTarifLessThan(String marque, BigDecimal tarif) {
        return vehiculeRepository.findByMarqueAndTarifJournalierLessThan(marque, tarif);
    }

    @Override
    public List<Vehicule> getVehiculesDisponiblesOrderByTarifAsc() {
        return vehiculeRepository.findByStatutOrderByTarifJournalierAsc(StatutVehicule.DISPONIBLE);
    }

    @Override
    public List<Vehicule> getAllVehiculesOrderByTarifDesc() {
        return vehiculeRepository.findAllByOrderByTarifJournalierDesc();
    }
}