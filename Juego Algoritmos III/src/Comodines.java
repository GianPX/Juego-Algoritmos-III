public abstract class Comodines<C, F, P> {
    // Attributes
    int vecesutilizado;
    int precioInicial;

    // Constructor
    public Comodines(int precioinicial) {
        this.vecesutilizado = 1;
        this.precioInicial = precioinicial;
    }

    // Methods
    public abstract void aplicar(C c, F f, P p);

    public abstract int getPrecio(P p);
}
