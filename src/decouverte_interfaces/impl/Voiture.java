/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decouverte_interfaces.impl;

import decouverte_interfaces.api.Demarrable;
import java.awt.Color;
/**
 *
 * @author Max
 */
public class Voiture implements Demarrable {

    private Color couleur;
    private boolean enFonctionnement;

    public Voiture(Color couleur) {
        this.couleur = (couleur == null) ? Color.BLACK: couleur;
        this.enFonctionnement = false;
    }

    public Voiture(){
        this(null);
    }

    public Color getCouleur() {
        return couleur;
    }

    @Override
    public String toString() {
        return "Voiture{" +
                "couleur=" + couleur +
                ", enFonctionnement=" + enFonctionnement +
                '}';
    }

    @Override
    public void on() {
        if(!this.enFonctionnement){
            System.out.println("\tLa voiture démarre");

            this.enFonctionnement = true;
        }
    }

    @Override
    public void off() {
        if(this.enFonctionnement){
            System.out.println("\tLa voiture s'arrête");

            this.enFonctionnement = false;
        }
    }
}
