/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introductionbaseihm.premierefacon;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Max
 */
public class MonEcouteurPourMonBouton implements ActionListener{

    private MonPanneau p;
    
    public MonEcouteurPourMonBouton(MonPanneau p){
        this.p = p;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        p.YA_EU_UN_CLICK();
    }
    
}
