/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decouverte_multi_threading.decouverte_callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Max
 */
public class TestSommeur {
    public static void main(String[] args) {
        System.out.println("\n\nDebut TestSommeur \n\n");
        
        sommeur sommeur15=new sommeur(15);
        sommeur sommeur8=new sommeur(8);
        sommeur sommeur25=new sommeur(25);
        
        ExecutorService monExecutorService =
               Executors.newFixedThreadPool(3);
       
        Future<Integer> resultat15;
        Future<Integer> resultat8;
        Future<Integer> resultat25;
       
       
        resultat25=monExecutorService.submit(sommeur25);
       
        resultat8=monExecutorService.submit(sommeur8);
       
        resultat15=monExecutorService.submit(sommeur15);  
       
        
        
        
        while(monExecutorService.isTerminated()) {
        try {
            Thread.sleep(100); }
        catch (InterruptedException ex) {
            }
        }
        
        try {
            int res8=resultat8.get(1500, TimeUnit.MILLISECONDS);
            System.out.println("\nEnfin le resultat est apparu "
                + "à temps, il vaut : " + res8 + "\n");
/*            
            int res15=resultat15.get(10, TimeUnit.SECONDS);
            System.out.println("\nEnfin le resultat est apparu "
                + "à temps, il vaut : " + res15 + "\n");
            
            int res25=resultat25.get(10, TimeUnit.SECONDS);
            System.out.println("\nEnfin le resultat est apparu "
                + "à temps, il vaut : " + res25 + "\n");
*/            

        } catch (InterruptedException ex) {
            
        } catch (ExecutionException ex) {
            
        } catch (TimeoutException ex) {
            System.out.println("\nTrop tard, le resultat de "
                + "Sommeur(8) ne m'interesse plus.");
        }
        
        
        System.out.println("\n\nAvant de killer monExecutorService");
        
        
        try {
            System.out.println("\nLe resultat de sommeur8 est " + resultat8.get());
            System.out.println("\nLe resultat de sommeur15 est " + resultat15.get());      
            System.out.println("\nLe resultat de sommeur25 est " + resultat25.get());      
            }
        catch (InterruptedException ex) {
            }
        catch (ExecutionException ex) {
            }
        ;

        
        monExecutorService.shutdown();
        System.out.println("\nFin TestSommeur \n");
    }
    
}
