/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introductionbaseihm.premierefacon;

import java.awt.FlowLayout;
import java.awt.Frame;

/**
 *
 * @author Max
 */
public class MaFenetre extends Frame{
    
    private MonPanneau mp;
    
    public MaFenetre(){
        mp = new MonPanneau();
        
        setLayout(new FlowLayout());
        
        add(mp);
        
        pack();
    }
    
}
