package cartas;

import java.util.HashMap;

public class Baralho {

    private HashMap<Integer, Cartas> baralho = new HashMap<>();
    private int counter = 0;

    public Baralho(){
        for (int i = 1; i <= 10; i++){
            for (int y = 0; y<4; y++){
                switch (y){
                    case 0:
                        if (i <= 7){
                            baralho.put(counter++,new Cartas(Naipe.PAUS,i));
                        }else{
                            baralho.put(counter++,new Cartas(Naipe.PAUS,i+3));
                        }
                        break;
                    case 1:
                        if(i <= 7){
                            baralho.put(counter++,new Cartas(Naipe.COPAS,i));
                        }else{
                            baralho.put(counter++,new Cartas(Naipe.COPAS,i+3));
                        }
                        break;
                    case 2:
                        if(i <= 7){
                            baralho.put(counter++,new Cartas(Naipe.ESPADAS,i));
                        }else{
                            baralho.put(counter++,new Cartas(Naipe.ESPADAS,i+3));
                        }
                        break;
                    case 3:
                        if(i <= 7){
                            baralho.put(counter++,new Cartas(Naipe.OUROS,i));
                        }else{
                            baralho.put(counter++,new Cartas(Naipe.OUROS,i+3));
                        }
                        break;
                    default:
                        break;
                }
            }
        }

    }


    public HashMap<Integer, Cartas> getBaralho() {
        return baralho;
    }



    public void print(){
        for (Cartas c : baralho.values()){
            System.out.println(c);
        }
    }

    public void size(){
        System.out.println(baralho.size());
    }

    public void remove(){

    }
}
