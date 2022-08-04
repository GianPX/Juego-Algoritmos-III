import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Pieza<F extends Ficha, Dist extends DistribucionPieza, D> {
    // Attributes
    Dist distribucion;

    // Constructor
    public Pieza(Dist distribucion) {
        this.distribucion = distribucion;
    }
    public Pieza(){}
    // Methods
    public void setDistribucion(F fichas) {
        this.distribucion.setDistribucion(fichas);
    }
    public void setDistribucion(Dist d) {
        this.distribucion.putAll(d);
    }
    public void show() {
        ArrayList<D> recorrido = this.getPosiciones();
        for (D i : recorrido) {
            System.out.println(this.distribucion.get(i).getValue());
        }
    }

    public Dist getDistribucion() {
        return this.distribucion;
    }

    public ArrayList<D> getPosiciones() {
        return this.distribucion.posiciones();
    }

    public ArrayList<D> getRecorrido() {
        return this.distribucion.recorrido();
    }

    public void rotate() {
        this.distribucion.rotate();
    }

    public int getFichasPieza(Ficha emptyFicha) {
        int cont = 0;
        ArrayList<D> recorrido = this.getPosiciones();
        for (D u : recorrido) {
            if (!(this.distribucion.get(u).igual(emptyFicha.getValue()))) {
                cont += 1;
            }

        }
        return cont;
    }
    public int getConstanteR(){
        return this.distribucion.getConstanteR();
    }

}
