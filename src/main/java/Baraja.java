import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Baraja {

    //ATRIBUTOS

    private Palo palo;
    private Carta carta;
    private Carta[] baraja;

    //CONSTRUCTOR

    public Baraja(){
        int pos = 0;
        baraja = new Carta[Palo.values().length*Numero.values().length];
        for (Palo palo:Palo.values()){
            for (Numero numero: Numero.values()) {
                baraja[pos++] = new Carta(numero,palo);
            }
        }
        barajar();
    }

    //METODOS FUNCIONALES

    private void barajar(){
        List<Carta> ListaCartas = Arrays.asList(baraja);
        Collections.shuffle(ListaCartas);
        ListaCartas.toArray(baraja);
    }
    public Carta repartirEncima(){
        Carta carta = null;
        if (baraja.length>0) {
            carta = baraja[0];
            baraja = Arrays.copyOfRange(baraja, 1, baraja.length);
        }
        return carta;
    }
    public Carta repartirDebajo(){
        Carta carta = null;
        if (baraja.length>0) {
            carta = baraja[baraja.length-1];
            baraja = Arrays.copyOfRange(baraja, 0, baraja.length-1);
        }
        return carta;
    }

    @Override
    public String toString(){
        return Arrays.toString(baraja);
    }

}