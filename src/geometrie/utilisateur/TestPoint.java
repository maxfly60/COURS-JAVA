package geometrie.utilisateur;

import geometrie.fournisseur.Point;

public class TestPoint {
    
    public static void main(String[] args) 
    {
        Point premierPoint;
        premierPoint = new Point("P1", 9.1f, 143.3f);
        premierPoint.setNom(null);
        premierPoint.setAbscisse(0);
        premierPoint.setOrdonnee(7.5f);
        
        System.out.println("\n".repeat(5));
        System.out.println("Début du programme TestPoint");
        System.out.println(premierPoint.toString());
        System.out.println("Fin du programme TestPoint");
        
    }
    
}
