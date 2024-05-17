package Apps;
import java.util.Scanner;

import Interfaces.ReprodutorMusical;

public class IPod implements ReprodutorMusical{
    Scanner s = new Scanner(System.in);

    @Override
    public void tocar(String string) {
        System.out.println("Tocando a musica: " + string);
    }

    @Override
    public void pausar() {
        System.out.println("Pausando a musica");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Digite a musica que quer tocar:");
        String musica = s.next();
        verificarConexao();
        tocar(musica);
    }
    private void verificarConexao() {
        System.out.println("Verificando conexão com a rede...");
    }
    
}
