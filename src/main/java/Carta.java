public class Carta {

    //ATRIBUTOS

    private Palo palo;
    private Numero numero;

    //CONSTRUCTORES

    public Carta(Numero numero, Palo palo){
        this.palo = palo;
        this.numero = numero;
    }

    //GETTERS

    public Palo getPalo() {
        return palo;
    }
    public Numero getNumero() {
        return numero;
    }

    @Override
    public String toString(){
        return numero+" "+palo.toString();
    }
}