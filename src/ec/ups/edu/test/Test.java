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

        GridLayout mallaP = new GridLayout(4, 2);
        principal.setLayout(mallaP);

        Label mensaje = new Label("Bienvenido");
        panelNorte.add(mensaje);
        Panel panelMensaje = new Panel();
        Label mensajeUsuario = new Label("Adolfo Jara");
        panelMensaje.add(mensajeUsuario);

        principal.add(panelNorte);
        principal.add(panelMensaje);

        GridLayout malla = new GridLayout(5, 1);
        panelPrincipal.setLayout(malla);
        panelCentro.setLayout(malla);

        GridLayout mallaR = new GridLayout(4, 2);
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

        Panel editar = new Panel();
        Panel panelEditar = new Panel();

        editar.setLayout(mallaR);
        panelEditar.setLayout(posiciones);

        Label editarT = new Label("Editar un Telefono");
        Label codigoE = new Label("Escriba el codigo del telefono a editar:");
        TextField codigoE2 = new TextField("1", 5);
        Label numeroE = new Label("Nuevo numero");
        TextField numeroE2 = new TextField("072455666", 10);
        Label tipoE = new Label("Tipo de telefono:");
        TextField tipoE2 = new TextField("casa", 10);
        Label operadoraE = new Label("Operadora del telefono: ");
        TextField operadoraE2 = new TextField("etapa", 10);
        Button editarTT = new Button("Editar Telefono");

        panelEditar.add(editarT, BorderLayout.NORTH);
        editar.add(codigoE);
        editar.add(codigoE2);
        editar.add(numeroE);
        editar.add(numeroE2);
        editar.add(tipoE);
        editar.add(tipoE2);
        editar.add(operadoraE);
        editar.add(operadoraE2);
        panelEditar.add(editarTT, BorderLayout.SOUTH);
        panelEditar.add(editar, BorderLayout.CENTER);

        // panelCentro.add(panelEditar);
        principal.add(panelEditar);

        
        
        
        
        
        Panel panelEliminar = new Panel();
        GridLayout mallaE = new GridLayout(4, 1);
        panelEliminar.setLayout(mallaE);

        Label eliminar = new Label("Eliminar un Telefono");
        Label eliminarT = new Label("Escriba el codgio del telefono a eliminar:");
        TextField eliminarT2 = new TextField("1", 5);
        Button eliminarT3 = new Button("Eliminar Telefono");

        panelEliminar.add(eliminar);
        panelEliminar.add(eliminarT);
        panelEliminar.add(eliminarT2);
        panelEliminar.add(eliminarT3);

        principal.add(panelEliminar);

    }

}
