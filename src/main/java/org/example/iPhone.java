package org.example;

public class iPhone {

    private String modelo;

    public iPhone(String modelo) {
        this.modelo = modelo;
    }

    public boolean ligadoOrNot(boolean ligado) {
        if (ligado == true) {
            System.out.println("Iphone ligado" + modelo);
        } else {
            System.out.println("Iphone desligado");
        }
        return ligado;
    }

}
