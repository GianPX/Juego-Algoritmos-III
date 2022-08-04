import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public abstract class DistribucionPieza<D,F extends Ficha>{
    //Attributes
    HashMap<D,F> mapa = new HashMap<D,F>();
    int constanteMatches;
    int constanteRotaciones;
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
    public int getConstanteM(){
        return this.constanteMatches;
    }
    public int getConstanteR(){
        return this.constanteRotaciones;
    }
    public void putAll(DistribucionPieza distribucion){
        this.mapa.putAll(distribucion.mapa);
    }
    public abstract ArrayList<D> recorrido();
    public abstract ArrayList<D> posiciones();

    public void clear(){
        this.mapa.clear();
    }
}
