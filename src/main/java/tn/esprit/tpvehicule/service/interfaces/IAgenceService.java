package tn.esprit.tpvehicule.service.interfaces;

import tn.esprit.tpvehicule.entity.Agence;
import java.util.List;

public interface IAgenceService {
    List<Agence> retrieveAllAgences();
    Agence retrieveAgence(Long agenceId);
    Agence addAgence(Agence c);
    void removeAgence(Long agenceId);
    Agence modifyAgence(Agence agence);

    List<Agence> getAgencesByVille(String ville);
    List<Agence> getAgencesByNomEndingWith(String nom);
}