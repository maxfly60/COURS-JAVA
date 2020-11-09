/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decouverte_interfaces.impl;

import java.util.Comparator;

/**
 *
 * @author Max
 */
public class ComparateurDeVoitureRouge implements Comparator<Voiture>{

    @Override
    public int compare(Voiture o1, Voiture o2) {
        int r1=o1.getCouleur().getRed();
        int r2=o2.getCouleur().getRed();
        
        if(r1>r2) return 1;
        if(r1==r2) return 0;
        return -1;
    }
}
