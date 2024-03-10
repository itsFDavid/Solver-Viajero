/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solver.viajero;

public class matrizCities {
    private double[][] prices;
    private flightPlan plan; // Instancia de flightPlan
    
    public matrizCities(flightPlan plan) {
        this.plan = plan;
    }
    
    public void setMatriz() {
        int totalCities = plan.totalCities();
        prices = new double[totalCities][totalCities]; // Inicializa el array prices
        
        for (int i = 0; i < totalCities; i++) {
            for (int j = 0; j < totalCities; j++) {
                // Calcular el precio de vuelo entre las ciudades i y j
                double price = calculateFlightPrice(plan.getCity(i).getNameCity(), plan.getCity(j).getNameCity());
                prices[i][j] = price;
            }
        }
    }

    // Método privado para calcular el precio de vuelo entre dos ciudades
    private double calculateFlightPrice(String city1, String city2) {
        // Aquí deberías implementar la lógica para calcular el precio de vuelo entre las ciudades city1 y city2
        // Por ahora, simplemente devolvemos un valor predeterminado.
        return 100.0; // Precio de vuelo predeterminado
    }

    public double[][] getPrices() {
        return prices;
    }
}