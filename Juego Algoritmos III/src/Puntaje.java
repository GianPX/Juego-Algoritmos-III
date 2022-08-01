
public class Puntaje {
    int puntos;


    public Puntaje(int puntos){
        this.puntos=puntos;
    }

    public int contarPuntaje(Pieza pieza, int ch, Ficha emptyFicha) {

        this.puntos += pieza.getFichasPieza(emptyFicha);

        if (ch != 0) {
            this.puntos += 60 *ch*ch;
        }

        return this.puntos;
    }
    

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }


    public int getPuntos() {
        return this.puntos;
    }

}
