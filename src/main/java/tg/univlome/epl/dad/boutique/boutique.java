/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tg.univlome.epl.dad.boutique;

import java.time.LocalDate;
import java.util.Arrays;
import tg.univlome.epl.dad.boutique.models.Achat;
import tg.univlome.epl.dad.boutique.models.Client;
import tg.univlome.epl.dad.boutique.models.Employe;
import tg.univlome.epl.dad.boutique.models.Produit;
import tg.univlome.epl.dad.boutique.models.ProduitAchete;
import tg.univlome.epl.dad.boutique.services.AchatService;
import tg.univlome.epl.dad.boutique.services.ClientService;
import tg.univlome.epl.dad.boutique.services.EmployeService;
import tg.univlome.epl.dad.boutique.services.ProduitAcheteService;
import tg.univlome.epl.dad.boutique.services.ProduitService;

/**
 *
 * @author jude
 */
public class boutique {

 public static void main(String[] args) {
        System.out.println("=== Test des services CRUD ===");

        Produit p1 = new Produit(1, "Café", 1500, LocalDate.of(2025, 12, 31));
        Produit p2 = new Produit(2, "Thé", 1000, LocalDate.of(2025, 11, 30));

        ProduitService produitService = ProduitService.getInstance();
        produitService.ajouter(p1);
        produitService.ajouter(p2);

        System.out.println("Liste des produits : " + produitService.lister());

        p1.setPrixUnitaire(1600);
        produitService.modifier(p1);
        System.out.println("Produit modifié : " + produitService.trouver(1).getPrixUnitaire());

        produitService.supprimer(p2);
        System.out.println("Liste après suppression : " + produitService.lister());

        Client c1 = new Client(1, "Doe", "John");
        Client c2 = new Client(2, "Smith", "Anna");

        ClientService clientService = ClientService.getInstance();
        clientService.ajouter(c1);
        clientService.ajouter(c2);

        System.out.println("Liste des clients : " + clientService.lister());

        Employe e1 = new Employe(LocalDate.of(1990, 5, 20), 1, "Dupont", "Paul");
        Employe e2 = new Employe(LocalDate.of(1985, 3, 15), 2, "Martin", "Claire");

        EmployeService employeService = EmployeService.getInstance();
        employeService.ajouter(e1);
        employeService.ajouter(e2);

        System.out.println("Liste des employés : " + employeService.lister());

        Achat a1 = new Achat(1, LocalDate.now(), 10, e1, c1);
        Achat a2 = new Achat(2, LocalDate.now(), 5, e2, c2);

        AchatService achatService = AchatService.getInstance();
        achatService.ajouter(a1);
        achatService.ajouter(a2);

        System.out.println("Liste des achats : " + achatService.lister());

        ProduitAchete pa1 = new ProduitAchete(1, 5, a1);
        ProduitAchete pa2 = new ProduitAchete(2, 0, a1);

        ProduitAcheteService paService = ProduitAcheteService.getInstance();
        paService.ajouter(pa1);
        paService.ajouter(pa2);

        a1.setProduitAchetes(Arrays.asList(pa1, pa2));

        System.out.println("Liste des produits achetés pour a1 : " + a1.getProduitAchetes());
    }
}
