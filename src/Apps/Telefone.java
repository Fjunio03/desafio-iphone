import java.util.Random;
import java.util.Scanner;

import Interfaces.AparelhoTelefonico;

public class Telefone implements AparelhoTelefonico {
    Scanner s = new Scanner(System.in);

    @Override
    public void ligar() {
        int tentativas = 0;
        boolean chamando = true;
        boolean atendeu = false;

        System.out.println("Qual o telefone que deseja fazer a ligação:");
        String telefone = s.next();

        verificarRede();
        System.out.println("Ligando para o número: " + telefone);

        do{
            atendeu = chamada();
            if(chamando){
                tentativas++;
            }else{
                System.out.println("Chamada atendida.");
            }
        }while(tentativas > 4);
        if(atendeu){
            System.out.println("Em contato com a pessoa do telefone: " + telefone);
        }else{
            System.out.println("Chamada não atendida, deseja deixar um correio de voz? S/N");
            String escolha = s.next();

            if(escolha.equals("S")){
                iniciarCorreioVoz();
            }else if(escolha.equals("N") ){
                System.out.println("Finalizando chamada");
            }
        }
    }

    @Override
    public void atender() {
        System.out.println("Você está recebendo uma ligação, deseja atender? S/N");
        String ligacao = s.next();

        if(ligacao.equals("S"))
            System.out.println("Ligaçao atendida");
        else if(ligacao.equals("N"))
            System.out.println("Ligacao Rejeitada");

    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Deixe a sua mensagem após o bipe e depois desligue para finalizar.");
    }
    private void verificarRede(){
        System.out.println("Verificando a rede via rádio");
    }

    private boolean chamada(){
        return new Random().nextInt(3)==1;
    }
}
