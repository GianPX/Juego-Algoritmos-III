import java.util.ArrayList;
import java.util.HashMap;

public class Casilla<E extends Ficha,D,V extends Vecindad> {
    //Attributes
    E ficha;
    V vecinos;
    //Constructor
    public Casilla(E ficha, V vecinos){
        this.ficha=ficha;
        this.vecinos=vecinos;
    }
    //Methods
    E getFicha(){
        return this.ficha;
    }
    void setFicha(E ficha){
        this.ficha=ficha;
    }

    public void insertar(Pieza pieza, E emptyFicha){
        if(this.insertable(pieza.getDistribucion(),pieza.getRecorrido(),pieza.getPosiciones(),emptyFicha)){
            this.insertar2(pieza.getDistribucion(),pieza.getRecorrido(),pieza.getPosiciones());
        }else System.out.println("No se puede insertar la pieza");
    }

    private boolean insertable(DistribucionPieza<D,E> distribucion, ArrayList<D> recorrido, ArrayList<D> posiciones,E emptyFicha){
        recorrido.remove(0);
        if(recorrido.size()>0){
            if(this.ficha.getValue().equals(emptyFicha.getValue()) || distribucion.get(posiciones.get(0)).getValue().equals(emptyFicha.getValue())){
                posiciones.remove(0);
                if(this.vecinos.get(recorrido.get(0)) != null)
                return this.vecinos.get(recorrido.get(0)).insertable(distribucion,recorrido,posiciones,emptyFicha);
                else return false;
            }else return false;
        }else {
            if(this.ficha.getValue().equals(emptyFicha.getValue()) || distribucion.get(posiciones.get(0)).getValue().equals(emptyFicha.getValue())) return true;
            else return false;
        }
    }

    private void insertar2(DistribucionPieza<D,E> distribucion, ArrayList<D> recorrido, ArrayList<D> posiciones){
        this.setFicha(distribucion.get(posiciones.get(0)));
        recorrido.remove(0);
        posiciones.remove(0);
        if(recorrido.size()>0){
            this.vecinos.get(recorrido.get(0)).insertar2(distribucion,recorrido,posiciones);
        }
    }

    public void setVecinos(V vecinos){
        this.vecinos=vecinos;
    }
}
