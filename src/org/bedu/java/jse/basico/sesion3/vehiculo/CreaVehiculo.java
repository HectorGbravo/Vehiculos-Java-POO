package org.bedu.java.jse.basico.sesion3.vehiculo;

public class CreaVehiculo {

    private String claseVehiculo;

    public String getClaseVehiculo() {
        return claseVehiculo;
    }


    public void setClaseVehiculo(String claseVehiculo) {
        this.claseVehiculo = claseVehiculo;
    }

    public void datosVehiculo(String tipo, int ancho, int rin, int presion, short ltsActuales, short ltsMaximos) {
        Lector lector = new Lector();
        Llantas llantas = new Llantas();
        llantas.setAncho(ancho);
        llantas.setRin(rin);
        llantas.setPresion(presion);
        String tipo1 = tipo;
        int ancho1 = llantas.getAncho();
        int rin1 = llantas.getRin();
        int presion1 = llantas.getPresion();
        Combustible combustible = new Combustible();
        combustible.setLitrosActuales(ltsActuales);
        combustible.setLitrosMaximos(ltsMaximos);
        short ltsActuales1 = combustible.getLitrosActuales();
        short ltsMaximos1 = combustible.getLitrosMaximos();
        lector.muestraMensaje("El "+tipo1+" usa llantas con ancho: "+ancho1+", rin: "+rin1+" y "+presion1+ " de presion");
        lector.muestraMensaje("El "+tipo1+" tiene "+ltsActuales1+" litros actualmente y su máxima es de "+ltsMaximos1+" Litros");
        Vehiculo vehiculo = new Vehiculo();
        lector.muestraMensaje("llenando tanque...");
        vehiculo.setCombustible(combustible);
        vehiculo.llenarTanque();

        for (int i = 1; i <= 10; i++) {
            vehiculo.avanza();
        }

    }


    public void sedanVehiculo() {
        String tipo = "sedan";
        int sedanAncho = 205;
        int sedanRin = 16;
        int sedanPresion = 35;
        short sedanLtsActuales = 0;
        short sedanLtsMaximos = 40;

        datosVehiculo(tipo, sedanAncho, sedanRin, sedanPresion, sedanLtsActuales, sedanLtsMaximos);
    }

    public void suvVehiculo() {
        Lector lector = new Lector();
        String tipo = "SUV";
        int suvAncho = 215;
        int suvRin = 20;
        int suvPresion = 40;
        short suvLtsActuales = 0;
        short suvLtsMaximos = 60;


        datosVehiculo(tipo, suvAncho, suvRin, suvPresion, suvLtsActuales, suvLtsMaximos);
    }

    public void asignaVehiculo(String tipoVehiculo) {
        if (tipoVehiculo == "sedan") {
            sedanVehiculo();
        } else {
            suvVehiculo();
        }
    }
}















