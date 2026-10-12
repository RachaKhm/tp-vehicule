package tn.esprit.tpvehicule.controller;

import tn.esprit.tpvehicule.entity.Client;
import tn.esprit.tpvehicule.service.interfaces.IClientService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/client")
public class ClientRestController {

    IClientService clientService;

    // http://localhost:8089/tpvehicule/client/retrieve-all-clients
    @GetMapping("/retrieve-all-clients")
    public List<Client> getClients() {
        return clientService.retrieveAllClients();
    }

    // http://localhost:8089/tpvehicule/client/retrieve-client/8
    @GetMapping("/retrieve-client/{client-id}")
    public Client retrieveClient(@PathVariable("client-id") Long clientId) {
        return clientService.retrieveClient(clientId);
    }

    // http://localhost:8089/tpvehicule/client/add-client
    @PostMapping("/add-client")
    public Client addClient(@RequestBody Client c) {
        return clientService.addClient(c);
    }

    // http://localhost:8089/tpvehicule/client/remove-client/{client-id}
    @DeleteMapping("/remove-client")
    public void removeClient(@RequestParam Long clientId) {
        clientService.removeClient(clientId);
    }

    // http://localhost:8089/tpvehicule/client/modify-client
    @PutMapping("/modify-client")
    public Client modifyClient(@RequestBody Client c) {
        return clientService.modifyClient(c);
    }
}