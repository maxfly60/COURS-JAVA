package geometrie.utilisateur;
import geometrie.fournisseur.Pixel;
import geometrie.fournisseur.Point;
import java.awt.Color;

public class TestPixel {
    
    public static void main(String[] args) {
        Pixel unPixel;
        unPixel = new Pixel(Color.BLUE, true, 10.7f, 6.7f, "pix");
        System.out.println(unPixel);
        
        Point p;
        //p=new Point();
        p=unPixel;
        
        
        if (p instanceof Pixel)
        {
            Pixel r;
            r=(Pixel)p;
            System.out.println(r.getColor());
        }
        
    }   
}