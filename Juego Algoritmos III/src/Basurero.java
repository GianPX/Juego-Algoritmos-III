import java.security.PublicKey;

public class Basurero implements Comodines<Pieza, ContainerPieza, Puntaje> {

    int vecesUsadoBasurero;

    public Basurero(int vecesUsadoBasurero) {
        this.vecesUsadoBasurero = vecesUsadoBasurero;
    }

    public void aplicar(Pieza c, ContainerPieza f, Puntaje p) {
        if (p.puntos >= (100 * this.vecesUsadoBasurero)) {
            f.delete(c);
            f.refill();
            p.setPuntos(p.puntos - (100 * this.vecesUsadoBasurero));
            this.vecesUsadoBasurero++;

        }

    }

    public int getPrecio(Puntaje p) {
        return 100 * this.vecesUsadoBasurero;
    }

}
