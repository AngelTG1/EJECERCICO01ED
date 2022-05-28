package com.upchiapas.gastronimia;

import com.upchiapas.gastronimia.modelos.Participante;
import com.upchiapas.gastronimia.modelos.Postre;

import java.util.Scanner;

public class Main {
        public static void main(String[] args){
                VisualizarMenu();

        }
        public static int cantidad;
        public static void VisualizarMenu(){
                int opcion;
                do {
                        System.out.println("elige una opcion");
                        System.out.println("1: REGISTAR USUARIO");
                        System.out.println("2: VISUALIZAR todos partisipantes");
                        System.out.println("3: ver registo de una participante con su prostre");
                        System.out.println("4: salir");
                        System.out.print("Selecciones una opcion: ");
                        Scanner entrada = new Scanner(System.in);
                        opcion = entrada.nextInt();
                        switch (opcion) {
                                case 1:
                                        registrarParticioantes();
                                        break;
                                case 2:
                                        visualizarParticipantes(cantidad);
                                        break;
                                case 3:
                                        System.out.println("ingresa un folio");
                                        int opcion1;
                                        opcion1=entrada.nextInt();
                                        buscarParticipante(opcion1);
                                        break;
                                case 4:
                                        break;
                        }
                }while (opcion!=4);
        }






        static Participante objectoPaticipante;
        static Participante[] arregloA;
        static Postre objectoPostre;
        static Postre[] arregloPostre;
        public static void registrarParticioantes(){
                String nom,nombre;

                String lugar;
                String ingredientes;
                int folio = 0;
                System.out.println("agrega la cantidad de participantes ");

                Scanner entrada = new Scanner(System.in);
                cantidad = entrada.nextInt();
                arregloA = new Participante[cantidad];
                arregloPostre=new Postre[cantidad];
                for(int i = 0; i < cantidad; i++){
                        System.out.println("//////////// ");
                        System.out.println("Participantes "+(i+1)+": ");
                        System.out.println("Nombre :");
                        nom = entrada.next();
                        System.out.println("Lugar de origen: ");
                        lugar = entrada.next();
                        folio = (int) (Math.random() * 100);
                        objectoPaticipante = new Participante(nom, lugar, folio);
                        arregloA[i] = objectoPaticipante;
                        registrarPostre(i,folio);
                        EntregarComporvante(i);


                }



        }


        public static void registrarPostre(int i,int folio){
                String nombre;
                String ingredientes;

                Scanner entrada = new Scanner(System.in);
                System.out.println(".....");
                System.out.println("Nombre del postre: ");
                nombre = entrada.next();
                System.out.println("ingredientes ");
                ingredientes = entrada.next();
                System.out.println("Folio: "+folio);
                objectoPostre = new Postre(nombre, ingredientes,folio);
                arregloPostre[i] = objectoPostre;

        }
        public static void visualizarParticipantes(int cantidad){
                for (int i=0;i <cantidad;i++){
                        System.out.println("*+++++++++++++++++++++++++");
                        System.out.println("Folio: "+arregloA[i].getFolio());
                        System.out.println("participante "+(i+1));
                        System.out.println("Nombre del participante: "+arregloA[i].getNombre());
                        System.out.println("Lugar de origen: "+arregloA[i].getLugar());
                        System.out.println("*+++++++++++++++++++++++++");


                }
        }
        public  static void buscarParticipante(int folio){
                for (int i=0;i<cantidad;i++ ){
                        if (arregloA[i].getFolio()==folio){
                                System.out.println("*+++++++++++++++++++++++++");
                                System.out.println("Folio: "+arregloA[i].getFolio());
                                System.out.println("Nombre: "+arregloA[i].getNombre());
                                System.out.println("Lugar de origen: "+arregloA[i].getLugar());
                                System.out.println("Nombre del postre: "+arregloPostre[i].getNombre());
                                System.out.println("Nombre de los Ingredientes: "+arregloPostre[i].getIngredientes());
                                System.out.println("*+++++++++++++++++++++++++");
                        }else{
                                System.out.println("Folio no registrado :( ");
                        }

                }
        }


        public  static void EntregarComporvante(int i){
                System.out.println("/////////////////");
                System.out.println("comprobante");
                System.out.println("Folio: "+arregloA[i].getFolio());
                System.out.println("Nombre: "+arregloA[i].getNombre());
                System.out.println("Lugar de origen: "+arregloA[i].getLugar());
                System.out.println("Nombre del postre: "+arregloPostre[i].getNombre());



        }
}
