public class Puntaje {
    // Attributes
    int puntos;

    // Constructor
    public Puntaje(int puntos) {
        this.puntos = puntos;
    }

    //Methods
    public int contarPuntaje(Pieza pieza, int ch, Ficha emptyFicha) {

        this.puntos += pieza.getFichasPieza(emptyFicha);

        if (ch != 0) {
            this.puntos += 60 * ch * ch;
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