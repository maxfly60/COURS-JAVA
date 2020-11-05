package geometrie.fournisseur;
import java.awt.Color;

public class Pixel extends Point{

    Color couleur;
    boolean allume;
    
    private static final Color COULEUR_PAR_DEFAUT = Color.BLUE;
    
    public Pixel(Color couleur, boolean b, float x, float y, String nom)
    {
        super(nom, x, y);
        this.couleur = (couleur==null)?COULEUR_PAR_DEFAUT:couleur;
        
        this.allume = false;
        if(b)
            allumeToi();
    }
    
    public void changeTaCouleur(Color saNouvelleCouleur)
    {
        if(saNouvelleCouleur==null) return;
        this.couleur = saNouvelleCouleur;
        //Ou alors:
        //this.couleur = (saNouvelleCouleur==null)?COULEUR_PAR_DEFAUT:saNouvelleCouleur;
        boolean initialement = this.allume;
        eteindToi();
        this.couleur = saNouvelleCouleur;
        if(initialement)
            allumeToi();
    }
    
    public void allumeToi(){
        if(!allume){
            allume = true;
        }
    }
    public void eteindToi(){
        if(allume){
            allume = false;
        }
    }
    
    public Color getColor(){
        return this.couleur;
    }
    
    public boolean isAllume(){
        return this.allume;
    }
    
    @Override
    public String toString() {
        
        return "Pixel{"+ "couleurs=" + couleur
                +", allume=" + allume + " \n\t "
                + super.toString()
                + '}';
    }
    
}