import enumeradores.AlmacenAlimentos;
import enumeradores.EntretenimientosEnum;
import modelos.Mascota;
import modelos.DukeMascota;
import persistencia.persistenceCollections.MascotaPersistenceUseList;
import utils.actas.RegistroCivilMascotas;

import java.time.LocalDateTime;
import java.time.LocalTime;

class Main {

    public static void main(String[] args) {

        MascotaPersistenceUseList persistence = new MascotaPersistenceUseList();

        DukeMascota duke = new DukeMascota("Duke-Clara", "Naty");

        DukeMascota duke2 = new DukeMascota("Duke-Lola", "Naty");

        DukeMascota duke3 = new DukeMascota("Duke-Jorge", "Naty");

        DukeMascota duke4 = new DukeMascota("Duke-Pepe", "Naty");


        persistence.guardar(duke);

        persistence.guardar(duke2);

        persistence.guardar(duke3);

        persistence.guardar(duke4);

        duke.comer(AlmacenAlimentos.PIZZA);
        duke.comer(AlmacenAlimentos.PIZZA);
        duke.comer(AlmacenAlimentos.PIZZA);
        duke.comer(AlmacenAlimentos.PIZZA);
        duke.comer(AlmacenAlimentos.PIZZA);
        duke.comer(AlmacenAlimentos.PIZZA);
        duke.comer(AlmacenAlimentos.PIZZA);
        duke.comer(AlmacenAlimentos.PIZZA);
        duke.comer(AlmacenAlimentos.PIZZA);
        duke.comer(AlmacenAlimentos.PIZZA);

        RegistroCivilMascotas.confeccionarActa(duke);
        RegistroCivilMascotas.guardarActa(duke);


    }
}
