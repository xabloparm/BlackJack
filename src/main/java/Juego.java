import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Juego {

    // ATRIBUTOS

    private Baraja baraja;
    private Jugador[] jugadores;
    private Jugador banca;

    //CONSTRUCTOR

    public Juego(Jugador[] jugadores){
        this.jugadores = jugadores;
        baraja = new Baraja();
        banca = new Jugador("Banca", LocalDate.now());
    }

}
