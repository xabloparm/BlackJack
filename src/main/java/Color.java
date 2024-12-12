import com.diogonunes.jcolor.Attribute;

public enum Color {
    ROJO(Attribute.RED_TEXT()),
    NEGRO(Attribute.BLACK_TEXT());


    //ATRIBUTOS

    private Attribute color;

    //CONSTRUCTORES

    private Color(Attribute color){
        this.color = color;
    }

    //GET

    public Attribute getColor() {
        return color;
    }

    //METODOS FUNCIONALES



}
