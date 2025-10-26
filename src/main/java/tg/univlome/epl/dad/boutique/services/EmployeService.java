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
import tg.univlome.epl.dad.boutique.models.Employe;

public final class EmployeService {

    private static final EmployeService instance = new EmployeService();
    private List<Employe> listes = new ArrayList<>();

    private EmployeService() {}

    public static EmployeService getInstance() {
        return instance;
    }

    public void ajouter(Employe employe) {
        if (employe != null) {
            listes.add(employe);
        }
    }

    public void modifier(Employe employe) {
        int index = listes.indexOf(employe);
        if (index != -1) {
            listes.set(index, employe);
        }
    }

    public void supprimer(Employe employe) {
        listes.remove(employe);
    }

    public Employe trouver(Integer id) {
        for (Employe e : listes) {
            if (e.getId().equals(id)) {
                return e;
            }
        }
        return null;
    }

    public List<Employe> lister() {
        return listes;
    }
}

