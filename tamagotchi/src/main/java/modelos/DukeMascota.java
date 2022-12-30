package modelos;

public class DukeMascota  extends  Mascota {

    private static int count;

    public DukeMascota(String nombre, String propietario) {
        super(nombre, propietario);
        this.id = ++count;
    }

    public static int getCount() {
        return count;
    }

    public String toString () {
        return "La Mascota de nombre : " + nombre + '\n'
                + "nació el día " + fechaNacimiento.getDayOfWeek() + ", "
                + fechaNacimiento.getDayOfMonth() + " de "
                + fechaNacimiento.getMonth() + " del año "
                + fechaNacimiento.getYear() + '\n'
                + "a la hora : "  + fechaNacimiento.getHour() + ":"
                + fechaNacimiento.getMinute() + '\n'
                + "actualmente se encuentra " + ((isLive) ? "vivo\n" : "muerto\n")
                + "su nivel de energía se encuentra en : " + nivelEnergia + "%\n"
                + "el nivel de hambre en : " + nivelHambre + '\n'
                + "el nivel de cansancio en : " + nivelCansancio + '\n'
                + "el nivel de aburrimiento en : " + nivelAburrimiento + '\n'
                + "el nivel de felicidad en : " + nivelFelicidad + '\n'
                + "y su actual propietario/a es : " + propietario + '\n';


    }

}
