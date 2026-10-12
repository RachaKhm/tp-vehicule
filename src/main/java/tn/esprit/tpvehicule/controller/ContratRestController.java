package tn.esprit.tpvehicule.controller;

import tn.esprit.tpvehicule.entity.Contrat;
import tn.esprit.tpvehicule.service.interfaces.IContratService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/contrat")
public class ContratRestController {

    IContratService contratService;

    // http://localhost:8089/tpvehicule/contrat/retrieve-all-contrats
    @GetMapping("/retrieve-all-contrats")
    public List<Contrat> getContrats() {
        return contratService.retrieveAllContrats();
    }

    // http://localhost:8089/tpvehicule/contrat/retrieve-contrat/8
    @GetMapping("/retrieve-contrat/{contrat-id}")
    public Contrat retrieveContrat(@PathVariable("contrat-id") Long contratId) {
        return contratService.retrieveContrat(contratId);
    }

    // http://localhost:8089/tpvehicule/contrat/add-contrat
    @PostMapping("/add-contrat")
    public Contrat addContrat(@RequestBody Contrat c) {
        return contratService.addContrat(c);
    }

    // http://localhost:8089/tpvehicule/contrat/remove-contrat/{contrat-id}
    @DeleteMapping("/remove-contrat")
    public void removeContrat(@RequestParam Long contratId) {
        contratService.removeContrat(contratId);
    }

    // http://localhost:8089/tpvehicule/contrat/modify-contrat
    @PutMapping("/modify-contrat")
    public Contrat modifyContrat(@RequestBody Contrat c) {
        return contratService.modifyContrat(c);
    }
}