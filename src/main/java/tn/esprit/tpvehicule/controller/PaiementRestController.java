package tn.esprit.tpvehicule.controller;

import tn.esprit.tpvehicule.entity.Paiement;
import tn.esprit.tpvehicule.service.interfaces.IPaiementService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/paiement")
public class PaiementRestController {

    IPaiementService paiementService;

    // http://localhost:8089/tpvehicule/paiement/retrieve-all-paiements
    @GetMapping("/retrieve-all-paiements")
    public List<Paiement> getPaiements() {
        return paiementService.retrieveAllPaiements();
    }

    // http://localhost:8089/tpvehicule/paiement/retrieve-paiement/8
    @GetMapping("/retrieve-paiement/{paiement-id}")
    public Paiement retrievePaiement(@PathVariable("paiement-id") Long paiementId) {
        return paiementService.retrievePaiement(paiementId);
    }

    // http://localhost:8089/tpvehicule/paiement/add-paiement
    @PostMapping("/add-paiement")
    public Paiement addPaiement(@RequestBody Paiement c) {
        return paiementService.addPaiement(c);
    }

    // http://localhost:8089/tpvehicule/paiement/remove-paiement/{paiement-id}
    @DeleteMapping("/remove-paiement")
    public void removePaiement(@RequestParam Long paiementId) {
        paiementService.removePaiement(paiementId);
    }

    // http://localhost:8089/tpvehicule/paiement/modify-paiement
    @PutMapping("/modify-paiement")
    public Paiement modifyPaiement(@RequestBody Paiement c) {
        return paiementService.modifyPaiement(c);
    }
}