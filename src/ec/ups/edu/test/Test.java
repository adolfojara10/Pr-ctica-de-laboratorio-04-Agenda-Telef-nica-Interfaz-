/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.test;

import ec.ups.edu.vista.VentanaTelefono;
import java.awt.*;

/**
 *
 * @author Adolfo
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        VentanaTelefono principal = new VentanaTelefono("Interfaz Telefonos");
        principal.setSize(600, 700);
        principal.setLocation(new Point(410, 10));

        Panel panelPrincipal = new Panel();
        Panel panelNorte = new Panel();
        Panel panelCentro = new Panel();
        Panel panelRegistrar = new Panel();
        Panel registrar = new Panel();
        Panel panelSur = new Panel();
        BorderLayout posiciones = new BorderLayout();

       
        
    }

}
