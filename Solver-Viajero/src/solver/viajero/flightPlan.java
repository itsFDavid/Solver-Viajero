package solver.viajero;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class flightPlan {
    private List<city> cities; // Lista de ciudades
    Scanner scanner = new Scanner(System.in);

    public flightPlan() {
        cities = new ArrayList<>(); // Inicializar la lista de ciudades
    }

    public void addCity() {
        System.out.println("Ingrese el nombre de la ciudad: ");
        String name = scanner.nextLine();
        System.out.println("Ingrese el precio de vuelo: ");
        double price = scanner.nextDouble();
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
    
    public int totalCities(){
        return cities.size();
    }

    // Agrega un método para obtener la ciudad en una posición específica de la lista
    public city getCity(int index) {
        return cities.get(index);
    }
}