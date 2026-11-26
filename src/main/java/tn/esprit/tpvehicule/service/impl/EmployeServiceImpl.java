package tn.esprit.tpvehicule.service.impl;

import tn.esprit.tpvehicule.entity.Agence;
import tn.esprit.tpvehicule.entity.Employe;
import tn.esprit.tpvehicule.repository.AgenceRepository;
import tn.esprit.tpvehicule.repository.EmployeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpvehicule.service.interfaces.IEmployeService;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployeServiceImpl implements IEmployeService {

    EmployeRepository employeRepository;
    AgenceRepository agenceRepository;

    public List<Employe> retrieveAllEmployes() {
        return employeRepository.findAll();
    }

    public Employe retrieveEmploye(Long employeId) {
        return employeRepository.findById(employeId).get();
    }

    public Employe addEmploye(Employe c) {
        return employeRepository.save(c);
    }

    public void removeEmploye(Long employeId) {
        employeRepository.deleteById(employeId);
    }

    public Employe modifyEmploye(Employe employe) {
        return employeRepository.save(employe);
    }


    @Override
    public Employe desaffecterEmploye(Long idEmploye) {
        Employe employe = employeRepository.findById(idEmploye)
                .orElseThrow(() -> new RuntimeException("Employé introuvable avec l'id : " + idEmploye));

        employe.setAgence(null);

        return employeRepository.save(employe);
    }

    @Override
    public Employe affecterEmploye(Long idEmploye, Long idAgence) {
        Employe employe = employeRepository.findById(idEmploye)
                .orElseThrow(() -> new RuntimeException("Employé introuvable avec l'id : " + idEmploye));

        Agence agence = agenceRepository.findById(idAgence)
                .orElseThrow(() -> new RuntimeException("Agence introuvable avec l'id : " + idAgence));

        employe.setAgence(agence);

        return employeRepository.save(employe);
    }
}