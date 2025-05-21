public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{
    @Override
    public void tocar() {
        System.out.println("Reproduzindo Musica!");
    }

    @Override
    public void pausar() {
        System.out.println("Musica Pausada!");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Musica " + musica + " selecionada.");

    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo pagina "+url);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina atual!");
    }
    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada");
    }

    @Override
    public void ligar(String numero){
        System.out.println("Ligando para "+numero+" agora");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligacao");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

}