package org.bedu.java.jse.basico.sesion3.vehiculo;

public class Vehiculo {


    private Llantas [] llantas = new Llantas[4];
    private Combustible combustible = new Combustible();

    public void setCombustible(Combustible combustible) {
        this.combustible = combustible;
    }

    public void colocaLlantas(Llantas delIzq, Llantas delDer, Llantas trasIzq, Llantas trasDer) {
        llantas[0] = delIzq;
        llantas[1] = delDer;
        llantas[2] = trasIzq;
        llantas[3] = trasDer;
    }

    public void llenarTanque() {
        combustible.setLitrosActuales(combustible.getLitrosMaximos());
    }

    public void avanza() {
        int kmRecorridos = 0;
        Lector lector = new Lector();
        if (combustible.getLitrosActuales() >0) {
            for (int contador = 1; contador <=4; contador++) {
                Llantas llanta = new Llantas();
                llanta.rueda();
                kmrecorridos += 1
                lector.muestraMensaje("Avanzando "+ kmRecorridos);
            }
            combustible.usa();
        } else {
            System.out.println("Ya no queda combustible para avanzar");
        }
    }
}

