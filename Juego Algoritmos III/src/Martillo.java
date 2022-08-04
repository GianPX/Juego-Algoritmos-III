public class Martillo extends Comodines<Ficha, Casilla, Puntaje> {
  // Attributes

  // Constructor
  public Martillo(int precio) {
    super(precio);
  }

  // Methods
  public void aplicar(Ficha c, Casilla f, Puntaje p) {
    if (!(f.getFicha().getValue().equals(c.value))) {
      if (p.puntos >= (this.precioInicial * this.vecesutilizado)) {
        f.setFicha(c);
        p.setPuntos(p.puntos - (this.precioInicial * this.vecesutilizado));
        this.vecesutilizado++;
      }
    }
  }

  public int getPrecio(Puntaje p) {
    return this.precioInicial * this.vecesutilizado;
  }

}
