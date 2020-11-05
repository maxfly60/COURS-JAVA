/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decouverte_interfaces.impl;

import decouverte_interfaces.api.Demarrable;

/**
 *
 * @author Max
 */
public class Ampoule implements Demarrable {
    
    private int puissance;

    public Ampoule(int puissance) {
        this.puissance = +Math.abs(puissance);
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
}
