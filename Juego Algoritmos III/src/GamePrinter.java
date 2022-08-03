import java.util.Set;

public class GamePrinter {
    //Atributes

    //Constructor

    //Methods
    private static void limpiar(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public void printGame(ContainerPieza container,Puntaje puntaje, Comodines m,Comodines b,Casilla ... casillas){
        this.printPuntaje(puntaje);
        this.printTablero(casillas);
        System.out.println();
        this.printPiezas(container);
        System.out.println();
        System.out.println("4. Rotar");
        System.out.println("5. Martillo ("+ m.getPrecio(puntaje)+")");
        System.out.println("6. Basura ("+ b.getPrecio(puntaje)+")");
        System.out.println();
    }
    
    private void printPuntaje(Puntaje puntaje){
        System.out.println("Score: "+puntaje.getPuntos());
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
        System.out.print("1. "+container.getPiezas().get(0).getDistribucion().get("arriba-iz").getValue());
        System.out.print(" "+container.getPiezas().get(0).getDistribucion().get("arriba").getValue());
        System.out.print(" "+container.getPiezas().get(0).getDistribucion().get("arriba-de").getValue()+"   ");

        System.out.print("2. "+container.getPiezas().get(1).getDistribucion().get("arriba-iz").getValue());
        System.out.print(" "+container.getPiezas().get(1).getDistribucion().get("arriba").getValue());
        System.out.print(" "+container.getPiezas().get(1).getDistribucion().get("arriba-de").getValue()+"   ");

        System.out.print("3. "+container.getPiezas().get(2).getDistribucion().get("arriba-iz").getValue());
        System.out.print(" "+container.getPiezas().get(2).getDistribucion().get("arriba").getValue());
        System.out.println(" "+container.getPiezas().get(2).getDistribucion().get("arriba-de").getValue()+"   ");

        System.out.print("   "+container.getPiezas().get(0).getDistribucion().get("abajo-iz").getValue());
        System.out.print(" "+container.getPiezas().get(0).getDistribucion().get("abajo").getValue());
        System.out.print(" "+container.getPiezas().get(0).getDistribucion().get("abajo-de").getValue()+"   ");

        System.out.print("   "+container.getPiezas().get(1).getDistribucion().get("abajo-iz").getValue());
        System.out.print(" "+container.getPiezas().get(1).getDistribucion().get("abajo").getValue());
        System.out.print(" "+container.getPiezas().get(1).getDistribucion().get("abajo-de").getValue()+"   ");

        System.out.print("   "+container.getPiezas().get(2).getDistribucion().get("abajo-iz").getValue());
        System.out.print(" "+container.getPiezas().get(2).getDistribucion().get("abajo").getValue());
        System.out.print(" "+container.getPiezas().get(2).getDistribucion().get("abajo-de").getValue()+"   ");
    }
    
}
