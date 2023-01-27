package org.bedu.java.jse.basico.sesion3.vehiculo;

public class TipoVehiculo {
    public static void main(String[] args) {
        Lector lector = new Lector();
        lector.muestraMensaje("Por favor indique si el vehículo es sedan o SUV: ");
        String entrada = lector.leerEntrada();
        String tipoVehiculo = entrada.toLowerCase();
<<<<<<< HEAD
        lector.muestraMensaje(entrada+" "+ tipoVehiculo);
        Llantas llantas = new Llantas();
        Combustible combustible = new Combustible();
        Vehiculo vehiculo = new Vehiculo();
        switch (tipoVehiculo) {
            case "suv" -> {
                llantas.setAncho(215);
                llantas.setRin(20);
                llantas.setPresion(40);
                int suvAncho = llantas.getAncho();
                int suvRin = llantas.getRin();
                int suvPresion = llantas.getPresion();
                lector.muestraMensaje("El SUV usa llantas con ancho: " + suvAncho + ", rin: " + suvRin + " y " + suvPresion + " psi de presion");
                combustible.setLitrosActuales((short) 0);
                combustible.setLitrosMaximos((short) 60);
                short suvLtsActuales = combustible.getLitrosActuales();
                short suvLtsMaximos = combustible.getLitrosMaximos();
                lector.muestraMensaje("El SUV tiene actualmente " + suvLtsActuales + " Litros de un máximo de " + suvLtsMaximos + " litros");
                vehiculo.setCombustible(combustible);
                vehiculo.colocaLlantas(llantas, llantas, llantas, llantas);
                vehiculo.llenarTanque();
                lector.muestraMensaje("Se ha llenado el tanque con "+combustible.getLitrosActuales()+" litros");
                lector.muestraMensaje("Se ha encendido el vehículo y se inicia un recorrido de 10 kms");
                for (int i = 1; i <= 10; i++) {
                    vehiculo.avanza();
                }
            }
            case "sedan" -> {
                llantas.setAncho(205);
                llantas.setRin(16);
                llantas.setPresion(35);
                int sedanAncho = llantas.getAncho();
                int sedanRin = llantas.getRin();
                int sedanPresion = llantas.getPresion();
                lector.muestraMensaje("El sedan usa llantas con ancho: " + sedanAncho + ", rin: " + sedanRin + " y " + sedanPresion + "de presion");
                combustible.setLitrosActuales((short) 0);
                combustible.setLitrosMaximos((short) 40);
                short sedanLtsActuales = combustible.getLitrosActuales();
                short sedanLtsMaximos = combustible.getLitrosMaximos();
                lector.muestraMensaje("El sedan tiene actualmente" + sedanLtsActuales + " Litros de un máximo de " + sedanLtsMaximos + " litros");
                vehiculo.setCombustible(combustible);
                vehiculo.colocaLlantas(llantas, llantas, llantas, llantas);
                vehiculo.llenarTanque();
                for (int i = 1; i <= 10; i++) {
                    vehiculo.avanza();
                }
            }
        }
=======
        CreaVehiculo creaVehiculo = new CreaVehiculo();
        creaVehiculo.setClaseVehiculo(tipoVehiculo);
        String asignaDatosVehiculo = creaVehiculo.getClaseVehiculo();
        creaVehiculo.asignaVehiculo(asignaDatosVehiculo);



>>>>>>> 13bf9295498f6f7ff8ead1f6aa9cbf24afdc551b

    }

}



