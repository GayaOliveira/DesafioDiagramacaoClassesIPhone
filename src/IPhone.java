public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{
    @Override
    public void tocar() {
        System.out.println("O iPhone está tocando uma música!");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada no iPhone.");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Música selecionada no iPhone.");
    }

    @Override
    public void ligar() {
        System.out.println("O iPhone está fazendo uma ligação!");
    }

    @Override
    public void atender() {
        System.out.println("O iPhone está atendendo a uma ligação!");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("O correio de voz está sendo iniciado pelo iPhone.");
    }

    @Override
    public void exibirPagina() {
        System.out.println("O Safari está exibindo uma página no iPhone.");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Uma nova aba foi adicionada no Safari do iPhone.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("A página foi atualizada no Safari do iPhone.");
    }
}
