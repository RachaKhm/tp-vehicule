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

    @GetMapping("/retrieve-all-agences")
    public List<Agence> getAgences() {
        return agenceService.retrieveAllAgences();
    }

    @GetMapping("/retrieve-agence/{agence-id}")
    public Agence retrieveAgence(@PathVariable("agence-id") Long agenceId) {
        return agenceService.retrieveAgence(agenceId);
    }

    @PostMapping("/add-agence")
    public Agence addAgence(@RequestBody Agence c) {
        return agenceService.addAgence(c);
    }

    @DeleteMapping("/remove-agence")
    public void removeAgence(@RequestParam Long agenceId) {
        agenceService.removeAgence(agenceId);
    }

    @PutMapping("/modify-agence")
    public Agence modifyAgence(@RequestBody Agence c) {
        return agenceService.modifyAgence(c);
    }

    @GetMapping("/ville/{ville}")
    public List<Agence> getAgencesByVille(@PathVariable String ville) {
        return agenceService.getAgencesByVille(ville);
    }

    @GetMapping("/nom-ends/{nom}")
    public List<Agence> getAgencesByNomEndingWith(@PathVariable String nom) {
        return agenceService.getAgencesByNomEndingWith(nom);
    }
}