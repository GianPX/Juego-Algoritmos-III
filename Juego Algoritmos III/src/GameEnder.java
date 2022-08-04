import java.util.ArrayList;

public class GameEnder {
    //Attributes

    //Constructor

    //Methods
    public boolean endGame(Casilla c, Ficha emptyFicha, ArrayList<Pieza>piezas, DistribucionPieza distribucion){
        ArrayList<Casilla> lista = new ArrayList<>();
        Pieza piezaPrueba= new Pieza(distribucion);
        c.recorrerProfundidad(lista);
        for(Pieza k : piezas){
            distribucion.clear();
            distribucion.putAll(k.getDistribucion());
            for(Casilla i : lista){
                for(int j=1;j<=piezaPrueba.getConstanteR();j++){
                    if(i.insertable(piezaPrueba.getDistribucion(), piezaPrueba.getRecorrido(), piezaPrueba.getPosiciones(), emptyFicha)) return true;
                    piezaPrueba.rotate();
                }
            }
        }
        return false;
    }
}
