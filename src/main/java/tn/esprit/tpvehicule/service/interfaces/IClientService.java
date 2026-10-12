package tn.esprit.tpvehicule.service.interfaces;

import tn.esprit.tpvehicule.entity.Client;
import java.util.List;

public interface IClientService {
    public List<Client> retrieveAllClients();
    public Client retrieveClient(Long clientId);
    public Client addClient(Client c);
    public void removeClient(Long clientId);
    public Client modifyClient(Client client);
}