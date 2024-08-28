package jogo;

import java.util.ArrayList;
import java.util.List;

import cartas.Cartas;

public class Jogador {
    
    private String nome;
    private List<Cartas> cartas = new ArrayList<>();
    private Integer ponto = 0;

    public Jogador(String nome) {
        this.nome = nome;
    }

    public List<Cartas> getCartas() {
        return cartas;
    }

    public void setCartas(List<Cartas> cartas) {
        this.cartas = cartas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getPonto() {
        return ponto;
    }

    public void setPonto(){
        this.ponto +=1;
    }

    public void addCarta(Cartas carta){
        cartas.add(carta);
    }

    public void clearCarta(){
        cartas.clear();
    }

    public int selectCard(int num){
        return cartas.get(num-1).getValue();
    }
    
}
