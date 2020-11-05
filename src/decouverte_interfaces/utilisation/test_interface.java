/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decouverte_interfaces.utilisation;

import decouverte_interfaces.api.Demarrable;
import decouverte_interfaces.impl.Voiture;
import decouverte_interfaces.impl.Ampoule;
import java.awt.Color;

/**
 *
 * @author Max
 */
public class test_interface {
    public static void main(String[] args) {
        
        System.out.println("\nDebut TestInterface\n\n");
        
        Voiture uneVoiture;
        uneVoiture = new Voiture(Color.GREEN);
        
        System.out.println(uneVoiture.getCouleur());
        uneVoiture.on();
        System.out.println(uneVoiture);
        
        System.out.println("\n\n_____________________________\n\n");
        
        Demarrable d;
        
        d=uneVoiture;
        
        d.off();
        d.on();
        
        
        System.out.println("\n\n_____________________________\n\n");
        
        
        Ampoule uneAmpoule=new Ampoule(100);
        uneAmpoule.on();
        System.out.println(uneAmpoule);
        
        d=uneAmpoule;
        d.off();
        d.on();
        
        System.out.println("\nFin TestInterface\n\n");
    }
    
}
