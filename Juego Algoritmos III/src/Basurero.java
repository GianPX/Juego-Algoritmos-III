import java.security.PublicKey;

public class Basurero extends Comodines<Pieza, ContainerPieza, Puntaje> {
    //Attributes

    //Constructor
    public Basurero(int precio) {
        super(precio);
    }
    //Methods
    public void aplicar(Pieza c, ContainerPieza f, Puntaje p) {
        if (p.puntos >= (this.precioInicial * this.vecesutilizado)) {
            f.delete(c);
            f.refill();
            p.setPuntos(p.puntos - (this.precioInicial * this.vecesutilizado));
            this.vecesutilizado++;

        }

    }

    public int getPrecio(Puntaje p) {
        return this.precioInicial * this.vecesutilizado;
    }

}
