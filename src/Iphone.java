import Apps.IPod;
import Apps.Safari;
import Apps.Telefone;

public class Iphone {
    public static void main(String[] args) throws Exception {
        Safari safari = new Safari();

        safari.adicionarNovaAba();
        safari.atualizarPagina();
        safari.exibirPagina();


        System.out.println("______________________________________________");

        IPod ipod = new IPod();

        ipod.selecionarMusica();
        ipod.pausar();

        System.out.println("______________________________________________");

        Telefone telefone = new Telefone();

        telefone.atender();
        telefone.ligar();

    }
}
