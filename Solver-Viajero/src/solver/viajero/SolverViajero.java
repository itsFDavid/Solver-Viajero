/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package solver.viajero;


import solver.viajero.flightPlan;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author francisco
 */
public class SolverViajero {
    public static void main(String[] args) {
        flightPlan plan = new flightPlan("", 0.0);

        // Agregar algunas ciudades (esto puede ser en otro método o parte de tu aplicación)
        plan.addCity();
        plan.addCity();

        // Realizar una búsqueda por nombre de ciudad
        System.out.println("Ingrese el nombre de la ciudad a buscar: ");
        String cityName = plan.scanner.nextLine();
        plan.searchCityByName(cityName);
    }
}