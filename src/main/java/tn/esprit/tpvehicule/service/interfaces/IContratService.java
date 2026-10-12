package tn.esprit.tpvehicule.service.interfaces;

import tn.esprit.tpvehicule.entity.Contrat;
import java.util.List;

public interface IContratService {
    public List<Contrat> retrieveAllContrats();
    public Contrat retrieveContrat(Long contratId);
    public Contrat addContrat(Contrat c);
    public void removeContrat(Long contratId);
    public Contrat modifyContrat(Contrat contrat);
}