/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.solver.viajero;

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
