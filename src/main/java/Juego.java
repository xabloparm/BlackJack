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

    public void start(Jugador[] jugadores, Baraja baraja, Jugador banca){

        repartoInicial(jugadores, baraja,banca);
        repartoInicial(jugadores, baraja,banca);

        for (Jugador jugador: jugadores){
            juegaJugador(jugador,baraja);
        }


    }

    private void repartoInicial(Jugador[] jugadores, Baraja baraja, Jugador banca){
        System.out.println("Reparto inicial: ");

        banca.anyadirCarta(baraja.repartirEncima());

        for (Jugador jugador: jugadores){
            jugador.anyadirCarta(baraja.repartirEncima());
        }
    }

    public void juegaJugador(Jugador jugador, Baraja baraja){
        System.out.println("Turno de: "+ jugador.getNombre());
        System.out.println(jugador);
        char option0 =
                Input.getString("Otra carta? (Y para si, cualquier otro carácter para no: )")
                        .toUpperCase().charAt(0);

        while (option0== 'Y' && jugador.getPuntuación()>=0){
            jugador.anyadirCarta(baraja.repartirEncima());
            System.out.println(jugador);
            if (jugador.getPuntuación()>=0) {
                char option1 =
                        Input.getString("Otra carta? (Y para si, cualquier otro carácter para no: )")
                                .toUpperCase().charAt(0);
            }else {
                System.out.println(jugador.getNombre()+" te has pasado!!!");
            }
        }
    }

    public void juegaBanca(Jugador banca, Baraja baraja){
        int maxPuntuación = maxPuntuaciónJugadores();

        System.out.println("Turno de la banca: ");

        while (banca.getPuntuación()>maxPuntuación){
            banca.anyadirCarta(baraja.repartirEncima());
            System.out.println(banca);
            if (banca.getPuntuación()<0){
                System.out.println("La banca se ha pasado.");
            }
        }
    }

    private int maxPuntuaciónJugadores(){
        int mayor = Integer. MIN_VALUE;
        for (Jugador jugador: jugadores){
            if (jugador.getPuntuación()>mayor){
                mayor = jugador.getPuntuación();
            }
        }
        return mayor;
    }

}
