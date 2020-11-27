/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decouverte_multi_threading.seconde_façon;

/**
 *
 * @author Max
 */
public class MonRunnable implements Runnable {

    private String message;

    public MonRunnable(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "MonRunnable{" + "message=" + message + '}';
    }

    @Override
    public void run() {

            System.out.println("MonRunnable demarre dans le Thread de nom : "
                    + Thread.currentThread().getName()
            );

            for(int i=0; i<25; i++){

                System.out.println(message + " i="+i);
                try{
                    Thread.sleep(250);
                }catch (InterruptedException ex){

                }
            }
            System.out.println("MonRunnable termine");
       }
}