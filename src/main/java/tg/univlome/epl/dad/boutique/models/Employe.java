/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.dad.boutique.models;

import java.time.LocalDate;

/**
 *
 * @author jude
 */
public class Employe extends Personne {
    
    private LocalDate dateNaissance;

    public Employe(LocalDate dateNaissance, Integer id, String nom, String prenom) {
        super(id, nom, prenom);
        this.dateNaissance = dateNaissance;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    @Override
    public String toString() {
        return "Employe{" + "dateNaissance= " + dateNaissance + '}';
    }
    
 
    
}
