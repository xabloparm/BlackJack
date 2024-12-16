import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Juego {

    // Atributos
    private List<Carta> mazo;
    private int puntuacionJugador;

    // Constructor
    public Juego() {
        mazo = new ArrayList<>();
        inicializarMazo();
        barajarMazo();
        puntuacionJugador = 0;
        System.out.println("Juego inicializado.");
    }

    // Método para inicializar el mazo
    private void inicializarMazo() {
        for (Palo palo : Palo.values()) {
            for (Numero numero : Numero.values()) {
                mazo.add(new Carta(numero, palo));
                System.out.println("Añadida carta: " + numero.getSimbolo() + " de " + palo);
            }
        }
    }

    // Método para barajar el mazo
    private void barajarMazo() {
        Collections.shuffle(mazo);
        System.out.println("Mazo barajado.");
    }

    // Método para robar una carta
    public void robarCarta() {
        if (!mazo.isEmpty()) {
            Carta carta = mazo.remove(0);
            puntuacionJugador += carta.getNumero().getValor();
            System.out.println("Has robado: " + carta);
            System.out.println("Tu puntuación actual es: " + puntuacionJugador);
        } else {
            System.out.println("El mazo está vacío. No se pueden robar más cartas.");
        }
    }

    // Método para obtener la puntuación actual del jugador
    public int getPuntuacionJugador() {
        return puntuacionJugador;
    }

    // Clase interna para representar una carta
    private static class Carta {
        private final Numero numero;
        private final Palo palo;

        public Carta(Numero numero, Palo palo) {
            this.numero = numero;
            this.palo = palo;
        }

        public Numero getNumero() {
            return numero;
        }

        public Palo getPalo() {
            return palo;
        }

        @Override
        public String toString() {
            return numero.getSimbolo() + " de " + palo;
        }
    }

    // Método principal para probar el juego
    public static void main(String[] args) {
        Juego juego = new Juego();

        System.out.println("Comienza el juego.");
        juego.robarCarta();
        juego.robarCarta();
        juego.robarCarta();

        System.out.println("Puntuación final del jugador: " + juego.getPuntuacionJugador());
    }
}
