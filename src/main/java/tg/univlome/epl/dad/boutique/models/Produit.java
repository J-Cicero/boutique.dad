/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.dad.boutique.models;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author jude
 */
public class Produit {
   
    private Integer id;
    private String libelle;
    private double prixUnitaire;
    private LocalDate datePremption;

    public Produit(Integer id, String libelle, double prixUnitaire, LocalDate datePremption) {
        this.id = id;
        this.libelle = libelle;
        this.prixUnitaire = prixUnitaire;
        this.datePremption = datePremption;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public double getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(double prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }

    public LocalDate getDatePremption() {
        return datePremption;
    }

    public void setDatePremption(LocalDate datePremption) {
        this.datePremption = datePremption;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.id);
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
        final Produit other = (Produit) obj;
        return Objects.equals(this.id, other.id);
    }
    
    public boolean isPerime(){
        return LocalDate.now().isBefore(this.datePremption);
    }
    
    public boolean isPerime(LocalDate datePremption){
        return LocalDate.now().isBefore(this.datePremption);
    }

    @Override
    public String toString() {
        return "Produit{" + "id= " + id + ", libelle= " + libelle + ", prixUnitaire= " + prixUnitaire + ", datePremption=" + datePremption + '}';
    }
 
    
}
