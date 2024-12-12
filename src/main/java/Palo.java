import static com.diogonunes.jcolor.Ansi.colorize;

public enum Palo {
    PICA(Color.NEGRO,"\u2660"),
    DIAMANTE(Color.ROJO,"\u2666"),
    TREBOL(Color.NEGRO,"\u2663"),
    CORAZON(Color.ROJO,"\u2665");

    //ATRIBUTOS

    private Color color;
    private String palo;

    //CONSTRUCTOR

    Palo(Color color, String palo){
        this.color = color;
        this.palo = palo;
    }

    @Override
    public String toString(){
        return colorize(palo,color.getColor());
    }


}
