/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.dad.boutique.services;

import java.util.ArrayList;
import java.util.List;
import tg.univlome.epl.dad.boutique.models.Categories;

/**
 *
 * @author jude
 */
public final class CategoriesService {
    private static final CategoriesService instance = new CategoriesService();
    private List<Categories> listes = new ArrayList<>();
    
    private CategoriesService() {} 
    
    public static CategoriesService getInstance() { 
        return instance;
    } 
    
    public void ajouter(Categories categorie) { 
        if (categorie != null) { 
            listes.add(categorie); 
        } 
    } 
    
    public void modifier(Categories categorie) {
        int index = listes.indexOf(categorie);
        if (index != -1) { 
            listes.set(index, categorie); 
        } 
    } 
    
    public void supprimer(Categories categorie) { 
        listes.remove(categorie);
    }
    
    public Categories trouver(long id) { 
        for (Categories c : listes) { 
            if (c.getId() == id) { 
                return c; 
            } 
        } 
        return null; 
    } 
    
    public List<Categories> lister() {
        return listes; 
    } 
}
