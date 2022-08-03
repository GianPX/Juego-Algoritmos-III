import java.util.ArrayList;

public class GameEnder {
    //Attributes

    //Constructor

    //Methods
    public boolean endGame(Casilla c, Ficha emptyFicha, ArrayList<Pieza>piezas){
        ArrayList<Casilla> lista = new ArrayList<>();
        Pieza piezaPrueba= new Pieza();
        c.recorrerProfundidad(lista);
        for(Pieza k : piezas){
            piezaPrueba.setDistribucion(k.getDistribucion());
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
