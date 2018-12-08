/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import views.ViewInterfaz;
import models.ModelInterfaz;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
/**
 *
 * @author galacxter infnity
 */
public class ControllerInterfaz {
    ViewInterfaz viewInterfaz;
    ModelInterfaz modelInterfaz;
    ActionListener ac = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == viewInterfaz.jb_limpiar)
                    limpiar();
            else if(e.getSource() == viewInterfaz.jb_guardar){
                guardar();
            }
        }
    };
    public ControllerInterfaz(ViewInterfaz viewCvs, ModelInterfaz modelCvs) {
        this.viewInterfaz = viewCvs;
        this.modelInterfaz = modelCvs;
        this.viewInterfaz.jb_guardar.addActionListener(ac);
        this.viewInterfaz.jb_limpiar.addActionListener(ac);
        initComponents();
    }
    
    public void limpiar(){
        viewInterfaz.jtf_nombre.setText("");
        viewInterfaz.jtf_email.setText("");
    }
    
    public void guardar(){
        modelInterfaz.setNombre(viewInterfaz.jtf_nombre.getText());
        modelInterfaz.setEmail(viewInterfaz.jtf_email.getText());
        modelInterfaz.writeFile();
    }
    
    private void initComponents(){
        viewInterfaz.setVisible(true);
        modelInterfaz.readFile();
        viewInterfaz.jtf_nombre.setText(modelInterfaz.getNombre());
        viewInterfaz.jtf_email.setText(modelInterfaz.getEmail());
        
    }
    
}
