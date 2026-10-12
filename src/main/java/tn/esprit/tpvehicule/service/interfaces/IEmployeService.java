package tn.esprit.tpvehicule.service.interfaces;

import tn.esprit.tpvehicule.entity.Employe;
import java.util.List;

public interface IEmployeService {
    public List<Employe> retrieveAllEmployes();
    public Employe retrieveEmploye(Long employeId);
    public Employe addEmploye(Employe c);
    public void removeEmploye(Long employeId);
    public Employe modifyEmploye(Employe employe);
}