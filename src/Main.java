public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        // Testando Reprodutor Musical
        iphone.selecionarMusica("Imagine - John Lennon");
        iphone.tocar();
        iphone.pausar();

        // Testando Aparelho Telefônico
        iphone.ligar("11999998888");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        // Testando Navegador na Internet
        iphone.exibirPagina("https://www.apple.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}