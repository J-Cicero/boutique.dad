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
import tg.univlome.epl.dad.boutique.models.ProduitAchete;

public final class ProduitAcheteService {

    private static final ProduitAcheteService instance = new ProduitAcheteService();
    private List<ProduitAchete> listes = new ArrayList<>();

    private ProduitAcheteService() {}

    public static ProduitAcheteService getInstance() {
        return instance;
    }

    public void ajouter(ProduitAchete produitAchete) {
        if (produitAchete != null) {
            listes.add(produitAchete);
        }
    }

    public void modifier(ProduitAchete produitAchete) {
        int index = listes.indexOf(produitAchete);
        if (index != -1) {
            listes.set(index, produitAchete);
        }
    }

    public void supprimer(ProduitAchete produitAchete) {
        listes.remove(produitAchete);
    }

    public ProduitAchete trouver(Integer id) {
        for (ProduitAchete pa : listes) {
            if (pa.getId().equals(id)) {
                return pa;
            }
        }
        return null;
    }

    public List<ProduitAchete> lister() {
        return listes;
    }
    
    public int count(){
         return listes.size();
     }
}
