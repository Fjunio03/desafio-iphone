import java.util.Scanner;

public class Safari implements NavegadorInternet{

    Scanner s = new Scanner(System.in);

    @Override
    public void exibirPagina() {
        System.out.println("Digite o site que quer navegar:");
        String site = s.next();

        System.out.println("Entrando no Site: " + site);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrindo uma nova aba vazia");
    }

    @Override
    public void atualizarPagina() {
        verificarConexao();
        System.out.println("Atualizando a página.");
    }

    private void verificarConexao() {
        System.out.println("Verificando conexão com a rede...");
    }
    
}
