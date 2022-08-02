import java.util.ArrayList;
import java.util.HashMap;

public class DistHexagono extends DistribucionPieza<String,Ficha>{
    //Attributes
    
    //Constructor
    DistHexagono(Ficha ... fichas){
        this.constanteMatches = 2;
        this.constanteRotaciones = 6;
        this.mapa.put("arriba",fichas[0]);
        this.mapa.put("arriba-de",fichas[1]);
        this.mapa.put("abajo-de",fichas[2]);
        this.mapa.put("abajo",fichas[3]);
        this.mapa.put("abajo-iz",fichas[4]);
        this.mapa.put("arriba-iz",fichas[5]);
    }
    //Methods
    public void rotate(){
        ArrayList<Ficha> lista = new ArrayList<>();
        lista.add(this.get("arriba-iz"));
        lista.add(this.get("arriba"));
        lista.add(this.get("arriba-de"));
        lista.add(this.get("abajo-de"));
        lista.add(this.get("abajo"));
        lista.add(this.get("abajo-iz"));

        this.setDistribucion(lista);

    }
    public void setDistribucion(ArrayList<Ficha> fichas){
        this.add("arriba",fichas.get(0));
        this.add("arriba-de",fichas.get(1));
        this.add("abajo-de",fichas.get(2));
        this.add("abajo",fichas.get(3));
        this.add("abajo-iz",fichas.get(4));
        this.add("arriba-iz",fichas.get(5));

    }
    public ArrayList<String> recorrido(){
        ArrayList<String> recorrido = new ArrayList<>();
        recorrido.add("a");
        recorrido.add("de");
        recorrido.add("a");
        recorrido.add("iz");
        recorrido.add("iz");
        recorrido.add("a");
        return recorrido;
    }

    public ArrayList<String> posiciones(){
        ArrayList<String> posiciones = new ArrayList<>();
        posiciones.add("arriba");
        posiciones.add("arriba-de");
        posiciones.add("abajo-de");
        posiciones.add("abajo");
        posiciones.add("abajo-iz");
        posiciones.add("arriba-iz");
        return posiciones;
    }
}