
package org.example;

public class Paginas {
    private String url;
    private String conteudo;

    public Paginas(String url, String conteudo) {
        this.url = url;
        this.conteudo = conteudo;
    }

    public String getUrl() {
        return url;
    }

    public String getConteudo() {
        return conteudo;
    }
}

