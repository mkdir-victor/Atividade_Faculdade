
import java.util.Scanner;

import jogo.Jogador;
import jogo.Partida;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Partida p = new Partida();
        Jogador j1 = new Jogador("Teste");
        Jogador j2 = new Jogador("Teste 2");

        for(int i = 0; i<12; i++){

            System.out.print(j1.getNome()+":");
            //p.darCarta(j1);
            //p.darCarta(j1);
            //p.darCarta(j1);
            p.darTrezCartas(j1);
            System.out.println(j1.getCartas());

            System.out.print(j2.getNome()+":");
            //p.darCarta(j2);
            //p.darCarta(j2);
            //p.darCarta(j2);
            p.darTrezCartas(j2);
            System.out.println(j2.getCartas());

            System.out.println(j1.getNome()+" Escoha qual carta vai jogar");
            int v1 = input.nextInt();

            System.out.println(j2.getNome()+" Escoha qual carta vai jogar");
            int v2 = input.nextInt();

            p.vencedor(j1, v1, j2, v2);

            System.out.println(j1.getNome()+":  "+j1.getPonto()+" Pontos");
            System.out.println(j2.getNome()+":  "+j2.getPonto()+" Pontos");

        }
    }
}
