import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public abstract class DistribucionPieza<D,F extends Ficha> implements RecorridoYPosicion {
    //Attributes
    HashMap<D,F> mapa = new HashMap<D,F>();
    //Methods
    public void add(D direccion,F f){
        this.mapa.put(direccion,f);
    }
    public Set<D> keySet(){
        return this.mapa.keySet();
    }
    F get(D direccion){
        return this.mapa.get(direccion);
    }
    public void rotate(){

    }
    public void setDistribucion(F...f){

    }
}
