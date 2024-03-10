package solver.viajero;

public class city {
    private String nameCity;
    private double travelPrice;

    public city(String nameCity, double travelPrice) {
        this.nameCity = nameCity;
        this.travelPrice = travelPrice;
    }

    public String getNameCity() {
        return nameCity;
    }

    public double getTravelPrice() {
        return travelPrice;
    }
}
