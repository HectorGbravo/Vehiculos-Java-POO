package org.bedu.java.jse.basico.sesion3.vehiculo;

import java.util.Scanner;

public class Lector {
    private Scanner scanner = new Scanner(System.in);

    public void muestraMensaje(String mensaje) {

        System.out.println(mensaje);
    }
    public String leerEntrada() {
        String entrada = scanner.nextLine();
        return entrada;
    }
}


