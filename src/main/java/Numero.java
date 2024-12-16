import static com.diogonunes.jcolor.Ansi.colorize;

public enum Numero {
    AS("A", 1),
    DOS("2", 2),
    TRES("3", 3),
    CUATRO("4", 4),
    CINCO("5", 5),
    SEIS("6", 6),
    SIETE("7", 7),
    OCHO("8", 8),
    NUEVE("9", 9),
    DIEZ("10", 10),
    JOTA("J", 10),
    REINA("Q", 10),
    REY("K", 10);

    // Atributos
    private final String num;
    private final int valor;

    // Constructor
    Numero(String simbolo, int valor) {
        this.num = simbolo;
        this.valor = valor;
    }

    // Métodos
    public String getNum() {
        return num;
    }

    public int getValor() {
        return valor;
    }

    @Override
    public String toString(){
        return num;
    }
}
