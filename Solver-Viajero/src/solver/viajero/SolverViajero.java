package solver.viajero;

public class SolverViajero {
    public static void main(String[] args) {
        flightPlan plan = new flightPlan();
        matrizCities matriz = new matrizCities(plan);
        // Agregar algunas ciudades
        for (int i = 0; i < 5; i++) {
            plan.addCity();
        }

        // Realizar una búsqueda por nombre de ciudad
        System.out.println("Ingrese el nombre de la ciudad a buscar: ");
        String cityName = plan.scanner.nextLine();
        plan.searchCityByName(cityName);
        System.out.println("El numero total de ciudades es: " + plan.totalCities());

        // Configurar la matriz de precios
        matriz.setMatriz();
        double[][] prices = matriz.getPrices();

        // Mostrar la matriz de precios
        for (int i = 0; i < plan.totalCities(); i++) {
            for (int j = 0; j < plan.totalCities(); j++) {
                System.out.print(prices[i][j] + " | ");
            }
            System.out.println();
        }
    }
}