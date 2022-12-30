package acciones;



import enumeradores.AlmacenAlimentos;
import modelos.Mascota;

public class Alimentarse {

    private AlmacenAlimentos comida;

    public void ingerirAlimento(AlmacenAlimentos comida , Mascota mascota) {

        if (mascota.isLive()) {

            System.out.println("Status mascota: " + mascota.isLive());

            mascota.setNivelEnergia(mascota.getNivelEnergia() + comida.getEnergiaAportada());
            contabilizarComida(mascota);
            System.out.println("Comidas ingeridas : " + mascota.getComidasIngeridas());
            System.out.println("Nivel de energía de la mascota: " + mascota.getNivelEnergia());
            System.out.println("Status mascota: " + mascota.isLive());
            System.out.println("La mascota debe evacuar " + mascota.getPopo().tieneQueEvacuar(mascota));
            if (mascota.getPopo().tieneQueEvacuar(mascota)){
                System.out.println("Pase por acá restando - 15");
                mascota.setNivelEnergia(mascota.getNivelEnergia() - 15);

                System.out.println("Status mascota: " + mascota.isLive());

                Morir.checkStatusGeneral(mascota);
                if (mascota.isLive()) {
                    System.out.println("Esta mascota necesita ir al baño ");
                }

            } else{
                Morir.checkStatusGeneral(mascota);

                System.out.println("Esta mascota necesita ir al baño");
            }
        } else {
            Morir.checkStatusGeneral(mascota);
            System.out.println("Lo siento, esta mascota no se encuentra operativa desde " + mascota.getFechaMuerte().toLocalDate());
        }

    }

    private void contabilizarComida(Mascota mascota) {
        mascota.setComidasIngeridas(mascota.getComidasIngeridas() + 1);
    }

}
