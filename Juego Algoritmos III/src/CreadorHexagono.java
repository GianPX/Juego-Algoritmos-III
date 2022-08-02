import java.util.Random;

public class CreadorHexagono implements CreadorPieza{
    //Attributes

    //Constructor
    public CreadorHexagono(){

    }
    //Methods
    public Pieza createPieza(){
        Random random = new Random();
        int n1 = random.nextInt(6)+1;
        int n2 = random.nextInt(7)+1;

        Ficha f1;
        Ficha f2;
        Ficha f3;
        Ficha f4;
        Ficha f5;
        Ficha f6;
        Pieza pieza;
        switch (n2){
            case 1:
                f1 = new Ficha(String.valueOf(n1));
                f2 = new Ficha("0");
                f3 = new Ficha("0");
                f4 = new Ficha("0");
                f5 = new Ficha("0");
                f6 = new Ficha("0");
                break;
            case 2:
                f1 = new Ficha(String.valueOf(n1));
                f2 = new Ficha(String.valueOf(n1));
                f3 = new Ficha("0");
                f4 = new Ficha("0");
                f5 = new Ficha("0");
                f6 = new Ficha("0");
                break;
            case 3:
                f1 = new Ficha(String.valueOf(n1));
                f2 = new Ficha("0");
                f3 = new Ficha(String.valueOf(n1));
                f4 = new Ficha("0");
                f5 = new Ficha("0");
                f6 = new Ficha("0");
                break;
            case 4:
                f1 = new Ficha(String.valueOf(n1));
                f2 = new Ficha(String.valueOf(n1));
                f3 = new Ficha(String.valueOf(n1));
                f4 = new Ficha("0");
                f5 = new Ficha("0");
                f6 = new Ficha("0");
                break;
            case 5:
                f1 = new Ficha(String.valueOf(n1));
                f2 = new Ficha("0");
                f3 = new Ficha(String.valueOf(n1));
                f4 = new Ficha("0");
                f5 = new Ficha(String.valueOf(n1));
                f6 = new Ficha("0");
                break;
            case 6:
                f1 = new Ficha(String.valueOf(n1));
                f2 = new Ficha(String.valueOf(n1));
                f3 = new Ficha(String.valueOf(n1));
                f4 = new Ficha(String.valueOf(n1));
                f5 = new Ficha("0");
                f6 = new Ficha("0");
                break;
            case 7:
                f1 = new Ficha(String.valueOf(n1));
                f2 = new Ficha(String.valueOf(n1));
                f3 = new Ficha(String.valueOf(n1));
                f4 = new Ficha(String.valueOf(n1));
                f5 = new Ficha(String.valueOf(n1));
                f6 = new Ficha("0");
                break;
            default:
                f1 = new Ficha("0");
                f2 = new Ficha("0");
                f3 = new Ficha("0");
                f4 = new Ficha("0");
                f5 = new Ficha("0");
                f6 = new Ficha("0");
                break;
        }

        DistHexagono distribucion = new DistHexagono(f1,f2,f3,f4,f5,f6);
        pieza = new Pieza(distribucion);
        n1 = random.nextInt(6)+1;
        for(int i=0; i<=n1; i++){
            pieza.rotate();
        }
        return pieza;
    }
}
