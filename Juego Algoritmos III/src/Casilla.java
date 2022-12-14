import java.util.ArrayList;
import java.util.HashMap;

public class Casilla<E extends Ficha, D, V extends Vecindad<D, Casilla>> {
    // Attributes
    E ficha;
    V vecinos;

    // Constructor
    public Casilla(E ficha, V vecinos) {
        this.ficha = ficha;
        this.vecinos = vecinos;
    }

    // Methods
    E getFicha() {
        return this.ficha;
    }

    void setFicha(E ficha) {
        this.ficha = ficha;
    }

    public void setVecinos(V vecinos) {
        this.vecinos = vecinos;
    }

    public boolean insertar(Pieza pieza, E emptyFicha) {
        if (this.insertable(pieza.getDistribucion(), pieza.getRecorrido(), pieza.getPosiciones(), emptyFicha)) {
            this.insertar2(pieza.getDistribucion(), pieza.getRecorrido(), pieza.getPosiciones(), emptyFicha);
            return true;
        } else {
            return false;
        }
    }

    public boolean insertable(DistribucionPieza<D, E> distribucion, ArrayList<D> recorrido, ArrayList<D> posiciones,
            E emptyFicha) {
        ArrayList<Casilla> casillas = this.recorrer(recorrido);
        if (casillas.size() == posiciones.size()) {
            for (Casilla<E, D, V> i : casillas) {
                E fichaP = distribucion.get(posiciones.get(0));
                posiciones.remove(0);
                E fichaC = i.getFicha();
                if (!(fichaP.igual(emptyFicha.getValue())
                        || fichaC.igual(emptyFicha.getValue()))) {
                    return false;
                }
            }
            return true;
        } else
            return false;
    }

    private void insertar2(DistribucionPieza<D, E> distribucion, ArrayList<D> recorrido, ArrayList<D> posiciones,
            E emptyFicha) {
        ArrayList<Casilla> casillas = this.recorrer(recorrido);
        for (Casilla<E, D, V> i : casillas) {
            if (!distribucion.get(posiciones.get(0)).igual(emptyFicha.value))
                i.setFicha(distribucion.get(posiciones.get(0)));
            posiciones.remove(0);
        }
    }

    public ArrayList<Casilla> recorrer(ArrayList<D> recorrido) {
        recorrido.remove(0);
        ArrayList<Casilla> lista = new ArrayList<>();
        if (recorrido.size() > 0) {
            D clave = recorrido.get(0);
            Casilla next = this.vecinos.get(clave);
            lista.add(this);
            if (next != null)
                lista.addAll(next.recorrer(recorrido));
            return lista;
        } else {
            lista.add(this);
            return lista;
        }
    }

    public void recorrerProfundidad(ArrayList visitados) {
        visitados.add(this);
        for (D i : this.vecinos.keySet()) {
            Casilla next = this.vecinos.get(i);
            if (!visitados.contains(next))
                next.recorrerProfundidad(visitados);
        }

    }

}
