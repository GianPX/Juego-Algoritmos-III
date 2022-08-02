import java.util.ArrayList;
import java.util.Random;
public class ContainerPieza {
    //Attributes
    int cantidadPiezas;
    ArrayList<Pieza> piezas = new ArrayList<>();
    CreadorPieza creador = new CreadorHexagono();
    //Constructor
    public ContainerPieza(int cantidad){
        this.cantidadPiezas=cantidad;
        this.refill();
    }
    //Methods
    public Pieza get(int index){
        return this.piezas.get(index);
    }
    public int contPiezas(){
        return this.piezas.size();
    }
    public void showPiezas(){
        for(Pieza i : this.piezas){
            i.show();
            System.out.println();
        }
    }
    public void refill(){
        while(this.contPiezas()<this.cantidadPiezas){
            this.piezas.add(this.creador.createPieza());
        }
    }
    public void delete(Pieza pieza){
        this.piezas.remove(pieza);
    }

    public ArrayList<Pieza> getPiezas(){
        return this.piezas;
    }
}
