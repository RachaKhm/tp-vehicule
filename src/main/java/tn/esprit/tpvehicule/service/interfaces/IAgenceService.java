package tn.esprit.tpvehicule.service.interfaces;

import tn.esprit.tpvehicule.entity.Agence;
import java.util.List;

public interface IAgenceService {
    public List<Agence> retrieveAllAgences();
    public Agence retrieveAgence(Long agenceId);
    public Agence addAgence(Agence c);
    public void removeAgence(Long agenceId);
    public Agence modifyAgence(Agence agence);
}