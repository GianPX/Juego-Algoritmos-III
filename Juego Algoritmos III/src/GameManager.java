import java.util.ArrayList;

public class GameManager{
    //Attributes

    //Constructor
    GameManager(){

    }
    //Methods
    public void play(Casilla casilla, Pieza pieza, Matcher matcher, ContainerPieza container, Ficha emptyFicha, DistribucionPieza emptyDist){
        if(casilla.insertar(pieza, emptyFicha)){
            int matches = matcher.contarMatches(casilla, emptyDist, emptyFicha);
            container.delete(pieza);
            pieza = null;
            container.refill();
            
        }

    }
}
