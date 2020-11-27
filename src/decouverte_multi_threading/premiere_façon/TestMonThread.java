/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decouverte_multi_threading.premiere_façon;

/**
 *
 * @author Max
 */
public class TestMonThread {

    public static void main(String[] args) {

        System.out.println("\n\nDebut de TestMonThread\n\n");

        System.out.println("Le programme principale s'execute dans "+
                "le Thread de nom : " + Thread.currentThread().getName()
        );

        MonThread mt1=new MonThread("Nounours");
        MonThread mt2=new MonThread("                    Bonne nuit les petits");

        mt1.start();
        mt2.start();

        System.out.println("\n\nFin de TestMonThread\n\n");

    }
}