public class Martillo implements Comodines<Ficha, Casilla, Puntaje> {
  int vecesUsadoMartillo;

  public Martillo(int vecesUsadoMartillo) {
    this.vecesUsadoMartillo = vecesUsadoMartillo;
  }

  public void aplicar(Ficha c, Casilla f, Puntaje p) {
    if (!(f.getFicha().getValue().equals(c.value))) {
      if (p.puntos >= (200 * this.vecesUsadoMartillo)) {
        f.setFicha(c);
        p.setPuntos(p.puntos - (200 * this.vecesUsadoMartillo));
        this.vecesUsadoMartillo++;
      }
    }
  }

  
  public int getPrecio(Puntaje p) {
      return 200 * this.vecesUsadoMartillo;
  }

}
