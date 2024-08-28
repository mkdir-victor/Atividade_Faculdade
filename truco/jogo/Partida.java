package jogo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import cartas.Baralho;


public class Partida {
    
    private Jogador jogador;
    private static Random rand = new Random();
    private Baralho baralho = new Baralho();
    private List<Integer> list = new ArrayList<>();

    
    private int randNum(){
        return rand.nextInt(40)+1;
    }

    public boolean darCarta(Jogador j){
        int num = randNum();

        if (!list.contains(num)) {
            j.addCarta(baralho.getBaralho().get(num));
            list.add(num);
            return true;
        }else{
            return false;
        }
    }

    public void darTrezCartas(Jogador j){
        for(int i = 0; i<3; i++){
            while (!darCarta(j)) {
            }
        }
    }

    public void novaRodada(){
        list.clear();
        jogador.clearCarta();
    }

    
    public void vencedor(Jogador j1, Integer p1, Jogador j2, Integer p2){

        if (p1 == 3 || p1 == 2 || p1 == 1) {
            p1 += 13;
        }

        if (p2 == 3 || p2 == 2 || p2 == 1) {
            p2 += 13;
        }

        if (p1 > p2) {
            System.out.println("Vencedor:"+j1.getNome());
            j1.setPonto();
        }else{
            System.out.println("Vencedor:"+j2.getNome());
            j2.setPonto();
        }

        
    }
}
