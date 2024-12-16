import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        System.out.println("MOSTRAR LA BARAJA");
        Baraja baraja = new Baraja();
        System.out.println(baraja);
        System.out.println();

        System.out.println("Mostrar jugador");
        Jugador jugador = new Jugador("Xabi", LocalDate.of(2005,03,04));
        System.out.println(jugador);
        System.out.println();

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

    }
}
