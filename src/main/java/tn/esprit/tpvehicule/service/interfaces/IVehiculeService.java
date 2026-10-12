package tn.esprit.tpvehicule.service.interfaces;

import tn.esprit.tpvehicule.entity.Vehicule;
import java.util.List;

public interface IVehiculeService {
    public List<Vehicule> retrieveAllVehicules();
    public Vehicule retrieveVehicule(Long vehiculeId);
    public Vehicule addVehicule(Vehicule c);
    public void removeVehicule(Long vehiculeId);
    public Vehicule modifyVehicule(Vehicule vehicule);
}