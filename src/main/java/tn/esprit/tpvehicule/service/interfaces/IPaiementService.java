package tn.esprit.tpvehicule.service.interfaces;

import tn.esprit.tpvehicule.entity.Paiement;
import java.util.List;

public interface IPaiementService {
    public List<Paiement> retrieveAllPaiements();
    public Paiement retrievePaiement(Long paiementId);
    public Paiement addPaiement(Paiement c);
    public void removePaiement(Long paiementId);
    public Paiement modifyPaiement(Paiement paiement);
}