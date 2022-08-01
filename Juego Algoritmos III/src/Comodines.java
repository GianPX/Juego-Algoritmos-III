public class Comodines {
    int vecesUsadoBasurero;
    int vecesUsadoMartillo;

    
    public Comodines(int vecesUsadoBasurero, int vecesUsadoMartillo) {
        this.vecesUsadoBasurero = vecesUsadoBasurero;
        this.vecesUsadoMartillo = vecesUsadoMartillo;
    }

    public void Basurero(ContainerPieza c, Pieza p,Puntaje puntaje){
        if(puntaje.puntos>=(100*this.vecesUsadoBasurero)){
            c.delete(p);
            c.refill();
            puntaje.setPuntos(puntaje.puntos-(100*this.vecesUsadoBasurero));
            this.vecesUsadoBasurero ++;

        }
    }

    public void Martillo(Ficha f, Casilla c, Puntaje puntaje){
        if(!(c.getFicha().getValue().equals(f.value)))  {         
          if(puntaje.puntos>=(200*this.vecesUsadoMartillo)){
            c.setFicha(f);
            puntaje.setPuntos(puntaje.puntos-(200*this.vecesUsadoMartillo));
            this.vecesUsadoMartillo ++;
          }
        }
    
    }

    
}
