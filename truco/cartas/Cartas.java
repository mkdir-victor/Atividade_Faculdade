package cartas;

public class Cartas {

    private Naipe naipe;
    private Integer value;

    public Cartas(Naipe naipe, Integer value) {
        this.naipe = naipe;
        this.value = value;
    }

    public Naipe getNaipe() {
        return naipe;
    }

    public void setNaipe(Naipe naipe) {
        this.naipe = naipe;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Cartas{" +
                "naipe=" + naipe +
                ", value=" + value +
                '}';
    }
}
