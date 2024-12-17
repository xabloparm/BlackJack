import static com.diogonunes.jcolor.Ansi.colorize;

public enum Numero {
    AS("A", new int[]{1,11}),
    DOS("2", new int[]{2}),
    TRES("3", new int[]{3}),
    CUATRO("4", new int[]{4}),
    CINCO("5", new int[]{5}),
    SEIS("6", new int[]{6}),
    SIETE("7", new int[]{7}),
    OCHO("8", new int[]{8}),
    NUEVE("9", new int[]{9}),
    DIEZ("10", new int[]{10}),
    JOTA("J", new int[]{10}),
    REINA("Q", new int[]{10}),
    REY("K", new int[]{10});

    // Atributos
    private final String num;
    private final int[] valor;

    // Constructor
    Numero(String simbolo, int[] valor) {
        this.num = simbolo;
        this.valor = valor;
    }

    // GETTERS

    public String getNum() {
        return num;
    }

    public int[] getValor() {
        return valor;
    }

    @Override
    public String toString(){
        return num;
    }
}
