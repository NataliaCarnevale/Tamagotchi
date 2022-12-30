package enumeradores;

public enum AlmacenAlimentos {

    CHIPA(15), PANQUEQUE(25), BIFE(10), EMPANADA(20), PIZZA(5);


    private int energiaAportada;

    AlmacenAlimentos(int energia) {

        this.energiaAportada = energia;
    }

    public int getEnergiaAportada() {

        return energiaAportada;
    }




}