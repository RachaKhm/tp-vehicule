package tn.esprit.tpvehicule.service.interfaces;

import tn.esprit.tpvehicule.entity.Equipement;
import java.util.List;

public interface IEquipementService {
    public List<Equipement> retrieveAllEquipements();
    public Equipement retrieveEquipement(Long equipementId);
    public Equipement addEquipement(Equipement c);
    public void removeEquipement(Long equipementId);
    public Equipement modifyEquipement(Equipement equipement);
}