package tn.esprit.tpvehicule.controller;

import tn.esprit.tpvehicule.entity.Equipement;
import tn.esprit.tpvehicule.service.interfaces.IEquipementService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/equipement")
public class EquipementRestController {

    IEquipementService equipementService;

    // http://localhost:8089/tpvehicule/equipement/retrieve-all-equipements
    @GetMapping("/retrieve-all-equipements")
    public List<Equipement> getEquipements() {
        return equipementService.retrieveAllEquipements();
    }

    // http://localhost:8089/tpvehicule/equipement/retrieve-equipement/8
    @GetMapping("/retrieve-equipement/{equipement-id}")
    public Equipement retrieveEquipement(@PathVariable("equipement-id") Long equipementId) {
        return equipementService.retrieveEquipement(equipementId);
    }

    // http://localhost:8089/tpvehicule/equipement/add-equipement
    @PostMapping("/add-equipement")
    public Equipement addEquipement(@RequestBody Equipement c) {
        return equipementService.addEquipement(c);
    }

    // http://localhost:8089/tpvehicule/equipement/remove-equipement/{equipement-id}
    @DeleteMapping("/remove-equipement")
    public void removeEquipement(@RequestParam Long equipementId) {
        equipementService.removeEquipement(equipementId);
    }

    // http://localhost:8089/tpvehicule/equipement/modify-equipement
    @PutMapping("/modify-equipement")
    public Equipement modifyEquipement(@RequestBody Equipement c) {
        return equipementService.modifyEquipement(c);
    }
}