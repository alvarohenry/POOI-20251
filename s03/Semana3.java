package pe.usil.estudiante.semana3;

import java.util.Scanner;

public class Semana3 {

    public static void main(String[] args) {
        int NZ, PE;
        double CO = 0.0;
        
        Scanner sc = new Scanner(System.in);
        //leer la zona
        System.out.println("Introduce el numero de la Zona(NZ):");
        NZ = sc.nextInt(); // lee un entero por teclado
        
        //leer el numero
        System.out.println("Introduce el peso del paquete(PE):");
        PE = sc.nextInt(); // lee un entero por teclado
        
        if(PE >= 5000) {
            System.out.print("No se puede dar el servicio");
        } else {
            switch(NZ) {
                case 1:
                    CO = PE * 11;
                case 2:
                    CO = PE * 10;
                case 3:
                    CO = PE * 12;
                case 4:
                    CO = PE * 24;
                default:
                    CO = PE * 27;
            }
            // mostrar resultado
            System.out.println("El costo del servicio es S/ " + CO);
        }
    }
}
