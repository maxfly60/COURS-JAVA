/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introductionbaseihm.premierefacon;

import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;

/**
 *
 * @author Max
 */
public class MonPanneau extends Panel{
    
    private Label monLabel;
    private Button monButton;
    
    public MonPanneau(){
        
        monLabel = new Label("Tu n'as pas encore clické !");
        monButton = new Button("Click ICI");
        
        setLayout(new GridLayout(2,1));
        
        add(monLabel);
        add(monButton);
        
        monButton.addActionListener(new MonEcouteurPourMonBouton(this));
        
        compteur = 0;
    }  
    
    int compteur;
    
    void YA_EU_UN_CLICK(){
        compteur ++;
        
        monLabel.setText("Tu as clické " + compteur + " fois");
    }
}
