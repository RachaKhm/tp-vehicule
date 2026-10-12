package tn.esprit.tpvehicule.controller;

import tn.esprit.tpvehicule.entity.Maintenance;
import tn.esprit.tpvehicule.service.interfaces.IMaintenanceService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/maintenance")
public class MaintenanceRestController {

    IMaintenanceService maintenanceService;

    // http://localhost:8089/tpvehicule/maintenance/retrieve-all-maintenances
    @GetMapping("/retrieve-all-maintenances")
    public List<Maintenance> getMaintenances() {
        return maintenanceService.retrieveAllMaintenances();
    }

    // http://localhost:8089/tpvehicule/maintenance/retrieve-maintenance/8
    @GetMapping("/retrieve-maintenance/{maintenance-id}")
    public Maintenance retrieveMaintenance(@PathVariable("maintenance-id") Long maintenanceId) {
        return maintenanceService.retrieveMaintenance(maintenanceId);
    }

    // http://localhost:8089/tpvehicule/maintenance/add-maintenance
    @PostMapping("/add-maintenance")
    public Maintenance addMaintenance(@RequestBody Maintenance c) {
        return maintenanceService.addMaintenance(c);
    }

    // http://localhost:8089/tpvehicule/maintenance/remove-maintenance/{maintenance-id}
    @DeleteMapping("/remove-maintenance")
    public void removeMaintenance(@RequestParam Long maintenanceId) {
        maintenanceService.removeMaintenance(maintenanceId);
    }

    // http://localhost:8089/tpvehicule/maintenance/modify-maintenance
    @PutMapping("/modify-maintenance")
    public Maintenance modifyMaintenance(@RequestBody Maintenance c) {
        return maintenanceService.modifyMaintenance(c);
    }
}