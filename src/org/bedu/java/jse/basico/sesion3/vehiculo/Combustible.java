package org.bedu.java.jse.basico.sesion3.vehiculo;

public class Combustible {
    private short litrosMaximos;
    private short litrosActuales;

    public short getLitrosMaximos() {
        return litrosMaximos;
    }

    public Combustible setLitrosMaximos(short litrosMaximos) {
        this.litrosMaximos = litrosMaximos;
        return null;
    }

    public short getLitrosActuales() {
        return litrosActuales;
    }
    public void setLitrosActuales(short litrosActuales) {
        this.litrosActuales = litrosActuales;
    }

    public void usa() {
        litrosActuales--;
        System.out.println("Quedan "+litrosActuales+" litros.");
    }

}
