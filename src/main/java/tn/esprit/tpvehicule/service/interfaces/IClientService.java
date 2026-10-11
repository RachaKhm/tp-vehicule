package tn.esprit.tpvehicule.service.interfaces;

import tn.esprit.tpvehicule.entity.Client;

import java.util.List;

public interface IClientService {

    Client addClient(Client client);

    Client updateClient(Long id, Client client);

    void deleteClient(Long id);

    Client getClientById(Long id);

    List<Client> getAllClients();

    Client getClientByEmail(String email);
}