/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decouverte_multi_threading.decouverte_callable;
import java.util.concurrent.Callable;

/**
 *
 * @author Max
 */
public class sommeur implements Callable<Integer> {
    
    private int n;

    public sommeur(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    @Override
    public String toString() {
        return "sommeur{" + "n=" + n + '}';
    }
    
    @Override
    public Integer call() throws Exception {
        int resultat = 0;
        
        for (int i=0; i<n; i++) {
            resultat+=i;
            System.out.println("Sommeur("+n+") : etape "
                    + i + " dans le Thread " 
                    + Thread.currentThread().getName());
            
            try {
                Thread.sleep(20); }
            catch (Exception e) {
            }
        }
        
        System.out.println("Sommeur("+n+") : resultat = "
                    + resultat + " dans le Thread " 
                    + Thread.currentThread().getName());
        
        return resultat;
    }
    
}
