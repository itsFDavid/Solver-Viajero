/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solver.viajero.beta;

/**
 *
 * @author francisco
 */
public class city {

    private String nameCity;
    private double travelPrice;
    private int numberOfCity;
    private static int cityCounter = 0; // Variable estática para contar el número de ciudades

    public city(String nameCity, double travelPrice) {
        this.nameCity = nameCity;
        this.travelPrice = travelPrice;
        cityCounter++; // Incrementa el contador de ciudades cada vez que se crea una nueva instancia
        this.numberOfCity = cityCounter; // Asigna el número de la ciudad automáticamente
    }

    public String getNameCity() {
        return nameCity;
    }

    public void setNameCity(String nameCity) {
        this.nameCity = nameCity;
    }

    public double getTravelPrice() {
        return travelPrice;
    }

    public void setTravelPrice(double travelPrice) {
        this.travelPrice = travelPrice;
    }

    public int getNumberOfCity() {
        return numberOfCity;
    }

    public void setNumberOfCity(int numberOfCity) {
        this.numberOfCity = numberOfCity;
    }

    public static int getTotalCities() {
        return cityCounter;
    }
}
