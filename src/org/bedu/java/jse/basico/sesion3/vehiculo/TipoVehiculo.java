package org.bedu.java.jse.basico.sesion3.vehiculo;

import java.util.Locale;

public class TipoVehiculo {
    public static void main(String[] args) {
        Lector lector = new Lector();
        lector.muestraMensaje("Por favor indique si el vehículo es sedan o SUV: ");
        String entrada = lector.leerEntrada();
        String tipoVehiculo = entrada.toLowerCase();
        CreaVehiculo creaVehiculo = new CreaVehiculo();
        creaVehiculo.setClaseVehiculo(tipoVehiculo);
        String asignaDatosVehiculo = creaVehiculo.getClaseVehiculo();
        creaVehiculo.asignaVehiculo(asignaDatosVehiculo);




    }

}



