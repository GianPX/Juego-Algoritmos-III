import java.util.ArrayList;

public class Matcher<E extends Ficha, C extends Casilla<E, D, V>, V extends Vecindad<D, Casilla>, D, Dist extends DistribucionPieza<D, E>> {
    // Attributes

    // Constructor
    Matcher() {

    }

    // Methods
    public int contarMatches(C c, Dist emptyDist, E emptyFicha) {
        ArrayList<C> lista = new ArrayList<C>();
        c.recorrerProfundidad(lista);
        int cont = 0;
        for (C i : lista) {
            if (!i.getFicha().getValue().equals(emptyFicha.getValue())) {
                if (this.match(i, emptyDist.recorrido(), i.getFicha()))
                    cont++;
            }
        }
        return cont / emptyDist.getConstanteM();
    }

    private boolean match(C c, ArrayList<D> recorrido, E ficha) {
        int size = recorrido.size();
        ArrayList<Casilla> lista = c.recorrer(recorrido);
        if (lista.size() == size) {
            for (Casilla i : lista) {
                if (!i.getFicha().getValue().equals(ficha.getValue()))
                    return false;
            }
            return true;
        } else
            return false;
    }

    public void borrarMatches(C c, Dist emptyDist, E emptyFicha) {
        ArrayList<C> lista = new ArrayList<C>();
        ArrayList<Casilla> listaBorrar = new ArrayList<Casilla>();
        c.recorrerProfundidad(lista);
        for (C i : lista) {
            if (!i.getFicha().getValue().equals(emptyFicha.getValue())) {
                if (this.match(i, emptyDist.recorrido(), i.getFicha()))
                    listaBorrar.addAll(i.recorrer(emptyDist.recorrido()));
            }
        }
        for (Casilla j : listaBorrar) {
            j.ficha.setValue(emptyFicha.getValue());
        }
    }
}
