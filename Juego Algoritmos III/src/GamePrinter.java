import java.util.Set;

public class GamePrinter {
    //Atributes

    //Constructor

    //Methods
    private static void limpiar(){
        limpiar();
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public void printGame(ContainerPieza container, Casilla ... casillas){
        this.printTablero(casillas);
        this.printPiezas(container);
    }
    private void printTablero(Casilla ... casillas){
        
        System.out.print("    ");
        printFila(casillas[0]);
        System.out.println("");
        System.out.print("  ");
        printFila(casillas[1]);
        System.out.println("");
        printFila(casillas[2]);
        System.out.println("");
        printFila(casillas[3]);
        System.out.println("");
        System.out.print("  ");
        printFila(casillas[4]);
        System.out.println("");
        System.out.print("    ");
        printFila(casillas[5]);
        System.out.println("");
    }
    private void printFila(Casilla c){
        System.out.print(c.getFicha().getValue()+" ");
        if(c.vecinos.get("de") != null){
            printFila(c.vecinos.get("de"));
        }
    }
    private void printPiezas(ContainerPieza container){
        for(Pieza i : container.getPiezas()){
            this.printPieza(i.getDistribucion());
        }
    }
    private void printPieza(DistribucionPieza distribucion){
        System.out.println(" ");
        System.out.print(distribucion.get("arriba-iz").getValue()+" ");
        System.out.print(distribucion.get("arriba").getValue()+" ");
        System.out.println(distribucion.get("arriba-de").getValue());
        System.out.print(distribucion.get("abajo-iz").getValue()+" ");
        System.out.print(distribucion.get("abajo").getValue()+" ");
        System.out.println(distribucion.get("abajo-de").getValue());
    }
}
