import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class main {
    public static void main(String[] args){
        
        //ObjetosPrincipa;es
        GamePrinter printer = new GamePrinter();
        ContainerPieza container = new ContainerPieza(3);
        CreadorHexagono creador = new CreadorHexagono();
        GameManager gameManager = new GameManager();
        Matcher matcher = new Matcher();
        Puntaje puntaje = new Puntaje(0);
        Comodines basurero = new Basurero(100);
        Comodines martillo= new Martillo(200);
        GameEnder gameEnder = new GameEnder();
        Scanner scanner = new Scanner(System.in);

        //Objetos para comparar
        Ficha emptyFicha = new Ficha<String>("0");
        DistribucionPieza emptyDist = new DistHexagono(emptyFicha,emptyFicha,emptyFicha,emptyFicha,emptyFicha,emptyFicha);
        
    

        Ficha f0 = new Ficha<String>("0");
        Ficha f1 = new Ficha<String>("0");
        Ficha f2 = new Ficha<String>("0");
        Ficha f3 = new Ficha<String>("0");
        Ficha f4 = new Ficha<String>("0");
        Ficha f5 = new Ficha<String>("0");
        Ficha f6 = new Ficha<String>("0");
        Ficha f7 = new Ficha<String>("0");
        Ficha f8 = new Ficha<String>("0");
        Ficha f9 = new Ficha<String>("0");
        Ficha f10 = new Ficha<String>("0");
        Ficha f11 = new Ficha<String>("0");
        Ficha f12 = new Ficha<String>("0");
        Ficha f13 = new Ficha<String>("0");
        Ficha f14 = new Ficha<String>("0");
        Ficha f15 = new Ficha<String>("0");
        Ficha f16 = new Ficha<String>("0");
        Ficha f17 = new Ficha<String>("0");
        Ficha f18 = new Ficha<String>("0");
        Ficha f19 = new Ficha<String>("0");
        Ficha f20 = new Ficha<String>("0");
        Ficha f21 = new Ficha<String>("0");
        Ficha f22 = new Ficha<String>("0");
        Ficha f23 = new Ficha<String>("0");
        Ficha f24 = new Ficha<String>("0");
        Ficha f25 = new Ficha<String>("0");
        Ficha f26 = new Ficha<String>("0");
        Ficha f27 = new Ficha<String>("0");
        Ficha f28 = new Ficha<String>("0");
        Ficha f29 = new Ficha<String>("0");
        Ficha f30 = new Ficha<String>("0");
        Ficha f31 = new Ficha<String>("0");
        Ficha f32 = new Ficha<String>("0");
        Ficha f33 = new Ficha<String>("0");
        Ficha f34 = new Ficha<String>("0");
        Ficha f35 = new Ficha<String>("0");
        Ficha f36 = new Ficha<String>("0");
        Ficha f37 = new Ficha<String>("0");
        Ficha f38 = new Ficha<String>("0");
        Ficha f39 = new Ficha<String>("0");
        Ficha f40 = new Ficha<String>("0");
        Ficha f41 = new Ficha<String>("0");
        Ficha f42 = new Ficha<String>("0");
        Ficha f43 = new Ficha<String>("0");
        Ficha f44 = new Ficha<String>("0");
        Ficha f45 = new Ficha<String>("0");
        Ficha f46 = new Ficha<String>("0");
        Ficha f47 = new Ficha<String>("0");
        Ficha f48 = new Ficha<String>("0");
        Ficha f49 = new Ficha<String>("0");
        Ficha f50 = new Ficha<String>("0");
        Ficha f51 = new Ficha<String>("0");
        Ficha f52 = new Ficha<String>("0");
        Ficha f53 = new Ficha<String>("0");
    
        Triangulo v0 = new Triangulo();
        Triangulo v1 = new Triangulo();
        Triangulo v2 = new Triangulo();
        Triangulo v3 = new Triangulo();
        Triangulo v4 = new Triangulo();
        Triangulo v5 = new Triangulo();
        Triangulo v6 = new Triangulo();
        Triangulo v7 = new Triangulo();
        Triangulo v8 = new Triangulo();
        Triangulo v9 = new Triangulo();
        Triangulo v10 = new Triangulo();
        Triangulo v11 = new Triangulo();
        Triangulo v12 = new Triangulo();
        Triangulo v13 = new Triangulo();
        Triangulo v14 = new Triangulo();
        Triangulo v15 = new Triangulo();
        Triangulo v16 = new Triangulo();
        Triangulo v17 = new Triangulo();
        Triangulo v18 = new Triangulo();
        Triangulo v19 = new Triangulo();
        Triangulo v20 = new Triangulo();
        Triangulo v21 = new Triangulo();
        Triangulo v22 = new Triangulo();
        Triangulo v23 = new Triangulo();
        Triangulo v24 = new Triangulo();
        Triangulo v25 = new Triangulo();
        Triangulo v26 = new Triangulo();
        Triangulo v27 = new Triangulo();
        Triangulo v28 = new Triangulo();
        Triangulo v29 = new Triangulo();
        Triangulo v30 = new Triangulo();
        Triangulo v31 = new Triangulo();
        Triangulo v32 = new Triangulo();
        Triangulo v33 = new Triangulo();
        Triangulo v34 = new Triangulo();
        Triangulo v35 = new Triangulo();
        Triangulo v36 = new Triangulo();
        Triangulo v37 = new Triangulo();
        Triangulo v38 = new Triangulo();
        Triangulo v39 = new Triangulo();
        Triangulo v40 = new Triangulo();
        Triangulo v41 = new Triangulo();
        Triangulo v42 = new Triangulo();
        Triangulo v43 = new Triangulo();
        Triangulo v44 = new Triangulo();
        Triangulo v45 = new Triangulo();
        Triangulo v46 = new Triangulo();
        Triangulo v47 = new Triangulo();
        Triangulo v48 = new Triangulo();
        Triangulo v49 = new Triangulo();
        Triangulo v50 = new Triangulo();
        Triangulo v51 = new Triangulo();
        Triangulo v52 = new Triangulo();
        Triangulo v53 = new Triangulo();
    
        Casilla c0 = new Casilla<Ficha,String,Triangulo>(f0,v0);
        Casilla c1 = new Casilla<Ficha,String,Triangulo>(f1,v1);
        Casilla c2 = new Casilla<Ficha,String,Triangulo>(f2,v2);
        Casilla c3 = new Casilla<Ficha,String,Triangulo>(f3,v3);
        Casilla c4 = new Casilla<Ficha,String,Triangulo>(f4,v4);
        Casilla c5 = new Casilla<Ficha,String,Triangulo>(f5,v5);
        Casilla c6 = new Casilla<Ficha,String,Triangulo>(f6,v6);
        Casilla c7 = new Casilla<Ficha,String,Triangulo>(f7,v7);
        Casilla c8 = new Casilla<Ficha,String,Triangulo>(f8,v8);
        Casilla c9 = new Casilla<Ficha,String,Triangulo>(f9,v9);
        Casilla c10 = new Casilla<Ficha,String,Triangulo>(f10,v10);
        Casilla c11 = new Casilla<Ficha,String,Triangulo>(f11,v11);
        Casilla c12 = new Casilla<Ficha,String,Triangulo>(f12,v12);
        Casilla c13 = new Casilla<Ficha,String,Triangulo>(f13,v13);
        Casilla c14 = new Casilla<Ficha,String,Triangulo>(f14,v14);
        Casilla c15 = new Casilla<Ficha,String,Triangulo>(f15,v15);
        Casilla c16 = new Casilla<Ficha,String,Triangulo>(f16,v16);
        Casilla c17 = new Casilla<Ficha,String,Triangulo>(f17,v17);
        Casilla c18 = new Casilla<Ficha,String,Triangulo>(f18,v18);
        Casilla c19 = new Casilla<Ficha,String,Triangulo>(f19,v19);
        Casilla c20 = new Casilla<Ficha,String,Triangulo>(f20,v20);
        Casilla c21 = new Casilla<Ficha,String,Triangulo>(f21,v21);
        Casilla c22 = new Casilla<Ficha,String,Triangulo>(f22,v22);
        Casilla c23 = new Casilla<Ficha,String,Triangulo>(f23,v23);
        Casilla c24 = new Casilla<Ficha,String,Triangulo>(f24,v24);
        Casilla c25 = new Casilla<Ficha,String,Triangulo>(f25,v25);
        Casilla c26 = new Casilla<Ficha,String,Triangulo>(f26,v26);
        Casilla c27 = new Casilla<Ficha,String,Triangulo>(f27,v27);
        Casilla c28 = new Casilla<Ficha,String,Triangulo>(f28,v28);
        Casilla c29 = new Casilla<Ficha,String,Triangulo>(f29,v29);
        Casilla c30 = new Casilla<Ficha,String,Triangulo>(f30,v30);
        Casilla c31 = new Casilla<Ficha,String,Triangulo>(f31,v31);
        Casilla c32 = new Casilla<Ficha,String,Triangulo>(f32,v32);
        Casilla c33 = new Casilla<Ficha,String,Triangulo>(f33,v33);
        Casilla c34 = new Casilla<Ficha,String,Triangulo>(f34,v34);
        Casilla c35 = new Casilla<Ficha,String,Triangulo>(f35,v35);
        Casilla c36 = new Casilla<Ficha,String,Triangulo>(f36,v36);
        Casilla c37 = new Casilla<Ficha,String,Triangulo>(f37,v37);
        Casilla c38 = new Casilla<Ficha,String,Triangulo>(f38,v38);
        Casilla c39 = new Casilla<Ficha,String,Triangulo>(f39,v39);
        Casilla c40 = new Casilla<Ficha,String,Triangulo>(f40,v40);
        Casilla c41 = new Casilla<Ficha,String,Triangulo>(f41,v41);
        Casilla c42 = new Casilla<Ficha,String,Triangulo>(f42,v42);
        Casilla c43 = new Casilla<Ficha,String,Triangulo>(f43,v43);
        Casilla c44 = new Casilla<Ficha,String,Triangulo>(f44,v44);
        Casilla c45 = new Casilla<Ficha,String,Triangulo>(f45,v45);
        Casilla c46 = new Casilla<Ficha,String,Triangulo>(f46,v46);
        Casilla c47 = new Casilla<Ficha,String,Triangulo>(f47,v47);
        Casilla c48 = new Casilla<Ficha,String,Triangulo>(f48,v48);
        Casilla c49 = new Casilla<Ficha,String,Triangulo>(f49,v49);
        Casilla c50 = new Casilla<Ficha,String,Triangulo>(f50,v50);
        Casilla c51 = new Casilla<Ficha,String,Triangulo>(f51,v51);
        Casilla c52 = new Casilla<Ficha,String,Triangulo>(f52,v52);
        Casilla c53 = new Casilla<Ficha,String,Triangulo>(f53,v53);
    
        v0.putVecinos(null,c8,c1);
        v1.putVecinos(c0,null,c2);
        v2.putVecinos(c1,c10,c3);
        v3.putVecinos(c2,null,c4);
        v4.putVecinos(c3,c12,c5);
        v5.putVecinos(c4,null,c6);
        v6.putVecinos(c5,c14,null);
        v7.putVecinos(null,c17,c8);
        v8.putVecinos(c7,c0,c9);
        v9.putVecinos(c8,c19,c10);
        v10.putVecinos(c9,c2,c11);
        v11.putVecinos(c10,c21,c12);
        v12.putVecinos(c11,c4,c13);
        v13.putVecinos(c12,c23,c14);
        v14.putVecinos(c13,c6,c15);
        v15.putVecinos(c14,c25,null);
        v16.putVecinos(null,c27,c17);
        v17.putVecinos(c16,c7,c18);
        v18.putVecinos(c17,c29,c19);
        v19.putVecinos(c18,c9,c20);
        v20.putVecinos(c19,c31,c21);
        v21.putVecinos(c20,c11,c22);
        v22.putVecinos(c21,c33,c23);
        v23.putVecinos(c22,c13,c24);
        v24.putVecinos(c23,c35,c25);
        v25.putVecinos(c24,c15,c26);
        v26.putVecinos(c25,c37,null);
        v27.putVecinos(null,c16,c28);
        v28.putVecinos(c27,c38,c29);
        v29.putVecinos(c28,c18,c30);
        v30.putVecinos(c29,c40,c31);
        v31.putVecinos(c30,c20,c32);
        v32.putVecinos(c31,c42,c33);
        v33.putVecinos(c32,c22,c34);
        v34.putVecinos(c33,c44,c35);
        v35.putVecinos(c34,c24,c36);
        v36.putVecinos(c35,c46,c37);
        v37.putVecinos(c36,c26,null);
        v38.putVecinos(null,c28,c39);
        v39.putVecinos(c38,c47,c40);
        v40.putVecinos(c39,c30,c41);
        v41.putVecinos(c40,c49,c42);
        v42.putVecinos(c41,c32,c43);
        v43.putVecinos(c42,c51,c44);
        v44.putVecinos(c43,c34,c45);
        v45.putVecinos(c44,c53,c46);
        v46.putVecinos(c45,c36,null);
        v47.putVecinos(null,c39,c48);
        v48.putVecinos(c47,null,c49);
        v49.putVecinos(c48,c41,c50);
        v50.putVecinos(c49,null,c51);
        v51.putVecinos(c50,c43,c52);
        v52.putVecinos(c51,null,c53);
        v53.putVecinos(c52,c45,null);
    
        c0.setVecinos(v0);
        c1.setVecinos(v1);
        c2.setVecinos(v2);
        c3.setVecinos(v3);
        c4.setVecinos(v4);
        c5.setVecinos(v5);
        c6.setVecinos(v6);
        c7.setVecinos(v7);
        c8.setVecinos(v8);
        c9.setVecinos(v9);
        c10.setVecinos(v10);
        c11.setVecinos(v11);
        c12.setVecinos(v12);
        c13.setVecinos(v13);
        c14.setVecinos(v14);
        c15.setVecinos(v15);
        c16.setVecinos(v16);
        c17.setVecinos(v17);
        c18.setVecinos(v18);
        c19.setVecinos(v19);
        c20.setVecinos(v20);
        c21.setVecinos(v21);
        c22.setVecinos(v22);
        c23.setVecinos(v23);
        c24.setVecinos(v24);
        c25.setVecinos(v25);
        c26.setVecinos(v26);
        c27.setVecinos(v27);
        c28.setVecinos(v28);
        c29.setVecinos(v29);
        c30.setVecinos(v30);
        c31.setVecinos(v31);
        c32.setVecinos(v32);
        c33.setVecinos(v33);
        c34.setVecinos(v34);
        c35.setVecinos(v35);
        c36.setVecinos(v36);
        c37.setVecinos(v37);
        c38.setVecinos(v38);
        c39.setVecinos(v39);
        c40.setVecinos(v40);
        c41.setVecinos(v41);
        c42.setVecinos(v42);
        c43.setVecinos(v43);
        c44.setVecinos(v44);
        c45.setVecinos(v45);
        c46.setVecinos(v46);
        c47.setVecinos(v47);
        c48.setVecinos(v48);
        c49.setVecinos(v49);
        c50.setVecinos(v50);
        c51.setVecinos(v51);
        c52.setVecinos(v52);
        c53.setVecinos(v53);
        
        HashMap<String,Casilla> tablero = new HashMap<>();
        tablero.put("0", c0);
        tablero.put("1", c1);
        tablero.put("2", c2);
        tablero.put("3", c3);
        tablero.put("4", c4);
        tablero.put("5", c5);
        tablero.put("6", c6);
        tablero.put("7", c7);
        tablero.put("8", c8);
        tablero.put("9", c9);
        tablero.put("10", c10);
        tablero.put("11", c11);
        tablero.put("12", c12);
        tablero.put("13", c13);
        tablero.put("14", c14);
        tablero.put("15", c15);
        tablero.put("16", c16);
        tablero.put("17", c17);
        tablero.put("18", c18);
        tablero.put("19", c19);
        tablero.put("20", c20);
        tablero.put("21", c21);
        tablero.put("22", c22);
        tablero.put("23", c23);
        tablero.put("24", c24);
        tablero.put("25", c25);
        tablero.put("26", c26);
        tablero.put("27", c27);
        tablero.put("28", c28);
        tablero.put("29", c29);
        tablero.put("30", c30);
        tablero.put("31", c31);
        tablero.put("32", c32);
        tablero.put("33", c33);
        tablero.put("34", c34);
        tablero.put("35", c35);
        tablero.put("36", c36);
        tablero.put("37", c37);
        tablero.put("38", c38);
        tablero.put("39", c39);
        tablero.put("40", c40);
        tablero.put("41", c41);
        tablero.put("42", c42);
        tablero.put("43", c43);
        tablero.put("44", c44);
        tablero.put("45", c45);
        tablero.put("46", c46);
        tablero.put("47", c47);
        tablero.put("48", c48);
        tablero.put("49", c49);
        tablero.put("50", c50);
        tablero.put("51", c51);
        tablero.put("52", c52);
        tablero.put("53", c53);

        //Casos de Prueba
        f0.setValue("1");
        f1.setValue("1");
        f3.setValue("1");
        f4.setValue("1");
        f7.setValue("1");
        f8.setValue("1");
        f9.setValue("1");
        f10.setValue("1");
        f11.setValue("1");
        f12.setValue("1");
        f18.setValue("1");
        f19.setValue("1");
        f20.setValue("1");
        f5.setValue("5");
        f6.setValue("5");
        f13.setValue("5");
        f14.setValue("5");
        f21.setValue("5");
        f22.setValue("5");
        f23.setValue("5");
        f33.setValue("5");
        f24.setValue("2");
        f25.setValue("2");
        f26.setValue("2");
        f37.setValue("2");
        f51.setValue("3");
        f52.setValue("3");
        f53.setValue("3");
        f32.setValue("4");
        f42.setValue("4");
        f43.setValue("4");
        f47.setValue("6");
        f39.setValue("6");
        f40.setValue("6");
        f41.setValue("6");
        f50.setValue("6");    
        //--------------

        while(gameEnder.endGame(c0, emptyFicha, container.getPiezas(),emptyDist)){
            printer.printGame(container, puntaje, martillo, basurero,c0,c7,c16,c27,c38,c47);
            System.out.print(">>>");
            String op = scanner.nextLine();
            switch(op){
                case "1":
                    System.out.print(">>>");
                    op = scanner.nextLine();
                    gameManager.play(tablero.get(op), container.get(0), matcher, container, emptyFicha, emptyDist, puntaje);
                    break;
                case "2":
                    System.out.print(">>>");
                    op = scanner.nextLine();
                    gameManager.play(tablero.get(op), container.get(1), matcher, container, emptyFicha, emptyDist, puntaje);
                    break;
                case "3":
                    System.out.print(">>>");
                    op = scanner.nextLine();
                    gameManager.play(tablero.get(op), container.get(2), matcher, container, emptyFicha, emptyDist, puntaje);
                    break;
                case "4":
                    System.out.print(">>>");
                    op = scanner.nextLine();
                    switch(op){
                        case "1":
                            container.get(0).rotate();
                            break;
                        case "2":
                            container.get(1).rotate();
                            break;
                        case "3":
                            container.get(2).rotate();
                            break;
                    }
                    break;
                case "5":
                    System.out.print(">>>");
                    op = scanner.nextLine();
                    gameManager.aplicarComodin(tablero.get(op), emptyFicha,martillo,puntaje);
                    break;
                case "6":
                    System.out.print(">>>");
                    int op1 = scanner.nextInt();
                    gameManager.aplicarComodin(container.get(op1-1), container, basurero, puntaje);
                    break;    
            }
        }
        printer.printGame(container, puntaje, martillo,basurero,c0,c7,c16,c27,c38,c47);
        System.out.println("Game Over");
    }
}