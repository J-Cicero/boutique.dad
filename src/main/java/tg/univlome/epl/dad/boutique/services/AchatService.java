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
import tg.univlome.epl.dad.boutique.models.Achat;

public final class AchatService {

    private static final AchatService instance = new AchatService() ; 
    private List<Achat> listes = new ArrayList<>();

    private AchatService() {}

    public static AchatService getInstance() {
        return instance;
    }

    public void ajouter(Achat achat) {
        if (achat != null) {
            listes.add(achat);
        }
    }

    public void modifier(Achat achat) {
        int index = listes.indexOf(achat);
        if (index != -1) {
            listes.set(index, achat);
        }
    }

    public void supprimer(Achat achat) {
        listes.remove(achat);
    }

    public Achat trouver(Integer id) {
        for (Achat a : listes) {
            if (a.getId().equals(id)) {
                return a;
            }
        }
        return null;
    }

    public List<Achat> lister() {
        return listes;
    }
    
    
     public int count(){
         return listes.size();
     }
}

