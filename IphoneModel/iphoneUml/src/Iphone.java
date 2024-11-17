
public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    public void tocar() {
        System.out.println("musica em execução");
    }
    public void pausar() {
        System.out.println("musica parada");
    }

    @Override
    public void selecionarMusica(String musica) {

    }

    public void selecionarMusica() {
        System.out.println("Insira Musica desejada");
    }
    public void ligar(String numero) {
        System.out.println("Telefone tocando");
    }
    public void atender() {
        System.out.println("Atender" );
    }
    public void iniciarCorreioVoz() {
        System.out.println("Gravando");
    }

    public void exibirPagina(String url) {
        System.out.println("Pagina carregada");
    }
    public void adicionarNovaAba() {
        System.out.println("adicionando aba");
    }
    public void atualizarPagina() {
        System.out.println("Recarregar a pagina");
    }
}
