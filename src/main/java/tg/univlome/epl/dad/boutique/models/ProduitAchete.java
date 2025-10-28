/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.dad.boutique.models;

import java.util.Objects;

/**
 *
 * @author jude
 */
public class ProduitAchete {
    
    private Integer id;
    private double remise;
    private Achat achat;
    private Produit produit;

    public ProduitAchete(Integer id, double remise, Achat achat) {
        this.id = id;
        this.remise = remise;
        this.achat = achat;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }
    
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer numero) {
        this.id = numero;
    }

    public double getRemise() {
        return remise;
    }

    public void setRemise(double remise) {
        this.remise = remise;
    }

    public Achat getAchat() {
        return achat;
    }

    public void setAchat(Achat achat) {
        this.achat = achat;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.id);
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
        final ProduitAchete other = (ProduitAchete) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "ProduitAchete{" + "id= " + id + ", remise= " + remise + ", achat= " + achat + '}';
    }
    
    
    
}
