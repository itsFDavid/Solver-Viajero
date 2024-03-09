/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solver.viajero.beta;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class flightPlan extends city {
    private List<city> cities; // Lista de ciudades
    Scanner scanner = new Scanner(System.in);

    public flightPlan(String nameCity, double travelPrice) {
        super(nameCity, travelPrice);
        cities = new ArrayList<>(); // Inicializar la lista de ciudades
    }

    void addCity() {
        System.out.println("Ingrese el nombre de la ciudad: ");
        String name = scanner.nextLine();
        System.out.println("Ingrese el precio de vuelo: ");
        int price = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer del scanner

        city city = new city(name, price);
        cities.add(city);
    }

    void searchCityByName(String cityName) {
        for (city city : cities) {
            if (city.getNameCity().equalsIgnoreCase(cityName)) {
                System.out.println("Ciudad encontrada:");
                System.out.println("Nombre: " + city.getNameCity());
                System.out.println("Precio de vuelo: " + city.getTravelPrice());
                return; // Salir del método si la ciudad es encontrada
            }
        }
        System.out.println("La ciudad no fue encontrada.");
    }

}