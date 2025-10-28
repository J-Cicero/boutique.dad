/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.dad.boutique.models;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author jude
 */
public class Achat {
    
    private Integer id;
    private LocalDate dateAchat;
    private double remise;
    private Employe employe;
    private Client client;
    private List<ProduitAchete> produitAchetes;

    public Achat(Integer id, LocalDate dateAchat, double remise, Employe employe, Client client) {
        this.id = id;
        this.dateAchat = dateAchat;
        this.remise = remise;
        this.employe = employe;
        this.client = client;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getDateAchat() {
        return dateAchat;
    }

    public void setDateAchat(LocalDate dateAchat) {
        this.dateAchat = dateAchat;
    }

    public double getRemise() {
        return remise;
    }

    public void setRemise(double remise) {
        this.remise = remise;
    }

    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<ProduitAchete> getProduitAchetes() {
        return produitAchetes;
    }

    public void setProduitAchetes(List<ProduitAchete> produitAchetes) {
        this.produitAchetes = produitAchetes;
    }

    public double getRemiseTotale() {
        double totalRemise = 0;
        if (produitAchetes != null) {
            for (ProduitAchete p : produitAchetes) {
                totalRemise += p.getRemise();
            }
        }
        return totalRemise;
    }


    public double getTotalAPayer() {
        double total = 0;
        if (produitAchetes != null) {
            for (ProduitAchete p : produitAchetes) {
                total += p.getProduit().getPrixUnitaire() - p.getRemise();
            }
        }
        // Application de la remise globale de l'achat
        total -= remise;
        return total;
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Achat other = (Achat) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Achat{" + "id= " + id + ", dateAchat= " + dateAchat + ", remise= " + remise + ", employe= " + employe + ", client= " + client + ", produitAchetes= " + produitAchetes + '}';
    }

   
    
}
