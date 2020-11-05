package geometrie.fournisseur;

public class Point {
    
    private static final String NOM_PAR_DEFAUT="NomParDefaut";
    
    protected String nom;
    protected float abscisse;
    protected float ordonnee;
    
    public Point(String n, float x, float y){
        
        nom = (n==null)?NOM_PAR_DEFAUT:n;
        abscisse = x;
        ordonnee = y;
    }
    public Point(){
//        this.nom = "NomParDefaut";
//        this.abscisse = 0.0f;
//        this.ordonnee = 0.0f;
          this(NOM_PAR_DEFAUT, 0.0f, 0.0f);
    }
    
//    double donneTonAbscisse()
//    {
//        return this.abscisse;
//    }
//    
//    double donneTonOrdonnee()
//    {
//        return this.ordonnee;
//    }

    public double getAbscisse()
    {
        return abscisse;
    }
    public double getOrdonee()
    {
        return ordonnee;
    }
    public void setNom(String nom)
    {
        this.nom = nom;
    }
    public void setAbscisse(float abscisse)
    {
        this.abscisse = abscisse;
    }
    public void setOrdonnee(float ordonnee)
    {
        this.ordonnee = ordonnee;
    }

    @Override
    public String toString() {
        return "Point{" + "nom=" + nom + ", abscisse=" + abscisse + ", ordonnee=" + ordonnee + '}';
    }
 
    
    
}
