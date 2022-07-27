import java.util.HashMap;

public class Triangulo extends Vecindad<String,Casilla>{

    //Attributes

    //Constructor
    public Triangulo(){

    }
    public Triangulo(Casilla ... vecinos){
        if(vecinos[0] != null) this.add("iz",vecinos[0]);
        if(vecinos[1] != null) this.add("a",vecinos[1]);
        if(vecinos[2] != null) this.add("de",vecinos[2]);
    }
    //Methods
    public void putVecinos(Casilla ...vecinos){
        if(vecinos[0] != null) this.add("iz",vecinos[0]);
        if(vecinos[1] != null) this.add("a",vecinos[1]);
        if(vecinos[2] != null) this.add("de",vecinos[2]);
    }
}