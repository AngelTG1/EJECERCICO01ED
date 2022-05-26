package com.upchiapas.gastronimia;

import com.upchiapas.gastronimia.modelos.Participante;

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
                        System.out.println("2: VISUALIZAR  partisipantes");
                        System.out.println("3: salir");
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

                                        break;
                        }
                }while (opcion!=3);
        }






        static Participante objectoPaticipante;
        static Participante[] arregloA;

        public static void registrarParticioantes(){
                String nom;
                String lugar;

                System.out.println("Participantes: ");
                Scanner entrada = new Scanner(System.in);
                cantidad = entrada.nextInt();
                arregloA = new Participante[cantidad];
                for(int i = 0; i < cantidad; i++){
                        System.out.println("Nombre: ");
                        nom = entrada.next();
                        System.out.println("Lugar de origen: ");
                        lugar = entrada.next();
                        objectoPaticipante = new Participante(nom, lugar);
                        arregloA[i] = objectoPaticipante;
                }


        }
public static void visualizarParticipantes(int cantidad){
                for (int i=0;i <cantidad;i++){
                        System.out.println("*+++++++++++++++++++++++++");
                        System.out.println("participante: "+(i+1));
                        System.out.println("Nombre: "+arregloA[i].getNombre());
                        System.out.println("Lugar de origen: "+arregloA[i].getLugar());
                }
}


}
