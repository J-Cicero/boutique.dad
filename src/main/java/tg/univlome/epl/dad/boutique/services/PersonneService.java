/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.dad.boutique.services;

import java.util.ArrayList;
import java.util.List;
import tg.univlome.epl.dad.boutique.models.Personne;

/**
 *
 * @author jude
 */
public class PersonneService {
     private static final PersonneService instance = new PersonneService();
    private List<Personne> listes = new ArrayList<>();

    private PersonneService() {}

    public static PersonneService getInstance() {
        return instance;
    }

    public void ajouter(Personne personne) {
        if (personne != null) {
            listes.add(personne);
        }
    }

    public void modifier(Personne personne) {
        int index = listes.indexOf(personne);
        if (index != -1) {
            listes.set(index, personne);
        }
    }

    public void supprimer(Personne personne) {
        listes.remove(personne);
    }

    public Personne trouver(Integer id) {
        for (Personne p : listes) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    public List<Personne> lister() {
        return listes;
    }
    
    public int count(){
         return listes.size();
     }
}
