/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decouverte_interfaces.utilisation;

import decouverte_interfaces.api.Demarrable;
import decouverte_interfaces.impl.Voiture;
import decouverte_interfaces.impl.Ampoule;
import decouverte_interfaces.impl.ComparateurDeVoitureRouge;
import java.awt.Color;
import java.util.Arrays;
import java.util.Comparator;

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
        
        System.out.println("\n_____________________________\n");
        
        Demarrable d;
        
        d=uneVoiture;
        
        d.off();
        d.on();
        
        
        System.out.println("\n_____________________________\n");
        
        
        Ampoule uneAmpoule=new Ampoule(100);
        uneAmpoule.on();
        System.out.println(uneAmpoule);
        
        d=uneAmpoule;
        d.off();
        d.on();
            
        System.out.println("\n_____________________________\n");

        Demarrable[] tableau;
        
        tableau=new Demarrable[2];
        
        tableau[0]=uneVoiture;
        tableau[1]=new Voiture(Color.blue);
        
        for(Demarrable unDemarrable : tableau){
            System.out.println(unDemarrable);
            unDemarrable.off();
            unDemarrable.on();
            System.out.println("   ...");
            
        }
        
        System.out.println("\n_____________________________\n");
        
        Ampoule[] desAmpoules = {
            
        new Ampoule(150),
        new Ampoule(25),
        new Ampoule(12),
        new Ampoule(5),
        };
        
        System.out.println("Avant le tri du tableau d'Ampoules \n");
        for(Ampoule a : desAmpoules) {
            System.out.println(a);
        }
        System.out.println("");
        
        Arrays.sort(desAmpoules);
        
        
        System.out.println("Après le tri du tableau d'Ampoules \n");
        for(Ampoule a : desAmpoules) {
            System.out.println(a);
        }  
        
        
        System.out.println("\n_____________________________\n");
        
        Voiture[] desVoitures = {
            
        new Voiture(Color.ORANGE),
        new Voiture(Color.GREEN),
        new Voiture(Color.BLUE),
        new Voiture(Color.BLACK),
        }; 
        
        System.out.println("Avant le tri du tableau de Voitures \n");
        for(Voiture v : desVoitures) {
            System.out.println(v);
        }
        System.out.println("");
        
        ComparateurDeVoitureRouge monComparateurDeVoitureRouge = new ComparateurDeVoitureRouge();
  
        Arrays.sort(desVoitures, monComparateurDeVoitureRouge); 
        
        System.out.println("Après le tri du tableau de Voitures \n");
        for(Voiture v : desVoitures) {
            System.out.println(v);
        }
        
        
        System.out.println("\n_____________________________\n");
        
        System.out.println("Avant le tri du tableau de Voitures.... Green \n");
        for(Voiture v : desVoitures) {
            System.out.println(v);
        }
        
 
        Arrays.sort(desVoitures, new Comparator<Voiture>() {
            @Override
            public int compare(Voiture o1, Voiture o2) {
                int g1=o1.getCouleur().getGreen();
                int g2=o2.getCouleur().getGreen();
        
                if(g1>g2) return 1;
                if(g1==g2) return 0;
                return -1;
            }
        }
        );
        
        
        System.out.println("Après le tri du tableau de Voitures.... Green \n");
        for(Voiture v : desVoitures) {
            System.out.println(v);
        }        
        
        
        
        System.out.println("\n_____________________________\n");
       
        /*
        
        Arrays.sort(desVoitures,(voiture1, voiture2) -> {
            int b1=voiture1.getCouleur().getBlue();
            int b2=voiture2.getCouleur().getBlue();
            
            if (b1 > b2) {
                return 1;
            }
            if (b1==b2){
                return 0;
            }
            return -1;
        }
        );
        
*/
        
        System.out.println("\nFin TestInterface\n\n");
    }
    
}
