package enumeradores;

public enum EntretenimientosEnum {

    KARAOKE(15), VIDEOJUEGO(25), CARTAS(20), AJEDREZ(5), CINE(25);

    private int desaburrimiento;

    EntretenimientosEnum(int desaburrimiento) {this.desaburrimiento = desaburrimiento; }

    public int getDesaburrimiento() {
        return this.desaburrimiento;
    }
}
