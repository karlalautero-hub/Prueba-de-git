package org.yourcompany.yourproject;

public class Socio extends Usuario {
    private int limiteEjemplares;
    private int ejemplaresPrestados;
    private int multasPendientes;


    public Socio(String id, String nombre, String email, int limiteEjemplares) {
        super(id, nombre, email);
        this.limiteEjemplares = limiteEjemplares;
        this.ejemplaresPrestados = 0;
        this.multasPendientes = 0;
    }

    public void registrarPrestamo(int cantidad) {
        if(cantidad > limiteEjemplares - ejemplaresPrestados)
        {
            throw new IllegalArgumentException("Excede el limite de ejemplares permitidos.");
        }
         if (multasPendientes > 0) {
            throw new IllegalStateException("No se pueden registrar prestamos con multas pendientes.");
    }

    System.out.println("Se prestaron " + cantidad + " ejemplares.");

    }