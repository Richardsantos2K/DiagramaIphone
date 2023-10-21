package org.example;

import java.util.ArrayList;

public class NavegarInternet extends iPhone {
    private ArrayList<Paginas> paginasAbertas;

    public NavegarInternet(String modelo, String sistemaOperacional) {
        super(modelo);
        paginasAbertas = new ArrayList<>();
    }

    public void exibirPaginas() {
        if (ligar(true)) {
            for (Paginas pagina : paginasAbertas) {
                System.out.println("URL: " + pagina.getUrl());
                System.out.println("Conteúdo: " + pagina.getConteudo());
                System.out.println("---------------------");
            }
        } else {
            System.out.println("iPhone desligado. Não é possível exibir páginas.");
        }
    }

    public void adicionarNovaAba(Paginas pagina) {
        if (ligar(true)) {
            paginasAbertas.add(pagina);
            System.out.println("Nova aba adicionada com sucesso.");
        } else {
            System.out.println("iPhone desligado. Não é possível adicionar nova aba.");
        }
    }

    public void atualizarPaginas() {
        if (ligar(true)) {
            System.out.println("Atualizando páginas abertas...");
            // Coloque aqui a lógica de atualização das páginas.
            System.out.println("Páginas atualizadas com sucesso.");
        } else {
            System.out.println("iPhone desligado. Não é possível atualizar páginas.");
        }
    }
}
