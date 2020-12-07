/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introductionbaseihm.premierefacon;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowAdapter;
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
        
       /* 
        this.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {}

            @Override
            public void windowClosing(WindowEvent e) {
                JusteAvantDeQuitterApplication();
            }

            @Override
            public void windowClosed(WindowEvent e) {}

            @Override
            public void windowIconified(WindowEvent e) {}

            @Override
            public void windowDeiconified(WindowEvent e) {}

            @Override
            public void windowActivated(WindowEvent e) {}

            @Override
            public void windowDeactivated(WindowEvent e) {}
        
        });
        */
                
    this.addWindowListener(new WindowAdapter() {
            @Override
        public void windowClosing(WindowEvent e) {
                JusteAvantDeQuitterApplication();
        }
    });
    
        pack();
    }
    public void JusteAvantDeQuitterApplication() {
        System.exit(0);
    }
}
