package tn.esprit.tpvehicule.controller;

import tn.esprit.tpvehicule.entity.Vehicule;
import tn.esprit.tpvehicule.service.interfaces.IVehiculeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/vehicule")
public class VehiculeRestController {

    IVehiculeService vehiculeService;

    // http://localhost:8089/tpvehicule/vehicule/retrieve-all-vehicules
    @GetMapping("/retrieve-all-vehicules")
    public List<Vehicule> getVehicules() {
        return vehiculeService.retrieveAllVehicules();
    }

    // http://localhost:8089/tpvehicule/vehicule/retrieve-vehicule/8
    @GetMapping("/retrieve-vehicule/{vehicule-id}")
    public Vehicule retrieveVehicule(@PathVariable("vehicule-id") Long vehiculeId) {
        return vehiculeService.retrieveVehicule(vehiculeId);
    }

    // http://localhost:8089/tpvehicule/vehicule/add-vehicule
    @PostMapping("/add-vehicule")
    public Vehicule addVehicule(@RequestBody Vehicule c) {
        return vehiculeService.addVehicule(c);
    }

    // http://localhost:8089/tpvehicule/vehicule/remove-vehicule/{vehicule-id}
    @DeleteMapping("/remove-vehicule")
    public void removeVehicule(@RequestParam Long vehiculeId) {
        vehiculeService.removeVehicule(vehiculeId);
    }

    // http://localhost:8089/tpvehicule/vehicule/modify-vehicule
    @PutMapping("/modify-vehicule")
    public Vehicule modifyVehicule(@RequestBody Vehicule c) {
        return vehiculeService.modifyVehicule(c);
    }
}