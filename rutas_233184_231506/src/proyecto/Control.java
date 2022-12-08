/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import implementaciones.NoDiGraph;
import java.util.Scanner;
import implementaciones.LinkedList;
import excepciones.GraphException;
import java.util.HashMap;

/**
 *
 * @author Edgar Emir Borbon Jimenez 00000233184
 */
public class Control {

    private Scanner c = new Scanner(System.in);
    private NoDiGraph<String, String, Double> grafo;
    private int cont;
    private int max;
    private String city;

    public Control(int cantCiudades) {
        this.grafo = new NoDiGraph<>(cantCiudades);
        max = cantCiudades;
        cont = 0;

    }

    public void addCity() {
        if (cont == max) {
            System.out.println("Cupo lleno elimina registros de Ciudades para agregar otra ciudad...");
            return;
        }
        System.out.println("Ingresa le ciudad:");
        city = c.nextLine();
        grafo.addVertex(city);
        System.out.println("Se agrego con exito");
        cont++;
    }

    public void addColindancia() {
        try {
            System.out.println("Ingresa la primer ciudad:");
            String c1 = c.nextLine();
            System.out.println(c1);
            System.out.println("Ingresa la segunda ciudad:");
            String c2 = c.nextLine();
            grafo.addEdge(c1, c2);

            System.out.println("Se agrego con exito");
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    public String listCities() {
        return grafo.getVertices().toString();
    }

    public NoDiGraph listColindancias() {
        return grafo;
    }

    public void addDistance() {
        try {
            System.out.println("Ingresa la primer ciudad:");
            String c1 = c.nextLine();
            System.out.println(c1);
            System.out.println("Ingresa la segunda ciudad:");
            String c2 = c.nextLine();
            System.out.println("Ingresa la distancia entre las dos ciudades:");
            double distance = c.nextDouble();
            grafo.setEdgeValue(c1, c2, "D", distance);
            System.out.println("Ingresa el costo de peaje entre las dos ciudades:");
            double peaje = c.nextDouble();
            grafo.setEdgeValue(c1, c2, "P", peaje);
            c.nextLine();

            System.out.println("Se agrego con exito");
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    public void caminoCorto() {
        try {
            System.out.println("Ingresa ciudad de Inicios:");
            String c1 = c.nextLine();
            System.out.println(c1);
            System.out.println("Ingresa la ciudad de Destino:");
            String c2 = c.nextLine();
            System.out.println(c2);
            
            System.out.println(grafo.Dijstra(c1, c2).toString());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
