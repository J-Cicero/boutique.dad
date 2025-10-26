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
import tg.univlome.epl.dad.boutique.models.Produit;


public final class ProduitService {

    private static final ProduitService instance = new ProduitService();
    private List<Produit> listes = new ArrayList<>();

    private ProduitService() {}

    public static ProduitService getInstance() {
        return instance;
    }

    public void ajouter(Produit produit) {
        if (produit != null) {
            listes.add(produit);
        }
    }

    public void modifier(Produit produit) {
        int index = listes.indexOf(produit);
        if (index != -1) {
            listes.set(index, produit);
        }
    }

    public void supprimer(Produit produit) {
        listes.remove(produit);
    }

    public Produit trouver(Integer id) {
        for (Produit p : listes) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    public List<Produit> lister() {
        return listes;
    }
}

