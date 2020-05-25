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
        
        GridLayout mallaP = new GridLayout(7, 1);
        principal.setLayout(mallaP);

        Label mensaje = new Label("Bienvenido");
        panelNorte.add(mensaje);

        principal.add(panelNorte);

        GridLayout malla = new GridLayout(5, 1);
        panelPrincipal.setLayout(malla);
        panelCentro.setLayout(malla);

        GridLayout mallaR = new GridLayout(4, 2, 0, 0);
        registrar.setLayout(mallaR);

        panelRegistrar.setLayout(posiciones);

        Label registrarT = new Label("Registrar un nuevo Telefono");
        Label numeroR = new Label("Numero del telefono:\n");
        TextField numero = new TextField("0987456123", 10);
        Label tipoR = new Label("Tipo de telefono:\n");
        TextField tipo = new TextField("celular", 10);
        Label operadoraR = new Label("Operadora del telefono:\n");
        TextField operadora = new TextField("movistar", 10);
        Label codigoR = new Label("Codigo:\n");
        TextField codigo = new TextField("1", 5);
        Button crearR = new Button("Crear Telefono");

        panelRegistrar.add(registrarT, BorderLayout.NORTH);
        registrar.add(numeroR);
        registrar.add(numero);
        registrar.add(tipoR);
        registrar.add(tipo);
        registrar.add(operadoraR);
        registrar.add(operadora);
        registrar.add(codigoR);
        registrar.add(codigo);
        panelRegistrar.add(crearR, BorderLayout.SOUTH);
        panelRegistrar.add(registrar, BorderLayout.CENTER);

       

       // panelCentro.add(panelRegistrar);

         principal.add(panelRegistrar);
        
         
         
        

       
        
    }

}
