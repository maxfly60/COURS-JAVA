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
public class MonThread extends Thread {

    private String message;

    public MonThread(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "MonThread{" + "message=" + message + '}';
    }

    @Override
    public void run() {

            System.out.println("MonThread demarre dans le Thread de nom : "
                    + getName()
            );

            for(int i=0; i<25; i++){

                System.out.println(message + " i="+i);
                try{
                    Thread.sleep(500);
                }catch (InterruptedException ex){

                }
            }

            System.out.println("MonThread termine");

       }
}