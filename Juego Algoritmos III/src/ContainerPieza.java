import java.util.ArrayList;
import java.util.Random;
public class ContainerPieza {
    //Attributes
    ArrayList<Pieza> piezas = new ArrayList<>();
    //Constructor
    public ContainerPieza(){

    }
    //Methods
    public int contPiezas(){
        return this.piezas.size();
    }
    public void showPiezas(){
        for(Pieza i : this.piezas){
            i.show();
            System.out.println();
        }
    }
    public void refill(CreadorPieza creador){
        if(this.contPiezas()<3){
            this.piezas.add(creador.createPieza());
        }
    }
}
