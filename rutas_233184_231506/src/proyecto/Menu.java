/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto;

import java.util.Scanner;

/**
 *
 * @author Edgar Emir Borbon Jimenez 00000233184
 */
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Control control = new Control(6);
        Scanner c = new Scanner(System.in);

        int op = menu();
        while (op != 10) {
            switch (op) {
                case 1:
                    control.addCity();
                    System.out.println("Presiona Enter para continuar...");
                    c.nextLine();
                    op = menu();
                    break;
                case 2:
                    control.addColindancia();
                    System.out.println("Presiona Enter para continuar...");
                    c.nextLine();
                    op = menu();

                    break;
                case 3:
                    control.addDistance();
                    System.out.println("Presiona Enter para continuar...");
                    c.nextLine();
                    op = menu();

                    break;
                case 4:
                    op = menu();

                    break;
                case 5:
                    control.caminoCorto();
                    System.out.println("Presiona Enter para continuar...");
                    c.nextLine();
                    op = menu();

                    break;
                case 6:
                    op = menu();

                    break;
                case 7:
                    System.out.println("Ciudades Registradas");
                    System.out.println(control.listCities());
                    System.out.println("\nColindancias Registradas");
                    System.out.println(control.listColindancias());

                    System.out.println("Presiona Enter para continuar...");
                    c.nextLine();
                    op = menu();

                    break;
                case 8:
                    op = menu();

                    break;
                case 9:
                    op = menu();

                    break;
                default:
                    throw new AssertionError();
            }

        }

    }

    public static int menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nIngresa el numero de la accion deseada:");
        System.out.println("\n1) Agregar una ciudad");
        System.out.println("\n2) Registrar una colindancia entre dos ciudades");
        System.out.println("\n3) Registrar distancia y costo de peaje entre dos ciudades colindantes");
        System.out.println("\n4) Modificar distancia y costo de peaje entre dos ciudades colindantes");
        System.out.println("\n5) Consultar ruta más corta entre dos ciudades");
        System.out.println("\n6) Consultar ruta más barata entre dos ciudades");
        System.out.println("\n7) Listar las ciudades registradas y sus colindancias");
        System.out.println("\n8) Eliminar colindancia");
        System.out.println("\n9) Eliminar una ciudad del mapa");
        System.out.println("\n10) Salir");
        System.out.println("\n\nInsert...");
        int opcion = sc.nextInt();
        return opcion;
    }

}
