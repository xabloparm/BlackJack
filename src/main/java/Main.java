import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //Jugadores máximo 6
        int numJugadores = 0;
        while(numJugadores<1 || numJugadores>6){
            numJugadores = Input.getInteger("¿Cuántos jugadores?: ");
        }
        Jugador[] jugadores = new Jugador[numJugadores];

        int year = 1987;
        int month = 5;
        int day = 1;
        //pedir nombre de los jugadores, la fecha de nacimiento la ponéis a mano
        for (int i = 0; i < jugadores.length; i++) {
            String nombre = Input.getString("Dame el nombre del jugador " + i+": ");
            jugadores[i] = new Jugador(nombre, LocalDate.of(year++,month++,day++));
        }
        Juego juego = new Juego(jugadores);
        juego.start();
    }
}