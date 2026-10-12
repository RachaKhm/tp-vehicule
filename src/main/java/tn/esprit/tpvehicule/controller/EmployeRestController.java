package tn.esprit.tpvehicule.controller;

import tn.esprit.tpvehicule.entity.Employe;
import tn.esprit.tpvehicule.service.interfaces.IEmployeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/employe")
public class EmployeRestController {

    IEmployeService employeService;

    // http://localhost:8089/tpvehicule/employe/retrieve-all-employes
    @GetMapping("/retrieve-all-employes")
    public List<Employe> getEmployes() {
        return employeService.retrieveAllEmployes();
    }

    // http://localhost:8089/tpvehicule/employe/retrieve-employe/8
    @GetMapping("/retrieve-employe/{employe-id}")
    public Employe retrieveEmploye(@PathVariable("employe-id") Long employeId) {
        return employeService.retrieveEmploye(employeId);
    }

    // http://localhost:8089/tpvehicule/employe/add-employe
    @PostMapping("/add-employe")
    public Employe addEmploye(@RequestBody Employe c) {
        return employeService.addEmploye(c);
    }

    // http://localhost:8089/tpvehicule/employe/remove-employe/{employe-id}
    @DeleteMapping("/remove-employe")
    public void removeEmploye(@RequestParam Long employeId) {
        employeService.removeEmploye(employeId);
    }

    // http://localhost:8089/tpvehicule/employe/modify-employe
    @PutMapping("/modify-employe")
    public Employe modifyEmploye(@RequestBody Employe c) {
        return employeService.modifyEmploye(c);
    }
}