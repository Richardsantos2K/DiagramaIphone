package org.example;

public class Main {
    public static void main(String[] args) {

                // Criar uma instância do iPhone
                iPhone iphone = new iPhone("iPhone 12");

                // Testar as funcionalidades de chamada
                Chamada chamada = new Chamada("iPhone 12", true);
                chamada.ligarChamada("123-456-789");
                chamada.atenderChamada();
                chamada.InciarCorreioVoz();
                chamada.desligarChamada();

                // Testar as funcionalidades de reprodução de música
                ReprodutorMusica reprodutorMusica = new ReprodutorMusica("iPhone 12", "Ultima Canção", "Paulo Sergio", 3, 27);
                reprodutorMusica.tocar();
                reprodutorMusica.pausar();

                // Testar as funcionalidades de navegação na Internet
                NavegarInternet navegador = new NavegarInternet("iPhone 12", "iOS");
                Paginas pagina1 = new Paginas("https://www.example.com", "exemplo");
                Paginas pagina2 = new Paginas("https://www.youtube.com.br", "Yotube");

                navegador.adicionarNovaAba(pagina1);
                navegador.adicionarNovaAba(pagina2);
                navegador.exibirPaginas();
                navegador.atualizarPaginas();

    }
}