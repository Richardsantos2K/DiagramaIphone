package org.example;


public class ReprodutorMusica extends iPhone {
    private String titulo;
    private String artista;
    private int min;
    private int seg;
    private boolean reproduzindo;




    public ReprodutorMusica(String modelo, String titulo, String artista, int min, int seg) {
        super(modelo);
        this.titulo = titulo;
        this.artista = artista;
        this.min = min;
        this.seg = seg;
        this.reproduzindo = false; // Inicialmente, a música não está reproduzindo
    }

    public void tocar() {
        if (ligadoOrNot(true)) {
            if (!reproduzindo) {
                System.out.println("Tocando música: " + titulo + " - " + artista + " (Duração: " + min + ":" + seg + " segundos)");
                        reproduzindo = true;
            } else {
                System.out.println("A música já está sendo reproduzida.");
            }
        } else {
            System.out.println("iPhone desligado, não é possível tocar a música.");
        }
    }

    public void pausar() {
        if (ligadoOrNot(true)) {
            if (reproduzindo) {
                System.out.println("Música pausada: " + titulo + " - " + artista + " (Duração: " + min + ":" + seg + " segundos)");
                reproduzindo = false;
            } else {
                System.out.println("A música não está sendo reproduzida para pausar.");
            }
        } else {
            System.out.println("iPhone desligado, não é possível pausar a música.");
        }
    }


    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }

    public int getMin() {
        return min;
    }

    public int getSeg() {
        return seg;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }
}


