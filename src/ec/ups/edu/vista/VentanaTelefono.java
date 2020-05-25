/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.vista;

import java.awt.*;

/**
 *
 * @author Adolfo
 */
public class VentanaTelefono extends Frame {

    public VentanaTelefono(String title) {
        this.setTitle(title);

        this.setSize(850, 600);
        this.setLocation(new Point(410, 10));

        Panel panelPrincipal = new Panel();
        Panel panelNorte = new Panel();
        Panel panelCentro = new Panel();
        Panel panelRegistrar = new Panel();
        Panel registrar = new Panel();
        Panel panelSur = new Panel();
        BorderLayout posiciones = new BorderLayout();

        GridLayout mallaP = new GridLayout(4, 2, 5, 5);

        this.setLayout(posiciones);

        Label mensaje = new Label("Bienvenido");
        panelNorte.add(mensaje);
        panelNorte.setBackground(Color.YELLOW);
        /*
        Panel panelMensaje = new Panel();
        Label mensajeUsuario = new Label("Adolfo Jara");
        panelMensaje.add(mensajeUsuario);*/

        this.add(panelNorte, BorderLayout.NORTH);
        //principal.add(panelMensaje);

        GridLayout malla = new GridLayout(5, 1);
        panelPrincipal.setLayout(malla);
        panelCentro.setLayout(malla);

        GridLayout mallaR = new GridLayout(6, 2, 7, 0);
        registrar.setLayout(mallaR);

        // GridLayout mallar = new GridLayout(3, 1);
        //panelRegistrar.setLayout(mallar);
        Label registrarT = new Label("Registrar un nuevo Telefono");
        Label espacio = new Label("");
        Label numeroR = new Label("Numero del telefono:\n");
        TextField numero = new TextField("0987456123", 10);
        Label tipoR = new Label("Tipo de telefono:\n");
        TextField tipo = new TextField("celular", 10);
        Label operadoraR = new Label("Operadora del telefono:\n");
        TextField operadora = new TextField("movistar", 10);
        Label codigoR = new Label("Codigo:\n");
        TextField codigo = new TextField("1", 5);
        Button crearR = new Button("Crear Telefono");
        crearR.setBackground(Color.black);
        crearR.setForeground(Color.YELLOW);

        registrar.add(registrarT);
        registrar.add(espacio);
        registrar.add(numeroR);
        registrar.add(numero);
        registrar.add(tipoR);
        registrar.add(tipo);
        registrar.add(operadoraR);
        registrar.add(operadora);
        registrar.add(codigoR);
        registrar.add(codigo);
        //panelRegistrar.add(registrar);
        registrar.add(crearR);

        panelCentro.add(registrar);
        //principal.add(registrar);

        Panel editar = new Panel();
        Panel panelEditar = new Panel();

        GridLayout mallaRe = new GridLayout(6, 2, 7, 0);
        panelEditar.setLayout(posiciones);
        editar.setLayout(mallaRe);

        Label editarT = new Label("Editar un Telefono");
        Label espacio2 = new Label("");
        Label codigoE = new Label("Escriba el codigo del telefono a editar:");
        TextField codigoE2 = new TextField("1", 5);
        Label numeroE = new Label("Nuevo numero");
        TextField numeroE2 = new TextField("072455666", 10);
        Label tipoE = new Label("Tipo de telefono:");
        TextField tipoE2 = new TextField("casa", 10);
        Label operadoraE = new Label("Operadora del telefono: ");
        TextField operadoraE2 = new TextField("etapa", 10);
        Button editarTT = new Button("Editar Telefono");
        editarTT.setBackground(Color.black);
        editarTT.setForeground(Color.yellow);

        editar.add(editarT, BorderLayout.NORTH);
        editar.add(espacio2);
        editar.add(codigoE);
        editar.add(codigoE2);
        editar.add(numeroE);
        editar.add(numeroE2);
        editar.add(tipoE);
        editar.add(tipoE2);
        editar.add(operadoraE);
        editar.add(operadoraE2);
        editar.add(editarTT);
        //panelEditar.add(editar, BorderLayout.CENTER);

        panelCentro.add(editar);
        //principal.add(panelEditar, BorderLayout.CENTER);

        Panel panelEliminar = new Panel();
        GridLayout mallaE = new GridLayout(4, 1);
        panelEliminar.setLayout(mallaE);

        Label eliminar = new Label("Eliminar un Telefono");
        Label eliminarT = new Label("Escriba el codigo del telefono a eliminar:");
        TextField eliminarT2 = new TextField("1", 5);
        Button eliminarT3 = new Button("Eliminar Telefono");
        eliminarT3.setBackground(Color.black);
        eliminarT3.setForeground(Color.yellow);

        panelEliminar.add(eliminar);
        panelEliminar.add(eliminarT);
        panelEliminar.add(eliminarT2);
        panelEliminar.add(eliminarT3);

        panelCentro.add(panelEliminar);
        //principal.add(panelEliminar);

        Panel panelBuscar = new Panel();
        panelBuscar.setLayout(mallaE);
        //panelBuscar.setBackground(Color.red);

        Label buscar = new Label("Buscar un telefono");
        Label buscarT = new Label("Escriba el codigo del telefono a buscar:");
        TextField buscarT2 = new TextField("1", 5);
        Button buscarT3 = new Button("Buscar Telefono");
        buscarT3.setBackground(Color.black);
        buscarT3.setForeground(Color.yellow);
        buscarT3.setSize(100, 10);

        panelBuscar.add(buscar);
        panelBuscar.add(buscarT);
        panelBuscar.add(buscarT2);
        panelBuscar.add(buscarT3);

        panelCentro.add(panelBuscar);
        //principal.add(panelBuscar);

        Panel panelListar = new Panel();
        GridLayout mallaL = new GridLayout(2, 1);
        panelListar.setLayout(mallaL);

        Label listar = new Label("Listar sus telefonos");
        Button listarT = new Button("Listar sus telefonos");
        listarT.setBackground(Color.black);
        listarT.setForeground(Color.yellow);
        
        panelListar.add(listar);
        panelListar.add(listarT);

        panelCentro.add(panelListar);
        panelCentro.setBackground(Color.lightGray);
        panelCentro.setForeground(Color.black);
        //principal.add(panelListar);

        this.add(panelCentro, BorderLayout.CENTER);

        Panel panelSalir = new Panel();
        GridLayout mallaS = new GridLayout(1, 2, 7, 0);
        panelSalir.setLayout(mallaS);

        Button cerrarSesion = new Button("Cerrar Sesión");
        cerrarSesion.setBackground(Color.red);
        Button salir = new Button("Salir");
        salir.setBackground(Color.red);

        panelSalir.add(cerrarSesion);
        panelSalir.add(salir);

        this.add(panelSalir, BorderLayout.SOUTH);

        this.setVisible(true);

    }

}
