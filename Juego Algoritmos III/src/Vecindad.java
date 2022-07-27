import java.util.HashMap;
import java.util.Set;

public class Vecindad<D,C extends Casilla> {
    //Attributes
    HashMap<D,C> mapa = new HashMap<D,C>();
    //Constructor
    public Vecindad(HashMap<D,C> mapa){
        this.mapa=mapa;
    }
    public Vecindad(C ... vecinos){

    }
    //Methods
    void add(D direccion, C forma){
        mapa.put(direccion,forma);
    }
    C get(D direccion){
        return mapa.get(direccion);
    }
    public void putVecinos(C ...vecinos){
    }
    public Set keySet(){
        return mapa.keySet();
    }
}
