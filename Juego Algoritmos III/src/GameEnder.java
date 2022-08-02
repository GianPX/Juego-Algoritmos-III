import java.util.ArrayList;

public class GameEnder {
    //Attributes

    //Constructor

    //Methods
    public boolean endGame(Casilla c, Ficha emptyFicha, ArrayList<Pieza>piezas){
        ArrayList<Casilla> lista = new ArrayList<>();
        c.recorrerProfundidad(lista);
        for(Pieza k : piezas){
            for(Casilla i : lista){
                for(int j=1;j<=k.getConstanteR();j++){
                    if(i.insertable(k.getDistribucion(), k.getRecorrido(), k.getPosiciones(), emptyFicha)) return true;
                    k.rotate();
                }
            }
        }
        return false;
    }
}
