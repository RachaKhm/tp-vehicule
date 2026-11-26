package tn.esprit.tpvehicule.service.impl;

import tn.esprit.tpvehicule.entity.Maintenance;
import tn.esprit.tpvehicule.repository.MaintenanceRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpvehicule.service.interfaces.IMaintenanceService;

import java.time.LocalDate;
import java.util.List;

@Service
@AllArgsConstructor
public class MaintenanceServiceImpl implements IMaintenanceService {

    MaintenanceRepository maintenanceRepository;

    public List<Maintenance> retrieveAllMaintenances() {
        return maintenanceRepository.findAll();
    }

    public Maintenance retrieveMaintenance(Long maintenanceId) {
        return maintenanceRepository.findById(maintenanceId).get();
    }

    public Maintenance addMaintenance(Maintenance c) {
        return maintenanceRepository.save(c);
    }

    public void removeMaintenance(Long maintenanceId) {
        maintenanceRepository.deleteById(maintenanceId);
    }

    public Maintenance modifyMaintenance(Maintenance maintenance) {
        return maintenanceRepository.save(maintenance);
    }

    @Override
    public List<Maintenance> getMaintenancesBetweenDates(LocalDate dateDebut, LocalDate dateFin) {
        return maintenanceRepository.findByDateFinBetween(dateDebut, dateFin);
    }
}