package tn.esprit.tpvehicule.controller;

import tn.esprit.tpvehicule.entity.Agence;
import tn.esprit.tpvehicule.service.interfaces.IAgenceService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/agence")
public class AgenceRestController {

    IAgenceService agenceService;

    // http://localhost:8089/tpvehicule/agence/retrieve-all-agences
    @GetMapping("/retrieve-all-agences")
    public List<Agence> getAgences() {
        return agenceService.retrieveAllAgences();
    }

    // http://localhost:8089/tpvehicule/agence/retrieve-agence/8
    @GetMapping("/retrieve-agence/{agence-id}")
    public Agence retrieveAgence(@PathVariable("agence-id") Long agenceId) {
        return agenceService.retrieveAgence(agenceId);
    }

    // http://localhost:8089/tpvehicule/agence/add-agence
    @PostMapping("/add-agence")
    public Agence addAgence(@RequestBody Agence c) {
        return agenceService.addAgence(c);
    }

    // http://localhost:8089/tpvehicule/agence/remove-agence/{agence-id}
    @DeleteMapping("/remove-agence")
    public void removeAgence(@RequestParam Long agenceId) {
        agenceService.removeAgence(agenceId);
    }

    // http://localhost:8089/tpvehicule/agence/modify-agence
    @PutMapping("/modify-agence")
    public Agence modifyAgence(@RequestBody Agence c) {
        return agenceService.modifyAgence(c);
    }
}