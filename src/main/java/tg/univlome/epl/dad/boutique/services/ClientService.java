/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.dad.boutique.services;

/**
 *
 * @author jude
 */
import java.util.ArrayList;
import java.util.List;
import tg.univlome.epl.dad.boutique.models.Client;

public final class ClientService {

    private static final ClientService instance = new ClientService();
    private List<Client> listes = new ArrayList<>();

    private ClientService() {}

    public static ClientService getInstance() {
        return instance;
    }

    public void ajouter(Client client) {
        if (client != null) {
            listes.add(client);
        }
    }

    public void modifier(Client client) {
        int index = listes.indexOf(client);
        if (index != -1) {
            listes.set(index, client);
        }
    }

    public void supprimer(Client client) {
        listes.remove(client);
    }

    public Client trouver(Integer id) {
        for (Client c : listes) {
            if (c.getId().equals(id)) {
                return c;
            }
        }
        return null;
    }

    public List<Client> lister() {
        return listes;
    }
    
    public int count(){
       return listes.size();
    }
    
}

