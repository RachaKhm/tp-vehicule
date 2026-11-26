package tn.esprit.tpvehicule.controller;

import tn.esprit.tpvehicule.entity.Vehicule;
import tn.esprit.tpvehicule.enums.CategorieVehicule;
import tn.esprit.tpvehicule.enums.StatutVehicule;
import tn.esprit.tpvehicule.service.interfaces.IVehiculeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/vehicule")
public class VehiculeRestController {

    IVehiculeService vehiculeService;

    @GetMapping("/retrieve-all-vehicules")
    public List<Vehicule> getVehicules() {
        return vehiculeService.retrieveAllVehicules();
    }

    @GetMapping("/retrieve-vehicule/{vehicule-id}")
    public Vehicule retrieveVehicule(@PathVariable("vehicule-id") Long vehiculeId) {
        return vehiculeService.retrieveVehicule(vehiculeId);
    }

    @PostMapping("/add-vehicule")
    public Vehicule addVehicule(@RequestBody Vehicule c) {
        return vehiculeService.addVehicule(c);
    }

    @DeleteMapping("/remove-vehicule")
    public void removeVehicule(@RequestParam Long vehiculeId) {
        vehiculeService.removeVehicule(vehiculeId);
    }

    @PutMapping("/modify-vehicule")
    public Vehicule modifyVehicule(@RequestBody Vehicule c) {
        return vehiculeService.modifyVehicule(c);
    }

    @PutMapping("/affecter/{idVehicule}/{idAgence}")
    public Vehicule affecterVehicule(@PathVariable Long idVehicule, @PathVariable Long idAgence) {
        return vehiculeService.affecterVehicule(idVehicule, idAgence);
    }

    @PutMapping("/affecter-equipement/{idVehicule}/{idEquipement}")
    public Vehicule affecterEquipement(@PathVariable Long idVehicule, @PathVariable Long idEquipement) {
        return vehiculeService.affecterEquipement(idVehicule, idEquipement);
    }

    @PutMapping("/desaffecter-equipement/{idVehicule}/{idEquipement}")
    public Vehicule desaffecterEquipement(@PathVariable Long idVehicule, @PathVariable Long idEquipement) {
        return vehiculeService.desaffecterEquipement(idVehicule, idEquipement);
    }

    @GetMapping("/marque/{marque}")
    public List<Vehicule> getVehiculesByMarque(@PathVariable String marque) {
        return vehiculeService.getVehiculesByMarque(marque);
    }

    @GetMapping("/categorie/{categorie}")
    public List<Vehicule> getVehiculesByCategorie(@PathVariable CategorieVehicule categorie) {
        return vehiculeService.getVehiculesByCategorie(categorie);
    }

    @GetMapping("/disponibles")
    public List<Vehicule> getVehiculesDisponibles() {
        return vehiculeService.getVehiculesDisponibles();
    }

    @GetMapping("/marque-contains/{marque}")
    public List<Vehicule> getVehiculesByMarqueContaining(@PathVariable String marque) {
        return vehiculeService.getVehiculesByMarqueContaining(marque);
    }

    @GetMapping("/modele-starts/{modele}")
    public List<Vehicule> getVehiculesByModeleStartingWith(@PathVariable String modele) {
        return vehiculeService.getVehiculesByModeleStartingWith(modele);
    }

    @GetMapping("/tarif-greater/{tarif}")
    public List<Vehicule> getVehiculesByTarifGreaterThan(@PathVariable BigDecimal tarif) {
        return vehiculeService.getVehiculesByTarifGreaterThan(tarif);
    }

    @GetMapping("/tarif-less/{tarif}")
    public List<Vehicule> getVehiculesByTarifLessThan(@PathVariable BigDecimal tarif) {
        return vehiculeService.getVehiculesByTarifLessThan(tarif);
    }

    @GetMapping("/tarif-greater-equal/{tarif}")
    public List<Vehicule> getVehiculesByTarifGreaterThanEqual(@PathVariable BigDecimal tarif) {
        return vehiculeService.getVehiculesByTarifGreaterThanEqual(tarif);
    }

    @GetMapping("/marque-statut")
    public List<Vehicule> getVehiculesByMarqueAndStatut(@RequestParam String marque, @RequestParam StatutVehicule statut) {
        return vehiculeService.getVehiculesByMarqueAndStatut(marque, statut);
    }

    @GetMapping("/categories")
    public List<Vehicule> getVehiculesByCategories(@RequestParam List<CategorieVehicule> categories) {
        return vehiculeService.getVehiculesByCategories(categories);
    }

    @GetMapping("/marque-tarif-less")
    public List<Vehicule> getVehiculesByMarqueAndTarifLessThan(@RequestParam String marque, @RequestParam BigDecimal tarif) {
        return vehiculeService.getVehiculesByMarqueAndTarifLessThan(marque, tarif);
    }

    @GetMapping("/disponibles-tri-asc")
    public List<Vehicule> getVehiculesDisponiblesOrderByTarifAsc() {
        return vehiculeService.getVehiculesDisponiblesOrderByTarifAsc();
    }

    @GetMapping("/tri-desc")
    public List<Vehicule> getAllVehiculesOrderByTarifDesc() {
        return vehiculeService.getAllVehiculesOrderByTarifDesc();
    }
}