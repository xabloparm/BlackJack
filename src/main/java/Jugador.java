import java.time.LocalDate;
import java.util.Arrays;

public class Jugador {

    //ATRIBUTOS

    private String nombre;
    private LocalDate fechaNacimiento;
    private Carta[] mano;

    //CONSTRUCTOR

    public Jugador(String nombre, LocalDate fechaNacimiento){
        mano = new Carta[0];
        this.fechaNacimiento = fechaNacimiento;
        this.nombre = nombre;
    }

    public void anyadirCarta(Carta carta){
        mano = Arrays.copyOf(mano,mano.length+1);
        mano[mano.length-1] = carta;
    }


}
