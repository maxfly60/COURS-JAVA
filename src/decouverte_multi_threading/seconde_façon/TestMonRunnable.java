 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decouverte_multi_threading.seconde_façon;

/**
 *
 * @author Rémy
 */
public class TestMonRunnable {

    public static void main(String[] args) {

        System.out.println("\n\nDebut de TestMonRunnable\n\n");

        System.out.println("Le programme principale s'execute dans "+
                "le Thread de nom : " + Thread.currentThread().getName()
        );

        MonRunnable premierRunnable=new MonRunnable("Nounours");
        MonRunnable secondRunnable=new MonRunnable("\t\t\tBonne nuit les petits");

        //premierRunnable.start();

        Thread t1=new Thread(premierRunnable);
        Thread t2=new Thread(secondRunnable);

        t1.start();
        t2.start();

        System.out.println("\n\nFin de TestMonRunnable\n\n");
    }
}