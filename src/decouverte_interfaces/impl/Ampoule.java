/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decouverte_interfaces.impl;

import decouverte_interfaces.api.Demarrable;

import decouverte_interfaces.utilisation.test_interface;

/**
 *
 * @author Max
 */
public class Ampoule implements Demarrable, Comparable<Ampoule>{
    
    private int puissance;

    public Ampoule(int puissance) {
        this.puissance = 1+Math.abs(puissance);
        this.allumee=false;
    }

    @Override
    public String toString() {
        return "Ampoule{" + "puissance=" + puissance + ", allumee=" + allumee + '}';
    }
    
    private boolean allumee;
    
    @Override
    public void on() {
        if(!allumee){
            System.out.println("\tL'Ampoule s'allume");

            this.allumee = true;
        }
    }

    @Override
    public void off() {
        if(allumee){
            System.out.println("\tL'Ampoule s'arrête");

            this.allumee = false;
        }
    }
    @Override
    public int compareTo(Ampoule o){
        if(puissance>o.puissance) return 1;
        if(puissance==o.puissance) return 0;
        return -1;
    }
}
