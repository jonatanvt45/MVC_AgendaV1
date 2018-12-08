/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import views.ViewInterfaz;
import models.ModelInterfaz;
import controllers.ControllerInterfaz;
/**
 *
 * @author galacxter infnity
 */
public class Main {

    public static void main(String[] args) {
        ViewInterfaz viewCvs = new ViewInterfaz();
        ModelInterfaz modelCvs = new ModelInterfaz();
        ControllerInterfaz controllerCvs = new ControllerInterfaz(viewCvs,modelCvs);
    }
    
}
