import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Baraja baraja = new Baraja();
        Jugador banca;
        Juego juego;

        int numjugadores = 0;
        while (numjugadores<1 || numjugadores>6){
            numjugadores = Input.getInteger("¿Cuántos Jugaodres? ");
        }

        Jugador[] jugadores = new Jugador[numjugadores];
        int year = 2005;
        int month = 03;
        int day = 04;

        for (int i = 0; i < jugadores.length; i++) {
            String nombre = Input.getString("Introduce el nombre del jugador: ");
            jugadores[i] = new Jugador(nombre, LocalDate.of(year++,month++,day++));
        }

        juego.start(jugadores, baraja, banca);

    }






}
