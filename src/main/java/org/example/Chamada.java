
package org.example;

public class Chamada extends iPhone{

    private boolean chamadaAtiva;

    public Chamada(String modelo, boolean chamadaAtiva) {
        super(modelo);
        this.chamadaAtiva = false;
    }

    public void ligarChamada(String numero){
        if (ligar(true)){
            if (chamadaAtiva) {
                System.out.println("Ligando para o numero" + numero);
                chamadaAtiva = true;
            } else {
                System.out.println("Não a chamada para ligar");
            }
        } else{
            System.out.println("Iphone desligado, não é possivel efetuar chamada");
        }
    }

    public void desligarChamada(){
        if (ligar(true)){
            if (chamadaAtiva) {
                System.out.println("Desligando chamada.");
                chamadaAtiva = false;
            } else {
                System.out.println("Não a chamadas para desligar");
            }
        } else{
            System.out.println("Iphone desligado, não é possivel desligar chamada");
        }
    }

    public void atenderChamada(){
        if (ligar(true)){
            if (chamadaAtiva) {
                System.out.println("Atendendo chamada.");
                chamadaAtiva = true;
            } else {
                System.out.println("Não há chamada ativa para atender.");
            }
        } else{
            System.out.println("Iphone desligado, não é possivel atender chamada");
        }
    }

    public void InciarCorreioVoz(){
        if (ligar(true)){
            if (chamadaAtiva) {
                System.out.println("Iniciando correio de voz");
                chamadaAtiva = true;
            } else {
                System.out.println("Não há mensagens no correio de voz");
            }
        } else{
            System.out.println("Iphone desligado, não é possivel Iniciar correio de voz");
        }
    }
}
