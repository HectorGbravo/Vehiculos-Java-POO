package org.bedu.java.jse.basico.sesion3.vehiculo;

public class Llantas {
    private int rin;
    private int ancho;
    private int presion;

    public int getRin() {
        return rin;
    }

    public void setRin(int rin) {
        this.rin = rin;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {

        this.ancho = ancho;


    }

    public int getPresion() {
        return presion;
    }

    public void setPresion(int presion) {
        this.presion = presion;
    }
    public void rueda() {
        System.out.println("Rodando.......");
    }

}
